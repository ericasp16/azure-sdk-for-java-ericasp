// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Phrase summaries for the entire forecast period. */
@Fluent
public final class MinuteForecastSummary {
    /*
     * Summary phrase for the next 60 minutes. Phrase length is approximately 60 characters.
     */
    @JsonProperty(value = "briefPhrase60")
    private String briefPhrase60;

    /*
     * Short summary phrase for the next 120 minutes. Phrase length is approximately 25 characters.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortDescription;

    /*
     * Summary phrase for the next 120 minutes. Phrase length is approximately 60 characters.
     */
    @JsonProperty(value = "briefPhrase")
    private String briefDescription;

    /*
     * Long summary phrase for the next 120 minutes. Phrase length is 60+ characters.
     */
    @JsonProperty(value = "longPhrase")
    private String longPhrase;

    /*
     * Numeric value representing an image that displays the `iconPhrase`. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private IconCode iconCode;

    /** Set default MinuteForecastSummary constructor to private */
    private MinuteForecastSummary() {}

    /**
     * Get the briefPhrase60 property: Summary phrase for the next 60 minutes. Phrase length is approximately 60
     * characters.
     *
     * @return the briefPhrase60 value.
     */
    public String getBriefPhrase60() {
        return this.briefPhrase60;
    }

    /**
     * Get the shortDescription property: Short summary phrase for the next 120 minutes. Phrase length is approximately
     * 25 characters.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * Get the briefDescription property: Summary phrase for the next 120 minutes. Phrase length is approximately 60
     * characters.
     *
     * @return the briefDescription value.
     */
    public String getBriefDescription() {
        return this.briefDescription;
    }

    /**
     * Get the longPhrase property: Long summary phrase for the next 120 minutes. Phrase length is 60+ characters.
     *
     * @return the longPhrase value.
     */
    public String getLongPhrase() {
        return this.longPhrase;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public IconCode getIconCode() {
        return this.iconCode;
    }
}