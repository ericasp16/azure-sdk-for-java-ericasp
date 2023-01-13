// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionProperties;
import com.azure.resourcemanager.billing.models.BillingSubscriptionStatusType;
import org.junit.jupiter.api.Assertions;

public final class BillingSubscriptionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingSubscriptionProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"qwwncw\",\"subscriptionId\":\"0b14bc39-5e00-4eb5-b288-987d4dfc4e21\",\"subscriptionBillingStatus\":\"Deleted\",\"lastMonthCharges\":{\"currency\":\"trmgucnapkte\",\"value\":45.423527},\"monthToDateCharges\":{\"currency\":\"pt\",\"value\":32.62289},\"billingProfileId\":\"pfqbuaceopzf\",\"billingProfileDisplayName\":\"hhuao\",\"costCenter\":\"pcqeqx\",\"customerId\":\"z\",\"customerDisplayName\":\"hzxct\",\"invoiceSectionId\":\"gbkdmoizpos\",\"invoiceSectionDisplayName\":\"grcfb\",\"reseller\":{\"resellerId\":\"mfqjhhkxbp\",\"description\":\"ymjhxxjyngudivkr\"},\"skuId\":\"wbxqzvszjfau\",\"skuDescription\":\"fdxxivetvtcqaqtd\",\"suspensionReasons\":[\"cbxvwvxyslqbh\",\"fxoblytkb\",\"mpew\"]}")
                .toObject(BillingSubscriptionProperties.class);
        Assertions.assertEquals(BillingSubscriptionStatusType.DELETED, model.subscriptionBillingStatus());
        Assertions.assertEquals("pcqeqx", model.costCenter());
        Assertions.assertEquals("wbxqzvszjfau", model.skuId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingSubscriptionProperties model =
            new BillingSubscriptionProperties()
                .withSubscriptionBillingStatus(BillingSubscriptionStatusType.DELETED)
                .withCostCenter("pcqeqx")
                .withSkuId("wbxqzvszjfau");
        model = BinaryData.fromObject(model).toObject(BillingSubscriptionProperties.class);
        Assertions.assertEquals(BillingSubscriptionStatusType.DELETED, model.subscriptionBillingStatus());
        Assertions.assertEquals("pcqeqx", model.costCenter());
        Assertions.assertEquals("wbxqzvszjfau", model.skuId());
    }
}