// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.elastic.models.MonitoredResourceListResponse;
import com.azure.resourcemanager.elastic.models.SendingLogs;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MonitoredResourceListResponseTests {
    @Test
    public void testDeserialize() {
        MonitoredResourceListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"hjtckwhd\",\"sendingLogs\":\"False\",\"reasonForLogsStatus\":\"iy\"},{\"id\":\"jxsqwpgrjbz\",\"sendingLogs\":\"False\",\"reasonForLogsStatus\":\"jxvsnbyxqabn\"}],\"nextLink\":\"cpc\"}")
                .toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("hjtckwhd", model.value().get(0).id());
        Assertions.assertEquals(SendingLogs.FALSE, model.value().get(0).sendingLogs());
        Assertions.assertEquals("iy", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("cpc", model.nextLink());
    }

    @Test
    public void testSerialize() {
        MonitoredResourceListResponse model =
            new MonitoredResourceListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new MonitoredResourceInner()
                                .withId("hjtckwhd")
                                .withSendingLogs(SendingLogs.FALSE)
                                .withReasonForLogsStatus("iy"),
                            new MonitoredResourceInner()
                                .withId("jxsqwpgrjbz")
                                .withSendingLogs(SendingLogs.FALSE)
                                .withReasonForLogsStatus("jxvsnbyxqabn")))
                .withNextLink("cpc");
        model = BinaryData.fromObject(model).toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("hjtckwhd", model.value().get(0).id());
        Assertions.assertEquals(SendingLogs.FALSE, model.value().get(0).sendingLogs());
        Assertions.assertEquals("iy", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("cpc", model.nextLink());
    }
}