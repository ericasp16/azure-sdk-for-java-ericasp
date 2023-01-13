// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.Sku;
import com.azure.resourcemanager.databox.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model =
            BinaryData
                .fromString("{\"name\":\"DataBox\",\"displayName\":\"daj\",\"family\":\"ysou\"}")
                .toObject(Sku.class);
        Assertions.assertEquals(SkuName.DATA_BOX, model.name());
        Assertions.assertEquals("daj", model.displayName());
        Assertions.assertEquals("ysou", model.family());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName(SkuName.DATA_BOX).withDisplayName("daj").withFamily("ysou");
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals(SkuName.DATA_BOX, model.name());
        Assertions.assertEquals("daj", model.displayName());
        Assertions.assertEquals("ysou", model.family());
    }
}