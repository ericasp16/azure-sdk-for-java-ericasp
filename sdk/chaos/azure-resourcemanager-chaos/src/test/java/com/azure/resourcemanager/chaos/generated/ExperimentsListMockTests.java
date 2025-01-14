// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.Experiment;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExperimentsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"qwkyhkobop\":{\"principalId\":\"9afaec88-e2cb-4e51-8957-3ac88c1a8455\",\"clientId\":\"57e284ba-2b78-4605-9676-7005b0d63933\"},\"dkow\":{\"principalId\":\"4f41ab29-13a3-4ed0-bc0f-ef5f6f9a59f3\",\"clientId\":\"b83fdc62-696d-4f02-9fa4-53ac6555da27\"}},\"principalId\":\"bqpc\",\"tenantId\":\"kbwcc\"},\"properties\":{\"provisioningState\":\"Deleting\",\"steps\":[{\"name\":\"cdwxlpq\",\"branches\":[{\"name\":\"ftnkhtj\",\"actions\":[]},{\"name\":\"y\",\"actions\":[]},{\"name\":\"ngwfqatm\",\"actions\":[]}]},{\"name\":\"dhtmdvypgikd\",\"branches\":[{\"name\":\"zywkb\",\"actions\":[]},{\"name\":\"rryuzhlhkjo\",\"actions\":[]},{\"name\":\"rvqqaatj\",\"actions\":[]}]},{\"name\":\"nrvgoupmfiibfgg\",\"branches\":[{\"name\":\"ool\",\"actions\":[]},{\"name\":\"rwxkvtkkgl\",\"actions\":[]},{\"name\":\"qwjygvja\",\"actions\":[]},{\"name\":\"vblm\",\"actions\":[]}]},{\"name\":\"vkzuhbxvvyhgso\",\"branches\":[{\"name\":\"yrqufegxuvwz\",\"actions\":[]},{\"name\":\"bnhlmc\",\"actions\":[]}]}],\"selectors\":[{\"type\":\"ChaosTargetSelector\",\"id\":\"p\",\"filter\":{\"type\":\"ChaosTargetFilter\"},\"\":{\"jejveg\":\"datatvgbmhrixkwmy\",\"eaxhcexdrrvqahqk\":\"datahbpnaixexccbd\",\"hyjsvfycx\":\"datahtpwij\",\"t\":\"databfvoowvrv\"}}]},\"location\":\"jqppyostronzmy\",\"tags\":{\"xkmcwaekrrjre\":\"ipn\",\"jglikkxwslolb\":\"fxtsgum\"},\"id\":\"pvuzlmv\",\"name\":\"elfk\",\"type\":\"gplcrpwjxeznoigb\"}]}";

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

        ChaosManager manager =
            ChaosManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Experiment> response =
            manager.experiments().list(false, "elvezrypq", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jqppyostronzmy", response.iterator().next().location());
        Assertions.assertEquals("ipn", response.iterator().next().tags().get("xkmcwaekrrjre"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("cdwxlpq", response.iterator().next().steps().get(0).name());
        Assertions.assertEquals("ftnkhtj", response.iterator().next().steps().get(0).branches().get(0).name());
        Assertions.assertEquals("p", response.iterator().next().selectors().get(0).id());
    }
}
