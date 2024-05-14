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

import GeminiCommerce_Tokentracker.ApiException;
import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.TokenTrackerAdjustTokenBalanceRequest;
import org.openapitools.client.model.TokentrackerAdjustTokenBalanceResponse;
import org.openapitools.client.model.TokentrackerGetTokenBalanceResponse;
import org.openapitools.client.model.TokentrackerStripeWebhookRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenTrackerApi
 */
@Disabled
public class TokenTrackerApiTest {

    private final TokenTrackerApi api = new TokenTrackerApi();

    /**
     * AdjustTokenBalance
     *
     * Adjust token balance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenTrackerAdjustTokenBalanceTest() throws ApiException {
        String tenantId = null;
        TokenTrackerAdjustTokenBalanceRequest body = null;
        TokentrackerAdjustTokenBalanceResponse response = api.tokenTrackerAdjustTokenBalance(tenantId, body);
        // TODO: test validations
    }

    /**
     * GetTokenBalance
     *
     * Get token balance
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenTrackerGetTokenBalanceTest() throws ApiException {
        String tenantId = null;
        Object body = null;
        TokentrackerGetTokenBalanceResponse response = api.tokenTrackerGetTokenBalance(tenantId, body);
        // TODO: test validations
    }

    /**
     * StripeWebhook
     *
     * Stripe webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenTrackerStripeWebhookTest() throws ApiException {
        TokentrackerStripeWebhookRequest body = null;
        Object response = api.tokenTrackerStripeWebhook(body);
        // TODO: test validations
    }

}
