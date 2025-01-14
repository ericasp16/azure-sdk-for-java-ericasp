// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storageactions.StorageActionsManager;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.StorageTask;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageTasksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"identity\":{\"principalId\":\"463cdcac-3402-4d57-9df7-28ca146dd88d\",\"tenantId\":\"36fc4815-7972-499e-910d-60a44d18aecb\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"awgqwgxhni\":{\"principalId\":\"f2cfa7dc-89ee-4bc2-8ba3-8ebd33522cf1\",\"clientId\":\"acdf96ff-d771-4c5c-a1b0-0b0677e5d05f\"},\"fbkp\":{\"principalId\":\"64b2a031-8cdf-4384-bb80-2f2d6db78c23\",\"clientId\":\"8d3c9b0b-c5a4-4bc6-8cba-de46f6fb809e\"},\"klwndnhjdauwhv\":{\"principalId\":\"11301dfe-ca41-45c0-9ca2-6f76e1ae32c6\",\"clientId\":\"cfb214ab-25d6-400d-8d72-7260f7c080fe\"}}},\"properties\":{\"taskVersion\":3762934959589982311,\"enabled\":true,\"description\":\"dhxujznbmpo\",\"action\":{\"if\":{\"condition\":\"uwprzql\",\"operations\":[{\"name\":\"SetBlobTier\"},{\"name\":\"DeleteBlob\"},{\"name\":\"SetBlobLegalHold\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobImmutabilityPolicy\"},{\"name\":\"SetBlobTier\"}]}},\"provisioningState\":\"Creating\",\"creationTimeInUtc\":\"2021-08-19T13:39:55Z\"},\"location\":\"bcswsrt\",\"tags\":{\"blcg\":\"plrbpbewtghf\",\"nmxiebwwaloayqc\":\"xzvlvqhjkbegib\",\"uzgwyzmhtx\":\"wrtz\",\"wxqpsrknftguvri\":\"ngmtsavjcb\"},\"id\":\"hprwmdyv\",\"name\":\"qtayri\",\"type\":\"wroyqbexrmcq\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        StorageActionsManager manager = StorageActionsManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageTask response = manager.storageTasks()
            .getByResourceGroupWithResponse("rw", "ueiotwmcdyt", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("bcswsrt", response.location());
        Assertions.assertEquals("plrbpbewtghf", response.tags().get("blcg"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(true, response.properties().enabled());
        Assertions.assertEquals("dhxujznbmpo", response.properties().description());
        Assertions.assertEquals("uwprzql", response.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TIER,
            response.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_IMMUTABILITY_POLICY,
            response.properties().action().elseProperty().operations().get(0).name());
    }
}
