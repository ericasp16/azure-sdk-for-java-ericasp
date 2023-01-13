// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.AuthenticationType;
import com.azure.resourcemanager.databoxedge.models.UploadCertificateRequest;
import org.junit.jupiter.api.Assertions;

public final class UploadCertificateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UploadCertificateRequest model =
            BinaryData
                .fromString("{\"properties\":{\"authenticationType\":\"Invalid\",\"certificate\":\"bwoenwashrt\"}}")
                .toObject(UploadCertificateRequest.class);
        Assertions.assertEquals(AuthenticationType.INVALID, model.authenticationType());
        Assertions.assertEquals("bwoenwashrt", model.certificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UploadCertificateRequest model =
            new UploadCertificateRequest()
                .withAuthenticationType(AuthenticationType.INVALID)
                .withCertificate("bwoenwashrt");
        model = BinaryData.fromObject(model).toObject(UploadCertificateRequest.class);
        Assertions.assertEquals(AuthenticationType.INVALID, model.authenticationType());
        Assertions.assertEquals("bwoenwashrt", model.certificate());
    }
}