// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularTranslator;
import com.azure.resourcemanager.datafactory.models.TypeConversionSettings;

public final class TabularTranslatorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TabularTranslator model = BinaryData.fromString(
            "{\"type\":\"TabularTranslator\",\"columnMappings\":\"dataqvdivzjyx\",\"schemaMapping\":\"datablblxjbrqbutmacn\",\"collectionReference\":\"datadmyduvawea\",\"mapComplexValuesToString\":\"datafbvbvkw\",\"mappings\":\"datarz\",\"typeConversion\":\"datayymh\",\"typeConversionSettings\":{\"allowDataTruncation\":\"dataobhltmpay\",\"treatBooleanAsNumber\":\"dataqgrsytto\",\"dateTimeFormat\":\"datazbbxifacrhpuzcag\",\"dateTimeOffsetFormat\":\"datavpbwt\",\"timeSpanFormat\":\"datauiguo\",\"culture\":\"datao\"},\"\":{\"gdv\":\"databuexrkoxwyxodp\"}}")
            .toObject(TabularTranslator.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TabularTranslator model = new TabularTranslator().withColumnMappings("dataqvdivzjyx")
            .withSchemaMapping("datablblxjbrqbutmacn").withCollectionReference("datadmyduvawea")
            .withMapComplexValuesToString("datafbvbvkw").withMappings("datarz").withTypeConversion("datayymh")
            .withTypeConversionSettings(new TypeConversionSettings().withAllowDataTruncation("dataobhltmpay")
                .withTreatBooleanAsNumber("dataqgrsytto").withDateTimeFormat("datazbbxifacrhpuzcag")
                .withDateTimeOffsetFormat("datavpbwt").withTimeSpanFormat("datauiguo").withCulture("datao"));
        model = BinaryData.fromObject(model).toObject(TabularTranslator.class);
    }
}
