// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.attestation.models.PrivateEndpoint;
import com.azure.resourcemanager.attestation.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.attestation.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"ahuxinpm\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"qwixjspro\",\"actionsRequired\":\"cputegjvwmfdats\"},\"provisioningState\":\"Failed\"},\"id\":\"vpjhulsuuv\",\"name\":\"kjozkrwfnd\",\"type\":\"odjpslwejd\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qwixjspro", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cputegjvwmfdats", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("qwixjspro")
                        .withActionsRequired("cputegjvwmfdats"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qwixjspro", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("cputegjvwmfdats", model.privateLinkServiceConnectionState().actionsRequired());
    }
}