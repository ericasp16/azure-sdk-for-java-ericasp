// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.fluent.models.ApiCollectionResponseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Page of a list of API collections as represented by Defender for APIs. */
@Immutable
public final class ApiCollectionResponseList {
    /*
     * API collections in this page.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApiCollectionResponseInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ApiCollectionResponseList class. */
    public ApiCollectionResponseList() {
    }

    /**
     * Get the value property: API collections in this page.
     *
     * @return the value value.
     */
    public List<ApiCollectionResponseInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}