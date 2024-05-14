# TokenTrackerApi

All URIs are relative to *https://token-tracker.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenTrackerAdjustTokenBalance**](TokenTrackerApi.md#tokenTrackerAdjustTokenBalance) | **POST** /v1/{tenantId}/adjust_token_balance | AdjustTokenBalance |
| [**tokenTrackerGetTokenBalance**](TokenTrackerApi.md#tokenTrackerGetTokenBalance) | **POST** /v1/{tenantId}/get_token_balance | GetTokenBalance |
| [**tokenTrackerStripeWebhook**](TokenTrackerApi.md#tokenTrackerStripeWebhook) | **POST** /v1/stripe/webhook | StripeWebhook |


<a id="tokenTrackerAdjustTokenBalance"></a>
# **tokenTrackerAdjustTokenBalance**
> TokentrackerAdjustTokenBalanceResponse tokenTrackerAdjustTokenBalance(tenantId, body)

AdjustTokenBalance

Adjust token balance

### Example
```java
// Import classes:
import GeminiCommerce_Tokentracker.ApiClient;
import GeminiCommerce_Tokentracker.ApiException;
import GeminiCommerce_Tokentracker.Configuration;
import GeminiCommerce_Tokentracker.auth.*;
import GeminiCommerce_Tokentracker.models.*;
import org.openapitools.client.api.TokenTrackerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://token-tracker.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    TokenTrackerApi apiInstance = new TokenTrackerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    TokenTrackerAdjustTokenBalanceRequest body = new TokenTrackerAdjustTokenBalanceRequest(); // TokenTrackerAdjustTokenBalanceRequest | 
    try {
      TokentrackerAdjustTokenBalanceResponse result = apiInstance.tokenTrackerAdjustTokenBalance(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenTrackerApi#tokenTrackerAdjustTokenBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **body** | [**TokenTrackerAdjustTokenBalanceRequest**](TokenTrackerAdjustTokenBalanceRequest.md)|  | |

### Return type

[**TokentrackerAdjustTokenBalanceResponse**](TokentrackerAdjustTokenBalanceResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="tokenTrackerGetTokenBalance"></a>
# **tokenTrackerGetTokenBalance**
> TokentrackerGetTokenBalanceResponse tokenTrackerGetTokenBalance(tenantId, body)

GetTokenBalance

Get token balance

### Example
```java
// Import classes:
import GeminiCommerce_Tokentracker.ApiClient;
import GeminiCommerce_Tokentracker.ApiException;
import GeminiCommerce_Tokentracker.Configuration;
import GeminiCommerce_Tokentracker.auth.*;
import GeminiCommerce_Tokentracker.models.*;
import org.openapitools.client.api.TokenTrackerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://token-tracker.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    TokenTrackerApi apiInstance = new TokenTrackerApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    Object body = null; // Object | 
    try {
      TokentrackerGetTokenBalanceResponse result = apiInstance.tokenTrackerGetTokenBalance(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenTrackerApi#tokenTrackerGetTokenBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**TokentrackerGetTokenBalanceResponse**](TokentrackerGetTokenBalanceResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="tokenTrackerStripeWebhook"></a>
# **tokenTrackerStripeWebhook**
> Object tokenTrackerStripeWebhook(body)

StripeWebhook

Stripe webhook

### Example
```java
// Import classes:
import GeminiCommerce_Tokentracker.ApiClient;
import GeminiCommerce_Tokentracker.ApiException;
import GeminiCommerce_Tokentracker.Configuration;
import GeminiCommerce_Tokentracker.auth.*;
import GeminiCommerce_Tokentracker.models.*;
import org.openapitools.client.api.TokenTrackerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://token-tracker.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    TokenTrackerApi apiInstance = new TokenTrackerApi(defaultClient);
    TokentrackerStripeWebhookRequest body = new TokentrackerStripeWebhookRequest(); // TokentrackerStripeWebhookRequest | 
    try {
      Object result = apiInstance.tokenTrackerStripeWebhook(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenTrackerApi#tokenTrackerStripeWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**TokentrackerStripeWebhookRequest**](TokentrackerStripeWebhookRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

