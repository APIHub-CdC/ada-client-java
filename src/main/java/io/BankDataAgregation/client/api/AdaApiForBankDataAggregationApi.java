package io.BankDataAgregation.client.api;

import io.BankDataAgregation.client.ApiCallback;
import io.BankDataAgregation.client.ApiClient;
import io.BankDataAgregation.client.ApiException;
import io.BankDataAgregation.client.ApiResponse;
import io.BankDataAgregation.client.Configuration;
import io.BankDataAgregation.client.Pair;
import io.BankDataAgregation.client.ProgressRequestBody;
import io.BankDataAgregation.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.BankDataAgregation.client.model.AckADARequest;
import io.BankDataAgregation.client.model.AckBankDataAggregation;
import io.BankDataAgregation.client.model.AckFailureADAConsumption;
import io.BankDataAgregation.client.model.AckSuccessADAConsumption;
import io.BankDataAgregation.client.model.BankDataAggregation;
import io.BankDataAgregation.client.model.BankDataAggregationConfiguration;
import io.BankDataAgregation.client.model.BankDataAggregationConfigurationResponse;
import io.BankDataAgregation.client.model.BankDataAggregationMetadata;
import io.BankDataAgregation.client.model.Errors;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdaApiForBankDataAggregationApi {
    private ApiClient apiClient;
    public AdaApiForBankDataAggregationApi() {
        this(Configuration.getDefaultApiClient());
    }
    public AdaApiForBankDataAggregationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getBankDataAggregationsCall(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/bankdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("perPage", perPage));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (endAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endAt", endAt));
        if (inquiryStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("inquiryStatus", inquiryStatus));
        if (successCheck != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("successCheck", successCheck));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBankDataAggregationsValidateBeforeCall(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getBankDataAggregations(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getBankDataAggregations(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getBankDataAggregations(Async)");
        }

        okhttp3.Call call = getBankDataAggregationsCall(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        return call;
    }
    
    public BankDataAggregationMetadata getBankDataAggregations(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        ApiResponse<BankDataAggregationMetadata> resp = getBankDataAggregationsWithHttpInfo(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck);
        return resp.getData();
    }
    
    public ApiResponse<BankDataAggregationMetadata> getBankDataAggregationsWithHttpInfo(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        okhttp3.Call call = getBankDataAggregationsValidateBeforeCall(xApiKey, username, password, page, perPage, startAt, endAt, inquiryStatus, successCheck, null, null);
        Type localVarReturnType = new TypeToken<BankDataAggregationMetadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getBankDataAggregationsAsync(String xApiKey, String username, String password,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ApiCallback<BankDataAggregationMetadata> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getBankDataAggregationsValidateBeforeCall(xApiKey, username, password,  page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BankDataAggregationMetadata>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getConfBankDataAggregationCall(String xApiKey, String username, String password,  UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/configurations/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConfBankDataAggregationValidateBeforeCall(String xApiKey, String username, String password, UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getConfBankDataAggregation(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getConfBankDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getConfBankDataAggregation(Async)");
        }

        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling getConfBankDataAggregation(Async)");
        }
        
        okhttp3.Call call = getConfBankDataAggregationCall(xApiKey, username, password,  subscriptionId, progressListener, progressRequestListener);
        return call;
    }
    
    public BankDataAggregationConfigurationResponse getConfBankDataAggregation(String xApiKey, String username, String password,  UUID subscriptionId) throws ApiException {
        ApiResponse<BankDataAggregationConfigurationResponse> resp = getConfBankDataAggregationWithHttpInfo(xApiKey, username, password, subscriptionId);
        return resp.getData();
    }
    
    public ApiResponse<BankDataAggregationConfigurationResponse> getConfBankDataAggregationWithHttpInfo(String xApiKey, String username, String password,  UUID subscriptionId) throws ApiException {
        okhttp3.Call call = getConfBankDataAggregationValidateBeforeCall(xApiKey, username, password,  subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<BankDataAggregationConfigurationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getConfBankDataAggregationAsync(String xApiKey, String username, String password,  UUID subscriptionId, final ApiCallback<BankDataAggregationConfigurationResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getConfBankDataAggregationValidateBeforeCall(xApiKey, username, password,  subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BankDataAggregationConfigurationResponse>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getInquiryCall(String xApiKey, String username, String password,  String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/bankdataaggregations/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInquiryValidateBeforeCall(String xApiKey, String username, String password,  String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getInquiry(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getInquiry(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getInquiry(Async)");
        }
        
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling getInquiry(Async)");
        }
        
        okhttp3.Call call = getInquiryCall(xApiKey, username, password,  inquiryId, progressListener, progressRequestListener);
        return call;
    }
    
    public AckSuccessADAConsumption getInquiry(String xApiKey, String username, String password,  String inquiryId) throws ApiException {
        ApiResponse<AckSuccessADAConsumption> resp = getInquiryWithHttpInfo(xApiKey, username, password,  inquiryId);
        return resp.getData();
    }
    
    public ApiResponse<AckSuccessADAConsumption> getInquiryWithHttpInfo(String xApiKey, String username, String password, String inquiryId) throws ApiException {
        okhttp3.Call call = getInquiryValidateBeforeCall(xApiKey, username, password,  inquiryId, null, null);
        Type localVarReturnType = new TypeToken<AckSuccessADAConsumption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getInquiryAsync(String xApiKey, String username, String password,  String inquiryId, final ApiCallback<AckSuccessADAConsumption> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getInquiryValidateBeforeCall(xApiKey, username, password,  inquiryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckSuccessADAConsumption>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call postBankDataAggregationCall(String xApiKey, String username, String password, BankDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/bankdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postBankDataAggregationValidateBeforeCall(String xApiKey,  String username, String password, BankDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postBankDataAggregation(Async)");
        }
     
        
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postBankDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postBankDataAggregation(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postBankDataAggregation(Async)");
        }
        
        okhttp3.Call call = postBankDataAggregationCall(xApiKey,  username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckADARequest postBankDataAggregation(String xApiKey, String username, String password, BankDataAggregation request) throws ApiException {
        ApiResponse<AckADARequest> resp = postBankDataAggregationWithHttpInfo(xApiKey,  username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<AckADARequest> postBankDataAggregationWithHttpInfo(String xApiKey, String username, String password, BankDataAggregation request) throws ApiException {
        okhttp3.Call call = postBankDataAggregationValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<AckADARequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postBankDataAggregationAsync(String xApiKey, String username, String password, BankDataAggregation request, final ApiCallback<AckADARequest> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postBankDataAggregationValidateBeforeCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckADARequest>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call postConfBankDataAggregationCall(String xApiKey, String username, String password, BankDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/configurations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postConfBankDataAggregationValidateBeforeCall(String xApiKey,  String username, String password, BankDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postConfBankDataAggregation(Async)");
        }
    
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postConfBankDataAggregation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postConfBankDataAggregation(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postConfBankDataAggregation(Async)");
        }
        
        okhttp3.Call call = postConfBankDataAggregationCall(xApiKey,  username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckBankDataAggregation postConfBankDataAggregation(String xApiKey,  String username, String password, BankDataAggregationConfiguration request) throws ApiException {
        ApiResponse<AckBankDataAggregation> resp = postConfBankDataAggregationWithHttpInfo(xApiKey,  username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<AckBankDataAggregation> postConfBankDataAggregationWithHttpInfo(String xApiKey, String username, String password, BankDataAggregationConfiguration request) throws ApiException {
        okhttp3.Call call = postConfBankDataAggregationValidateBeforeCall(xApiKey,  username, password, request, null, null);
        Type localVarReturnType = new TypeToken<AckBankDataAggregation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postConfBankDataAggregationAsync(String xApiKey,  String username, String password, BankDataAggregationConfiguration request, final ApiCallback<AckBankDataAggregation> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postConfBankDataAggregationValidateBeforeCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckBankDataAggregation>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
