package io.BankDataAgregation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyHandler {

	private static Logger logger = LoggerFactory.getLogger(KeyHandler.class.getName());

	public static String getB64fromFile(String filename) {
		String b64 = null;
		PublicKey pubKey = null;
		logger.debug("cert_file: " + filename);
		File file = new File(filename);
		FileInputStream certificate;
		try {
			certificate = new FileInputStream(file);
			CertificateFactory fact = CertificateFactory.getInstance("X.509");
			X509Certificate x509cert = (X509Certificate) fact.generateCertificate(certificate);
			pubKey = x509cert.getPublicKey();
			b64 = Base64.getEncoder().encodeToString(pubKey.getEncoded());
		} catch (FileNotFoundException e) {
			logger.error("Certificate file not found [filename].");
		} catch (CertificateException e) {
			logger.error("Invalid CDC Certificate.");
		} finally {
			if (pubKey == null) {
				logger.error("Could not read the Public Key, please review your configuration");
			}
		}
		return b64;
	}

	public static PrivateKey readPrivateKeyFromKeystore(String keystoreFile, String keystorePassword,
			String keyPassword, String keyAlias) {
		PrivateKey ecKey = null;
		try {
			logger.debug("keystore_file: " + keystoreFile);
			File file = new File(keystoreFile);
			FileInputStream inputStream = new FileInputStream(file);
			KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			keystore.load(inputStream, keystorePassword.toCharArray());
			ecKey = (PrivateKey) keystore.getKey(keyAlias, keyPassword.toCharArray());
		} catch (KeyStoreException e) {
			logger.error("Invalid keystore.");
		} catch (FileNotFoundException e) {
			logger.error("Keystore file not found [keystore_file].");
		} catch (NoSuchAlgorithmException e) {
			logger.error("Keystore algorithm invalid.");
		} catch (CertificateException e) {
			logger.error("Private key invalid to process keystore.");
		} catch (IOException e) {
			logger.error("Error reading the keystore file [keystore_file].");
		} catch (UnrecoverableKeyException e) {
			logger.error("The keystore cannot be recovered.");
		} finally {
			if (ecKey == null) {
				logger.error("Could not read the private key, please review your configuration.");
			}
		}
		return ecKey;
	}

	public static SecretKey generateSharedSecret(PrivateKey priKey, PublicKey publicKey) {
		try {
			KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH",
					new org.bouncycastle.jce.provider.BouncyCastleProvider());
			keyAgreement.init(priKey);
			keyAgreement.doPhase(publicKey, true);

			SecretKey key = keyAgreement.generateSecret("AES");
			return key;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
