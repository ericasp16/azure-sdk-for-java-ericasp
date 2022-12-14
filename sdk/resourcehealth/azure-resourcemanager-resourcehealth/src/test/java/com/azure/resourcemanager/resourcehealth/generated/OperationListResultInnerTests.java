// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.resourcehealth.models.Operation;
import com.azure.resourcemanager.resourcehealth.models.OperationDisplay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationListResultInnerTests {
    @Test
    public void testDeserialize() {
        OperationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"iachbo\",\"display\":{\"provider\":\"lnrosfqp\",\"resource\":\"ehzzvypyqrim\",\"operation\":\"npvswjdkirso\",\"description\":\"qxhcrmn\"}},{\"name\":\"jtckwhdso\",\"display\":{\"provider\":\"yip\",\"resource\":\"sqwpgrjb\",\"operation\":\"orcjxvsnby\",\"description\":\"abnmocpcyshu\"}},{\"name\":\"afbljjgpbtoqcjmk\",\"display\":{\"provider\":\"vbqid\",\"resource\":\"ajzyul\",\"operation\":\"u\",\"description\":\"krlkhbzhfepg\"}}]}")
                .toObject(OperationListResultInner.class);
        Assertions.assertEquals("iachbo", model.value().get(0).name());
        Assertions.assertEquals("lnrosfqp", model.value().get(0).display().provider());
        Assertions.assertEquals("ehzzvypyqrim", model.value().get(0).display().resource());
        Assertions.assertEquals("npvswjdkirso", model.value().get(0).display().operation());
        Assertions.assertEquals("qxhcrmn", model.value().get(0).display().description());
    }

    @Test
    public void testSerialize() {
        OperationListResultInner model =
            new OperationListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new Operation()
                                .withName("iachbo")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("lnrosfqp")
                                        .withResource("ehzzvypyqrim")
                                        .withOperation("npvswjdkirso")
                                        .withDescription("qxhcrmn")),
                            new Operation()
                                .withName("jtckwhdso")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("yip")
                                        .withResource("sqwpgrjb")
                                        .withOperation("orcjxvsnby")
                                        .withDescription("abnmocpcyshu")),
                            new Operation()
                                .withName("afbljjgpbtoqcjmk")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("vbqid")
                                        .withResource("ajzyul")
                                        .withOperation("u")
                                        .withDescription("krlkhbzhfepg"))));
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
        Assertions.assertEquals("iachbo", model.value().get(0).name());
        Assertions.assertEquals("lnrosfqp", model.value().get(0).display().provider());
        Assertions.assertEquals("ehzzvypyqrim", model.value().get(0).display().resource());
        Assertions.assertEquals("npvswjdkirso", model.value().get(0).display().operation());
        Assertions.assertEquals("qxhcrmn", model.value().get(0).display().description());
    }
}