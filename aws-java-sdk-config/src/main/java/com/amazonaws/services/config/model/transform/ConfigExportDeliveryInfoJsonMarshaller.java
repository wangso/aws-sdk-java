/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ConfigExportDeliveryInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigExportDeliveryInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConfigExportDeliveryInfo configExportDeliveryInfo, StructuredJsonGenerator jsonGenerator) {

        if (configExportDeliveryInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configExportDeliveryInfo.getLastStatus() != null) {
                jsonGenerator.writeFieldName("lastStatus").writeValue(configExportDeliveryInfo.getLastStatus());
            }
            if (configExportDeliveryInfo.getLastErrorCode() != null) {
                jsonGenerator.writeFieldName("lastErrorCode").writeValue(configExportDeliveryInfo.getLastErrorCode());
            }
            if (configExportDeliveryInfo.getLastErrorMessage() != null) {
                jsonGenerator.writeFieldName("lastErrorMessage").writeValue(configExportDeliveryInfo.getLastErrorMessage());
            }
            if (configExportDeliveryInfo.getLastAttemptTime() != null) {
                jsonGenerator.writeFieldName("lastAttemptTime").writeValue(configExportDeliveryInfo.getLastAttemptTime());
            }
            if (configExportDeliveryInfo.getLastSuccessfulTime() != null) {
                jsonGenerator.writeFieldName("lastSuccessfulTime").writeValue(configExportDeliveryInfo.getLastSuccessfulTime());
            }
            if (configExportDeliveryInfo.getNextDeliveryTime() != null) {
                jsonGenerator.writeFieldName("nextDeliveryTime").writeValue(configExportDeliveryInfo.getNextDeliveryTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigExportDeliveryInfoJsonMarshaller instance;

    public static ConfigExportDeliveryInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigExportDeliveryInfoJsonMarshaller();
        return instance;
    }

}
