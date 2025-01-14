// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ServiceNowV2LinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * ServiceNowV2 server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ServiceNowV2")
@Fluent
public final class ServiceNowV2LinkedService extends LinkedService {
    /*
     * ServiceNowV2 server linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ServiceNowV2LinkedServiceTypeProperties innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();

    /**
     * Creates an instance of ServiceNowV2LinkedService class.
     */
    public ServiceNowV2LinkedService() {
    }

    /**
     * Get the innerTypeProperties property: ServiceNowV2 server linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ServiceNowV2LinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceNowV2LinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceNowV2LinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceNowV2LinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceNowV2LinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of the ServiceNowV2 server. (i.e. &lt;instance&gt;.service-now.com).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint of the ServiceNowV2 server. (i.e. &lt;instance&gt;.service-now.com).
     * 
     * @param endpoint the endpoint value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     * 
     * @return the authenticationType value.
     */
    public ServiceNowV2AuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withAuthenticationType(ServiceNowV2AuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the ServiceNowV2 server for Basic and OAuth2
     * authentication.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The user name used to connect to the ServiceNowV2 server for Basic and OAuth2
     * authentication.
     * 
     * @param username the username value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name for Basic and OAuth2 authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password corresponding to the user name for Basic and OAuth2 authentication.
     * 
     * @param password the password value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the clientId property: The client id for OAuth2 authentication.
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: The client id for OAuth2 authentication.
     * 
     * @param clientId the clientId value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: The client secret for OAuth2 authentication.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: The client secret for OAuth2 authentication.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withClientSecret(SecretBase clientSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the grantType property: GrantType for OAuth2 authentication. Default value is password.
     * 
     * @return the grantType value.
     */
    public Object grantType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().grantType();
    }

    /**
     * Set the grantType property: GrantType for OAuth2 authentication. Default value is password.
     * 
     * @param grantType the grantType value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withGrantType(Object grantType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withGrantType(grantType);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ServiceNowV2LinkedService object itself.
     */
    public ServiceNowV2LinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model ServiceNowV2LinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceNowV2LinkedService.class);
}
