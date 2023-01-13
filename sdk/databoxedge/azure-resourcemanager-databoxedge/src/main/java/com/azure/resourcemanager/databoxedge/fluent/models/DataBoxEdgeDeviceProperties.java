// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.models.DeviceType;
import com.azure.resourcemanager.databoxedge.models.RoleTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the Data Box Edge/Gateway device. */
@Fluent
public final class DataBoxEdgeDeviceProperties {
    /*
     * The status of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "dataBoxEdgeDeviceStatus")
    private DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus;

    /*
     * The Serial Number of Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * The Description of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The description of the Data Box Edge/Gateway device model.
     */
    @JsonProperty(value = "modelDescription")
    private String modelDescription;

    /*
     * The type of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "deviceType", access = JsonProperty.Access.WRITE_ONLY)
    private DeviceType deviceType;

    /*
     * The Data Box Edge/Gateway device name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The Data Box Edge/Gateway device culture.
     */
    @JsonProperty(value = "culture", access = JsonProperty.Access.WRITE_ONLY)
    private String culture;

    /*
     * The Data Box Edge/Gateway device model.
     */
    @JsonProperty(value = "deviceModel", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceModel;

    /*
     * The Data Box Edge/Gateway device software version.
     */
    @JsonProperty(value = "deviceSoftwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceSoftwareVersion;

    /*
     * The Data Box Edge/Gateway device local capacity in MB.
     */
    @JsonProperty(value = "deviceLocalCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Long deviceLocalCapacity;

    /*
     * The Data Box Edge/Gateway device timezone.
     */
    @JsonProperty(value = "timeZone", access = JsonProperty.Access.WRITE_ONLY)
    private String timeZone;

    /*
     * The device software version number of the device (eg: 1.2.18105.6).
     */
    @JsonProperty(value = "deviceHcsVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceHcsVersion;

    /*
     * Type of compute roles configured.
     */
    @JsonProperty(value = "configuredRoleTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<RoleTypes> configuredRoleTypes;

    /*
     * The number of nodes in the cluster.
     */
    @JsonProperty(value = "nodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer nodeCount;

    /** Creates an instance of DataBoxEdgeDeviceProperties class. */
    public DataBoxEdgeDeviceProperties() {
    }

    /**
     * Get the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @return the dataBoxEdgeDeviceStatus value.
     */
    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.dataBoxEdgeDeviceStatus;
    }

    /**
     * Set the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @param dataBoxEdgeDeviceStatus the dataBoxEdgeDeviceStatus value to set.
     * @return the DataBoxEdgeDeviceProperties object itself.
     */
    public DataBoxEdgeDeviceProperties withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus) {
        this.dataBoxEdgeDeviceStatus = dataBoxEdgeDeviceStatus;
        return this;
    }

    /**
     * Get the serialNumber property: The Serial Number of Data Box Edge/Gateway device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @param description the description value to set.
     * @return the DataBoxEdgeDeviceProperties object itself.
     */
    public DataBoxEdgeDeviceProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @return the modelDescription value.
     */
    public String modelDescription() {
        return this.modelDescription;
    }

    /**
     * Set the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @param modelDescription the modelDescription value to set.
     * @return the DataBoxEdgeDeviceProperties object itself.
     */
    public DataBoxEdgeDeviceProperties withModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }

    /**
     * Get the deviceType property: The type of the Data Box Edge/Gateway device.
     *
     * @return the deviceType value.
     */
    public DeviceType deviceType() {
        return this.deviceType;
    }

    /**
     * Get the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the DataBoxEdgeDeviceProperties object itself.
     */
    public DataBoxEdgeDeviceProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the culture property: The Data Box Edge/Gateway device culture.
     *
     * @return the culture value.
     */
    public String culture() {
        return this.culture;
    }

    /**
     * Get the deviceModel property: The Data Box Edge/Gateway device model.
     *
     * @return the deviceModel value.
     */
    public String deviceModel() {
        return this.deviceModel;
    }

    /**
     * Get the deviceSoftwareVersion property: The Data Box Edge/Gateway device software version.
     *
     * @return the deviceSoftwareVersion value.
     */
    public String deviceSoftwareVersion() {
        return this.deviceSoftwareVersion;
    }

    /**
     * Get the deviceLocalCapacity property: The Data Box Edge/Gateway device local capacity in MB.
     *
     * @return the deviceLocalCapacity value.
     */
    public Long deviceLocalCapacity() {
        return this.deviceLocalCapacity;
    }

    /**
     * Get the timeZone property: The Data Box Edge/Gateway device timezone.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Get the deviceHcsVersion property: The device software version number of the device (eg: 1.2.18105.6).
     *
     * @return the deviceHcsVersion value.
     */
    public String deviceHcsVersion() {
        return this.deviceHcsVersion;
    }

    /**
     * Get the configuredRoleTypes property: Type of compute roles configured.
     *
     * @return the configuredRoleTypes value.
     */
    public List<RoleTypes> configuredRoleTypes() {
        return this.configuredRoleTypes;
    }

    /**
     * Get the nodeCount property: The number of nodes in the cluster.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}