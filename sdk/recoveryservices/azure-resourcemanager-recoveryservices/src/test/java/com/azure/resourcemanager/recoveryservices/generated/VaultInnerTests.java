// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.VaultInner;
import com.azure.resourcemanager.recoveryservices.models.IdentityData;
import com.azure.resourcemanager.recoveryservices.models.InfrastructureEncryptionState;
import com.azure.resourcemanager.recoveryservices.models.MonitoringSettings;
import com.azure.resourcemanager.recoveryservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.recoveryservices.models.ResourceIdentityType;
import com.azure.resourcemanager.recoveryservices.models.SecuritySettings;
import com.azure.resourcemanager.recoveryservices.models.Sku;
import com.azure.resourcemanager.recoveryservices.models.SkuName;
import com.azure.resourcemanager.recoveryservices.models.UpgradeDetails;
import com.azure.resourcemanager.recoveryservices.models.UserIdentity;
import com.azure.resourcemanager.recoveryservices.models.VaultProperties;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesEncryption;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesMoveDetails;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesRedundancySettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VaultInnerTests {
    @Test
    public void testDeserialize() {
        VaultInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"tyxolniwpwc\",\"tenantId\":\"jfkgiawxk\",\"type\":\"SystemAssigned,"
                        + " UserAssigned\",\"userAssignedIdentities\":{\"hejkotynqgou\":{\"principalId\":\"wckbasyypnd\",\"clientId\":\"sgcbac\"},\"gakeqsr\":{\"principalId\":\"ndlik\",\"clientId\":\"qkgfgibma\"}}},\"properties\":{\"provisioningState\":\"zqqedq\",\"upgradeDetails\":{\"operationId\":\"ciqfou\",\"startTimeUtc\":\"2021-02-10T20:24:35Z\",\"lastUpdatedTimeUtc\":\"2021-03-13T18:03:58Z\",\"endTimeUtc\":\"2021-12-07T12:50:46Z\",\"status\":\"Upgraded\",\"message\":\"dmgloug\",\"triggerType\":\"ForcedUpgrade\",\"upgradedResourceId\":\"tmut\",\"previousResourceId\":\"qktapspwgcuert\"},\"privateEndpointConnections\":[{\"id\":\"o\",\"name\":\"whbmd\",\"type\":\"bjf\",\"location\":\"gmbmbexppbh\"},{\"id\":\"qrolfpf\",\"name\":\"lgbquxig\",\"type\":\"jgzjaoyfhrtx\",\"location\":\"n\"}],\"privateEndpointStateForBackup\":\"Enabled\",\"privateEndpointStateForSiteRecovery\":\"None\",\"encryption\":{\"infrastructureEncryption\":\"Enabled\"},\"moveDetails\":{\"operationId\":\"vfqawrlyxwjkcpr\",\"startTimeUtc\":\"2021-01-11T19:42:09Z\",\"completionTimeUtc\":\"2021-07-05T02:07:11Z\",\"sourceResourceId\":\"jvtbvpyss\",\"targetResourceId\":\"nruj\"},\"moveState\":\"PrepareFailed\",\"backupStorageVersion\":\"V2\",\"publicNetworkAccess\":\"Enabled\",\"monitoringSettings\":{},\"redundancySettings\":{\"standardTierStorageRedundancy\":\"ZoneRedundant\",\"crossRegionRestore\":\"Disabled\"},\"securitySettings\":{}},\"sku\":{\"name\":\"Standard\",\"tier\":\"tnwu\",\"family\":\"gazxuf\",\"size\":\"uckyf\",\"capacity\":\"rfidfvzwdz\"},\"etag\":\"ymwisdkft\",\"location\":\"wxmnteiwao\",\"tags\":{\"pymzidnsezcxtbzs\":\"mijcmmxdcufufs\"},\"id\":\"fycc\",\"name\":\"newmdwzjeiachbo\",\"type\":\"sflnrosfqp\"}")
                .toObject(VaultInner.class);
        Assertions.assertEquals("wxmnteiwao", model.location());
        Assertions.assertEquals("mijcmmxdcufufs", model.tags().get("pymzidnsezcxtbzs"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions
            .assertEquals(
                InfrastructureEncryptionState.ENABLED, model.properties().encryption().infrastructureEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.properties().publicNetworkAccess());
        Assertions.assertEquals(SkuName.STANDARD, model.sku().name());
        Assertions.assertEquals("tnwu", model.sku().tier());
        Assertions.assertEquals("gazxuf", model.sku().family());
        Assertions.assertEquals("uckyf", model.sku().size());
        Assertions.assertEquals("rfidfvzwdz", model.sku().capacity());
        Assertions.assertEquals("ymwisdkft", model.etag());
    }

    @Test
    public void testSerialize() {
        VaultInner model =
            new VaultInner()
                .withLocation("wxmnteiwao")
                .withTags(mapOf("pymzidnsezcxtbzs", "mijcmmxdcufufs"))
                .withIdentity(
                    new IdentityData()
                        .withType(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf("hejkotynqgou", new UserIdentity(), "gakeqsr", new UserIdentity())))
                .withProperties(
                    new VaultProperties()
                        .withUpgradeDetails(new UpgradeDetails())
                        .withEncryption(
                            new VaultPropertiesEncryption()
                                .withInfrastructureEncryption(InfrastructureEncryptionState.ENABLED))
                        .withMoveDetails(new VaultPropertiesMoveDetails())
                        .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                        .withMonitoringSettings(new MonitoringSettings())
                        .withRedundancySettings(new VaultPropertiesRedundancySettings())
                        .withSecuritySettings(new SecuritySettings()))
                .withSku(
                    new Sku()
                        .withName(SkuName.STANDARD)
                        .withTier("tnwu")
                        .withFamily("gazxuf")
                        .withSize("uckyf")
                        .withCapacity("rfidfvzwdz"))
                .withEtag("ymwisdkft");
        model = BinaryData.fromObject(model).toObject(VaultInner.class);
        Assertions.assertEquals("wxmnteiwao", model.location());
        Assertions.assertEquals("mijcmmxdcufufs", model.tags().get("pymzidnsezcxtbzs"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions
            .assertEquals(
                InfrastructureEncryptionState.ENABLED, model.properties().encryption().infrastructureEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.properties().publicNetworkAccess());
        Assertions.assertEquals(SkuName.STANDARD, model.sku().name());
        Assertions.assertEquals("tnwu", model.sku().tier());
        Assertions.assertEquals("gazxuf", model.sku().family());
        Assertions.assertEquals("uckyf", model.sku().size());
        Assertions.assertEquals("rfidfvzwdz", model.sku().capacity());
        Assertions.assertEquals("ymwisdkft", model.etag());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}