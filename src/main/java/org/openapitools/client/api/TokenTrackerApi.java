/*
 * Token Tracker Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import GeminiCommerce_Tokentracker.ApiCallback;
import GeminiCommerce_Tokentracker.ApiClient;
import GeminiCommerce_Tokentracker.ApiException;
import GeminiCommerce_Tokentracker.ApiResponse;
import GeminiCommerce_Tokentracker.Configuration;
import GeminiCommerce_Tokentracker.Pair;
import GeminiCommerce_Tokentracker.ProgressRequestBody;
import GeminiCommerce_Tokentracker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.TokenTrackerAdjustTokenBalanceRequest;
import org.openapitools.client.model.TokentrackerAdjustTokenBalanceResponse;
import org.openapitools.client.model.TokentrackerGetTokenBalanceResponse;
import org.openapitools.client.model.TokentrackerStripeWebhookRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenTrackerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenTrackerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenTrackerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for tokenTrackerAdjustTokenBalance
     * @param tenantId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerAdjustTokenBalanceCall(String tenantId, TokenTrackerAdjustTokenBalanceRequest body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/{tenantId}/adjust_token_balance"
            .replace("{" + "tenantId" + "}", localVarApiClient.escapeString(tenantId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "standardAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokenTrackerAdjustTokenBalanceValidateBeforeCall(String tenantId, TokenTrackerAdjustTokenBalanceRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling tokenTrackerAdjustTokenBalance(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenTrackerAdjustTokenBalance(Async)");
        }

        return tokenTrackerAdjustTokenBalanceCall(tenantId, body, _callback);

    }

    /**
     * AdjustTokenBalance
     * Adjust token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @return TokentrackerAdjustTokenBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TokentrackerAdjustTokenBalanceResponse tokenTrackerAdjustTokenBalance(String tenantId, TokenTrackerAdjustTokenBalanceRequest body) throws ApiException {
        ApiResponse<TokentrackerAdjustTokenBalanceResponse> localVarResp = tokenTrackerAdjustTokenBalanceWithHttpInfo(tenantId, body);
        return localVarResp.getData();
    }

    /**
     * AdjustTokenBalance
     * Adjust token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;TokentrackerAdjustTokenBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokentrackerAdjustTokenBalanceResponse> tokenTrackerAdjustTokenBalanceWithHttpInfo(String tenantId, TokenTrackerAdjustTokenBalanceRequest body) throws ApiException {
        okhttp3.Call localVarCall = tokenTrackerAdjustTokenBalanceValidateBeforeCall(tenantId, body, null);
        Type localVarReturnType = new TypeToken<TokentrackerAdjustTokenBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * AdjustTokenBalance (asynchronously)
     * Adjust token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerAdjustTokenBalanceAsync(String tenantId, TokenTrackerAdjustTokenBalanceRequest body, final ApiCallback<TokentrackerAdjustTokenBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokenTrackerAdjustTokenBalanceValidateBeforeCall(tenantId, body, _callback);
        Type localVarReturnType = new TypeToken<TokentrackerAdjustTokenBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tokenTrackerGetTokenBalance
     * @param tenantId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerGetTokenBalanceCall(String tenantId, Object body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/{tenantId}/get_token_balance"
            .replace("{" + "tenantId" + "}", localVarApiClient.escapeString(tenantId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "standardAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokenTrackerGetTokenBalanceValidateBeforeCall(String tenantId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling tokenTrackerGetTokenBalance(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenTrackerGetTokenBalance(Async)");
        }

        return tokenTrackerGetTokenBalanceCall(tenantId, body, _callback);

    }

    /**
     * GetTokenBalance
     * Get token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @return TokentrackerGetTokenBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TokentrackerGetTokenBalanceResponse tokenTrackerGetTokenBalance(String tenantId, Object body) throws ApiException {
        ApiResponse<TokentrackerGetTokenBalanceResponse> localVarResp = tokenTrackerGetTokenBalanceWithHttpInfo(tenantId, body);
        return localVarResp.getData();
    }

    /**
     * GetTokenBalance
     * Get token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;TokentrackerGetTokenBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokentrackerGetTokenBalanceResponse> tokenTrackerGetTokenBalanceWithHttpInfo(String tenantId, Object body) throws ApiException {
        okhttp3.Call localVarCall = tokenTrackerGetTokenBalanceValidateBeforeCall(tenantId, body, null);
        Type localVarReturnType = new TypeToken<TokentrackerGetTokenBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetTokenBalance (asynchronously)
     * Get token balance
     * @param tenantId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerGetTokenBalanceAsync(String tenantId, Object body, final ApiCallback<TokentrackerGetTokenBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokenTrackerGetTokenBalanceValidateBeforeCall(tenantId, body, _callback);
        Type localVarReturnType = new TypeToken<TokentrackerGetTokenBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tokenTrackerStripeWebhook
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerStripeWebhookCall(TokentrackerStripeWebhookRequest body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/stripe/webhook";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "standardAuthorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tokenTrackerStripeWebhookValidateBeforeCall(TokentrackerStripeWebhookRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenTrackerStripeWebhook(Async)");
        }

        return tokenTrackerStripeWebhookCall(body, _callback);

    }

    /**
     * StripeWebhook
     * Stripe webhook
     * @param body  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Object tokenTrackerStripeWebhook(TokentrackerStripeWebhookRequest body) throws ApiException {
        ApiResponse<Object> localVarResp = tokenTrackerStripeWebhookWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * StripeWebhook
     * Stripe webhook
     * @param body  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> tokenTrackerStripeWebhookWithHttpInfo(TokentrackerStripeWebhookRequest body) throws ApiException {
        okhttp3.Call localVarCall = tokenTrackerStripeWebhookValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * StripeWebhook (asynchronously)
     * Stripe webhook
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tokenTrackerStripeWebhookAsync(TokentrackerStripeWebhookRequest body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokenTrackerStripeWebhookValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}