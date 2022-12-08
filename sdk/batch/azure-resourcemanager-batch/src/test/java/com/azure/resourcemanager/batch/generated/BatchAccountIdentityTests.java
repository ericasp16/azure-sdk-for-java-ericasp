// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.BatchAccountIdentity;
import com.azure.resourcemanager.batch.models.ResourceIdentityType;
import com.azure.resourcemanager.batch.models.UserAssignedIdentities;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BatchAccountIdentityTests {
    @Test
    public void testDeserialize() {
        BatchAccountIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"jbpzvgnwzsymg\",\"tenantId\":\"uf\",\"type\":\"None\",\"userAssignedIdentities\":{\"ithxqhabifpi\":{\"principalId\":\"hdbihan\",\"clientId\":\"hfcbjysa\"},\"ivyqniwbybrkxvd\":{\"principalId\":\"wczbys\",\"clientId\":\"pqxu\"}}}")
                .toObject(BatchAccountIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }

    @Test
    public void testSerialize() {
        BatchAccountIdentity model =
            new BatchAccountIdentity()
                .withType(ResourceIdentityType.NONE)
                .withUserAssignedIdentities(
                    mapOf(
                        "ithxqhabifpi", new UserAssignedIdentities(), "ivyqniwbybrkxvd", new UserAssignedIdentities()));
        model = BinaryData.fromObject(model).toObject(BatchAccountIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}