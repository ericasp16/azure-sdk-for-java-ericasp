// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * An inference made by the Radiology Insights model regarding a patient.
 * - AgeMismatch
 * - SexMismatch
 * - LateralityDiscrepancy
 * - CompleteOrderDiscrepancy
 * - LimitedOrderDiscrepancy
 * - Finding
 * - CriticalResult
 * - FollowupRecommendation
 * - RadiologyProcedure
 * - FollowupCommunication.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = FhirR4Extendible1.class)
@JsonTypeName("Fhir_R4_Extendible1")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ageMismatch", value = AgeMismatchInference.class),
    @JsonSubTypes.Type(name = "sexMismatch", value = SexMismatchInference.class),
    @JsonSubTypes.Type(name = "lateralityDiscrepancy", value = LateralityDiscrepancyInference.class),
    @JsonSubTypes.Type(name = "completeOrderDiscrepancy", value = CompleteOrderDiscrepancyInference.class),
    @JsonSubTypes.Type(name = "limitedOrderDiscrepancy", value = LimitedOrderDiscrepancyInference.class),
    @JsonSubTypes.Type(name = "finding", value = FindingInference.class),
    @JsonSubTypes.Type(name = "criticalResult", value = CriticalResultInference.class),
    @JsonSubTypes.Type(name = "radiologyProcedure", value = RadiologyProcedureInference.class),
    @JsonSubTypes.Type(name = "followupRecommendation", value = FollowupRecommendationInference.class),
    @JsonSubTypes.Type(name = "followupCommunication", value = FollowupCommunicationInference.class) })
@Immutable
public class FhirR4Extendible1 {

    /*
     * Additional Content defined by implementations
     */
    @Generated
    @JsonProperty(value = "extension")
    private List<FhirR4Extension> extension;

    /**
     * Creates an instance of FhirR4Extendible1 class.
     */
    @Generated
    protected FhirR4Extendible1() {
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }
}
