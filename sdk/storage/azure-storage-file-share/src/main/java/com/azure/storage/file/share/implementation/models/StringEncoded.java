// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/** The StringEncoded model. */
@JacksonXmlRootElement(localName = "StringEncoded")
@Fluent
public final class StringEncoded {
    /*
     * The Encoded property.
     */
    @JacksonXmlProperty(localName = "Encoded", isAttribute = true)
    private Boolean encoded;

    /*
     * The content property.
     */
    @JacksonXmlText private String content;

    /** Creates an instance of StringEncoded class. */
    public StringEncoded() {}

    /**
     * Get the encoded property: The Encoded property.
     *
     * @return the encoded value.
     */
    public Boolean isEncoded() {
        return this.encoded;
    }

    /**
     * Set the encoded property: The Encoded property.
     *
     * @param encoded the encoded value to set.
     * @return the StringEncoded object itself.
     */
    public StringEncoded setEncoded(Boolean encoded) {
        this.encoded = encoded;
        return this;
    }

    /**
     * Get the content property: The content property.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: The content property.
     *
     * @param content the content value to set.
     * @return the StringEncoded object itself.
     */
    public StringEncoded setContent(String content) {
        this.content = content;
        return this;
    }
}