// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.PrePostStep;
import org.junit.jupiter.api.Assertions;

public final class PrePostStepTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrePostStep model = BinaryData.fromString("{\"stepId\":\"wgcu\"}").toObject(PrePostStep.class);
        Assertions.assertEquals("wgcu", model.stepId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrePostStep model = new PrePostStep().withStepId("wgcu");
        model = BinaryData.fromObject(model).toObject(PrePostStep.class);
        Assertions.assertEquals("wgcu", model.stepId());
    }
}