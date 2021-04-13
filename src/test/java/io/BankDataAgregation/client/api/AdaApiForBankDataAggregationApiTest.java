package io.BankDataAgregation.client.api;

import io.BankDataAgregation.client.ApiClient;
import io.BankDataAgregation.client.ApiException;
import io.BankDataAgregation.client.ApiResponse;
import io.BankDataAgregation.client.interceptor.SignerInterceptor;
import io.BankDataAgregation.client.model.AckADARequest;
import io.BankDataAgregation.client.model.AckBankDataAggregation;
import io.BankDataAgregation.client.model.AckSuccessADAConsumption;
import io.BankDataAgregation.client.model.BankDataAggregation;
import io.BankDataAgregation.client.model.BankDataAggregationConfiguration;
import io.BankDataAgregation.client.model.BankDataAggregationConfigurationResponse;
import io.BankDataAgregation.client.model.BankDataAggregationMetadata;
import io.BankDataAgregation.client.model.ConfigurationRequest;
import io.BankDataAgregation.client.model.ConfigurationRequest2fA;
import io.BankDataAgregation.client.model.ConfigurationRequestDescriptions;
import io.BankDataAgregation.client.model.ConfigurationRequestPrincipal;
import io.BankDataAgregation.client.model.ConfigurationRequestTermsAndConditions;
import io.BankDataAgregation.client.model.Icons;

import org.threeten.bp.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.BankDataAgregation.helper.ECDHAlgCipher;
import okhttp3.OkHttpClient;

public class AdaApiForBankDataAggregationApiTest {
    private final AdaApiForBankDataAggregationApi api = new AdaApiForBankDataAggregationApi();
    private Logger logger = LoggerFactory.getLogger(AdaApiForBankDataAggregationApiTest.class.getName());
    private ApiClient apiClient = null;


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


    private SignerInterceptor interceptor;
    private String IV="x-iv";

    private UUID inquiryId = null;
    
    @Before
    public void setUp() {

        interceptor = new SignerInterceptor(this.keystoreFile, this.cdcCertFile, this.keystorePassword, this.keyAlias,
                this.keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();
        apiClient.setHttpClient(okHttpClient);
    }

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
