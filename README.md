# API Bank Data Aggregation [![GitHub Packages](https://img.shields.io/badge/Maven&nbsp;package-Last&nbsp;version-lemon)](https://github.com/orgs/APIHub-CdC/packages?repo_name=ada-client-java) 



## Requirements

1. Java >= 1.7
2. Maven >= 3.3

## Installation

**Prerequisite**: get access token and access credential settings. Consult the manual **[here](https://github.com/APIHub-CdC/maven-github-packages)**.

**Step 1**: In case the configuration was integrated into the file **settingsAPIHUB.xml** (located in the root of the project), install the dependencies with the following command:

```shell
mvn --settings settingsAPIHUB.xml clean install -Dmaven.test.skip=true
```

**Step 2**: If the configuration was integrated in the  **settings.xml** of the **.m2**, install the dependencies with the following command:

```shell
mvn install -Dmaven.test.skip=true
```

## Getting started

### Step 1. Generate key and certificate
Before launching the test, you must have a keystore for the private key and the certificate associated with it. To generate the keystore, execute the instructions found in ***src/main/security/createKeystore.sh*** or with the following commands:

**Optional**:  If you want to encrypt your container, put a password in an environment variable.

```shell
export KEY_PASSWORD=your_super_secure_password
```

**Optional**: If you want to encrypt your keystore, put a password in an environment variable.

```shell
export KEYSTORE_PASSWORD=your_super_secure_keystore_password
```

- Definition of file names and aliases.

```shell
export PRIVATE_KEY_FILE=pri_key.pem
export CERTIFICATE_FILE=certificate.pem
export SUBJECT=/C=MX/ST=MX/L=MX/O=CDC/CN=CDC
export PKCS12_FILE=keypair.p12
export KEYSTORE_FILE=keystore.jks
export ALIAS=cdc
```
- Generate key and certificate.

```shell
# Generate private key
openssl ecparam -name secp384r1 -genkey -out ${PRIVATE_KEY_FILE}

# Generate public certificate
openssl req -new -x509 -days 365 \
  -key ${PRIVATE_KEY_FILE} \
  -out ${CERTIFICATE_FILE} \
  -subj "${SUBJECT}"

```

- Generate PKCS12 container from private key and certificate

```shell
# Generate PKCS12 container from private key and certificate
# You will need to package your private key and certificate.

openssl pkcs12 -name ${ALIAS} \
  -export -out ${PKCS12_FILE} \
  -inkey ${PRIVATE_KEY_FILE} \
  -in ${CERTIFICATE_FILE} \
  -password pass:${KEY_PASSWORD}

```

- Generate a dummy keystore and delete its content.

```sh
#Generate a Keystore with a pair of dummy keys.
keytool -genkey -alias dummy -keyalg RSA \
    -keysize 2048 -keystore ${KEYSTORE_FILE} \
    -dname "CN=dummy, OU=, O=, L=, S=, C=" \
    -storepass ${KEYSTORE_PASSWORD} -keypass ${KEY_PASSWORD}
#Remove the dummy key pair.
keytool -delete -alias dummy \
    -keystore ${KEYSTORE_FILE} \
    -storepass ${KEYSTORE_PASSWORD}
```

- Import the PKCS12 container to the keystore

```sh
#We import the PKCS12 container
keytool -importkeystore -srckeystore ${PKCS12_FILE} \
  -srcstoretype PKCS12 \
  -srcstorepass ${KEY_PASSWORD} \
  -destkeystore ${KEYSTORE_FILE} \
  -deststoretype JKS -storepass ${KEYSTORE_PASSWORD} \
  -alias ${ALIAS}
#List the contents of the Kesystore to verify that
keytool -list -keystore ${KEYSTORE_FILE} \
  -storepass ${KEYSTORE_PASSWORD}
```

### Step 2. Uploading the certificate within the developer portal

 1. Login
 2. Click on the section "**Mis aplicaciones**".
 3. Select the application.
 4. Go to the tab "**Certificados para @tuApp**"
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. When the window opens, select the previously created certificate and click the button "**Cargar**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/upload_cert.png">
    </p>
### Step 3. Download the Círculo de Crédito certificate within the developer portal
 1. Login.
 2. Click on the section "**Mis aplicaciones**".
 3. Select the application.
 4. Go to the tab "**Certificados para @tuApp**".
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. When the window opens, click the button "**Descargar**":
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/download_cert.png">
    </p>
### Step 4. Modify configuration file

To make use of the certificate that was downloaded and the keystore that was created, the routes found in **src/main/resources/config.properties**
```properties
keystore_file=your_path_for_your_keystore/keystore.jks
cdc_cert_file=your_path_for_certificate_of_cdc/cdc_cert.pem
keystore_password=your_super_secure_keystore_password
key_alias=cdc
key_password=your_super_secure_password
```
### Step 5. Modify URL and request data
In the AdaApiForBankDataAggregationApiTest.java file, found at  ***src/test/java/io/BankDataAgregation/client/api/***.  The request and URL data for API consumption must be modified in ***private String url = "the_url";***, as shown in the following code snippet with the corresponding data:

1. Configure location and access of the key created in **step 1**and the downloaded certificate in **step 2**
   - keystoreFile: location of the keystore.jks file
   - cdcCertFile: location of the cdc_cert.pem file
   - keystorePassword: encryption password of the keystore
   - keyAlias: alias assigned to the keystore
   - keyPassword: container encryption password

2. Access credentials given by Círculo de Crédito, obtained after affiliation
   - usernameCDC: Círculo de Crédito user
   - passwordCDC: Círculo de Crédito password
	
2. API consumption data
   - url: URL of the API exposure
   - xApiKey: Located in the application (created in ** step 2 **) of the portal and named as Consumer Key

> **NOTE:** The data in the following request are only representative.

```java

package io.BankDataAgregation.client.api;

...


public class AdaApiForBankDataAggregationApiTest {



    ...
    
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyPassword = "your_super_secure_password";
    private String keyAlias = "your_key_alias";
    private UUID subscriptionId = UUID.fromString("your_subscriptionId");
    

    private String username = "your_username_otrorgante";
    private String password = "your_password_otorgante";

    private String xApiKey = "X_Api_Key";

    private String url = "the_url";


   ...

    
    @Test
    public void getBankDataAggregationsTest() throws ApiException {

        String page = "1";
        String perPage = "2";
        OffsetDateTime startAt = null;
        OffsetDateTime endAt = null;
        String inquiryStatus = null;
        String successCheck = null;
        BankDataAggregationMetadata response = api.getBankDataAggregations(this.xApiKey, this.username, this.password, page,
                perPage, startAt, endAt, inquiryStatus, successCheck);
        
        Assert.assertNotNull(response);
        logger.info(response.toString());  
    }

    @Test
    public void getConfBankDataAggregationTest() throws ApiException {
    
        BankDataAggregationConfigurationResponse response = api.getConfBankDataAggregation(this.xApiKey, this.username, this.password,
                this.subscriptionId);
        Assert.assertNotNull(response);
        logger.info(response.toString());
    }

    @Test
    public void getInquiryTest() throws ApiException {
    
        ApiResponse<AckSuccessADAConsumption>   rawResponse = api.getInquiryWithHttpInfo(this.xApiKey, this.username, this.password, this.inquiryId.toString());
        AckSuccessADAConsumption response = rawResponse.getData();
        Assert.assertNotNull(response);
        logger.info(response.toString());

        
        Map<String, List<String>> headers = rawResponse.getHeaders();
        logger.debug(rawResponse.toString());
          
        String ct = (String) response.getBankDataAggregation().getPayload(); 
        String iv = headers.get(this.IV).get(0); 
     
        try { 
            ECDHAlgCipher cipher = new ECDHAlgCipher(this.cdcCertFile, this.keystoreFile, keystorePassword, keyPassword, keyAlias); 
            String payloadStr =  cipher.decryptString(ct, iv); 
            logger.info(payloadStr); 
        } catch (IOException e) 
        { 
            logger.error("Could not decrypt the payload field"); 
        }
         
    }

    @Test
    public void postBankDataAggregationTest() throws ApiException {

        BankDataAggregation request = new BankDataAggregation();
        request.setBankDataAggregationRequestId(UUID.randomUUID());
        request.setSubscriptionId(subscriptionId);
        request.setCurp(null);

        AckADARequest response = api.postBankDataAggregation(this.xApiKey, this.username, this.password, request);

        logger.debug(response.toString());
        Assert.assertNotNull(response);
        inquiryId = response.getInquiryId();
        logger.info(inquiryId.toString());

    }

    @Test
    public void postConfBankDataAggregationTest() throws ApiException {

        BankDataAggregationConfiguration request = new BankDataAggregationConfiguration();
        ConfigurationRequestPrincipal principal = new ConfigurationRequestPrincipal();
        ConfigurationRequestDescriptions descriptions = new ConfigurationRequestDescriptions();
        ConfigurationRequestTermsAndConditions terms = new ConfigurationRequestTermsAndConditions();
        ConfigurationRequest configuration = new ConfigurationRequest();

        ConfigurationRequest2fA twoFa = new ConfigurationRequest2fA();


        principal.setUserName(null);
        principal.setAuthorizationStatement(null);
        principal.setUserLogo(null);
        principal.setPrimaryColor(null);
        principal.setSecondaryColor(null);

        descriptions.setFirstHighlightedText(null);
        descriptions.setFirstHighlightedIcon(Icons.FAR_FA_STAR);
        descriptions.setSecondHighlightedText(null);
        descriptions.setSecondHighlightedIcon(Icons.FAS_FA_CREDIT_CARD);
        descriptions.setThirdHighlightedText(null);
        descriptions.setThirdHighlightedIcon(Icons.FAS_FA_KEY);
        descriptions.setFourthHighlightedIcon(Icons.FAR_FA_STAR);
        descriptions.setFourthHighlightedText(null);

        terms.setTermsAndConditionsTitle(null);
        terms.setTermsAndConditionsLabel(null);
        terms.setTermsAndConditions(null);

        configuration.setPrincipal(principal);
        configuration.setDescriptions(descriptions);
        configuration.setTermsAndConditions(terms);
        
        twoFa.setTwoFaHighlightedIcon(Icons.FAR_FA_STAR);
        twoFa.setTwoFaHighlightedText(null);
        configuration.setTwoFa(twoFa);

		    request.setSubscriptionId(subscriptionId);
        request.setConfiguration(configuration);

        AckBankDataAggregation response = api.postConfBankDataAggregation(this.xApiKey,  this.username, this.password, request);

        Assert.assertNotNull(response);
        logger.info(response.toString());
    }
    


}

```
### Step 6. Run the unit test

Having the previous steps, all that remains is to run the unit test, with the following command:
```shell
mvn test -Dmaven.install.skip=true
```

---
[TERMS AND CONDITIONS](https://github.com/APIHub-CdC/licencias-cdc)