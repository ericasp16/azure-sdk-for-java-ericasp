// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.fluent.models.ReservationOrderAliasResponseProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.InstanceFlexibility;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasResponsePropertiesReservedResourceProperties;
import com.azure.resourcemanager.billingbenefits.models.ReservedResourceType;
import com.azure.resourcemanager.billingbenefits.models.Term;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ReservationOrderAliasResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationOrderAliasResponseProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"t\",\"reservationOrderId\":\"nermcl\",\"provisioningState\":\"ConfirmedBilling\",\"billingScopeId\":\"hoxus\",\"term\":\"P3Y\",\"billingPlan\":\"P1M\",\"appliedScopeType\":\"Shared\",\"appliedScopeProperties\":{\"tenantId\":\"sbj\",\"managementGroupId\":\"zq\",\"subscriptionId\":\"xywpmueefjzwfqkq\",\"resourceGroupId\":\"ids\",\"displayName\":\"onobglaocqx\"},\"quantity\":1581079817,\"renew\":false,\"reservedResourceType\":\"SqlEdge\",\"reviewDateTime\":\"2021-01-17T15:02:45Z\",\"reservedResourceProperties\":{\"instanceFlexibility\":\"On\"}}")
                .toObject(ReservationOrderAliasResponseProperties.class);
        Assertions.assertEquals("t", model.displayName());
        Assertions.assertEquals("hoxus", model.billingScopeId());
        Assertions.assertEquals(Term.P3Y, model.term());
        Assertions.assertEquals(BillingPlan.P1M, model.billingPlan());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("sbj", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("zq", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("xywpmueefjzwfqkq", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ids", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("onobglaocqx", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(1581079817, model.quantity());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(ReservedResourceType.SQL_EDGE, model.reservedResourceType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T15:02:45Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationOrderAliasResponseProperties model =
            new ReservationOrderAliasResponseProperties()
                .withDisplayName("t")
                .withBillingScopeId("hoxus")
                .withTerm(Term.P3Y)
                .withBillingPlan(BillingPlan.P1M)
                .withAppliedScopeType(AppliedScopeType.SHARED)
                .withAppliedScopeProperties(
                    new AppliedScopeProperties()
                        .withTenantId("sbj")
                        .withManagementGroupId("zq")
                        .withSubscriptionId("xywpmueefjzwfqkq")
                        .withResourceGroupId("ids")
                        .withDisplayName("onobglaocqx"))
                .withQuantity(1581079817)
                .withRenew(false)
                .withReservedResourceType(ReservedResourceType.SQL_EDGE)
                .withReviewDateTime(OffsetDateTime.parse("2021-01-17T15:02:45Z"))
                .withReservedResourceProperties(
                    new ReservationOrderAliasResponsePropertiesReservedResourceProperties()
                        .withInstanceFlexibility(InstanceFlexibility.ON));
        model = BinaryData.fromObject(model).toObject(ReservationOrderAliasResponseProperties.class);
        Assertions.assertEquals("t", model.displayName());
        Assertions.assertEquals("hoxus", model.billingScopeId());
        Assertions.assertEquals(Term.P3Y, model.term());
        Assertions.assertEquals(BillingPlan.P1M, model.billingPlan());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("sbj", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("zq", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("xywpmueefjzwfqkq", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ids", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("onobglaocqx", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(1581079817, model.quantity());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(ReservedResourceType.SQL_EDGE, model.reservedResourceType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-17T15:02:45Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
    }
}