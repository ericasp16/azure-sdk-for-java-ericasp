// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.QuotaBaseProperties;
import com.azure.resourcemanager.machinelearning.models.QuotaUnit;
import com.azure.resourcemanager.machinelearning.models.QuotaUpdateParameters;
import com.azure.resourcemanager.machinelearning.models.UpdateWorkspaceQuotasResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class QuotasUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"ud\",\"type\":\"ckaprhknqiijge\",\"limit\":564973110703252614,\"unit\":\"Count\",\"status\":\"InvalidVMFamilyName\"},{\"id\":\"qih\",\"type\":\"yowltj\",\"limit\":818494289048822861,\"unit\":\"Count\",\"status\":\"OperationNotEnabledForRegion\"},{\"id\":\"ieproqksmfxm\",\"type\":\"prstvkitbfj\",\"limit\":2706549674295489273,\"unit\":\"Count\",\"status\":\"Success\"}],\"nextLink\":\"acqoccqrqxwetj\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateWorkspaceQuotasResult response =
            manager
                .quotas()
                .updateWithResponse(
                    "aaneakhtmhobcya",
                    new QuotaUpdateParameters()
                        .withValue(
                            Arrays
                                .asList(
                                    new QuotaBaseProperties()
                                        .withId("qtvkh")
                                        .withType("oog")
                                        .withLimit(8839691341349880163L)
                                        .withUnit(QuotaUnit.COUNT),
                                    new QuotaBaseProperties()
                                        .withId("qymhcctopuow")
                                        .withType("nskby")
                                        .withLimit(4791092419176992520L)
                                        .withUnit(QuotaUnit.COUNT),
                                    new QuotaBaseProperties()
                                        .withId("gx")
                                        .withType("ajpxecxqnwhscoza")
                                        .withLimit(5738000548376016022L)
                                        .withUnit(QuotaUnit.COUNT)))
                        .withLocation("pknpwirfljfewxq"),
                    Context.NONE)
                .getValue();
    }
}