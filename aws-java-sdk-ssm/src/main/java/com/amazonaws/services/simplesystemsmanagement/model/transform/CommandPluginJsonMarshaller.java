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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.json.*;

/**
 * CommandPluginMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandPluginJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CommandPlugin commandPlugin, StructuredJsonGenerator jsonGenerator) {

        if (commandPlugin == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (commandPlugin.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(commandPlugin.getName());
            }
            if (commandPlugin.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(commandPlugin.getStatus());
            }
            if (commandPlugin.getStatusDetails() != null) {
                jsonGenerator.writeFieldName("StatusDetails").writeValue(commandPlugin.getStatusDetails());
            }
            if (commandPlugin.getResponseCode() != null) {
                jsonGenerator.writeFieldName("ResponseCode").writeValue(commandPlugin.getResponseCode());
            }
            if (commandPlugin.getResponseStartDateTime() != null) {
                jsonGenerator.writeFieldName("ResponseStartDateTime").writeValue(commandPlugin.getResponseStartDateTime());
            }
            if (commandPlugin.getResponseFinishDateTime() != null) {
                jsonGenerator.writeFieldName("ResponseFinishDateTime").writeValue(commandPlugin.getResponseFinishDateTime());
            }
            if (commandPlugin.getOutput() != null) {
                jsonGenerator.writeFieldName("Output").writeValue(commandPlugin.getOutput());
            }
            if (commandPlugin.getStandardOutputUrl() != null) {
                jsonGenerator.writeFieldName("StandardOutputUrl").writeValue(commandPlugin.getStandardOutputUrl());
            }
            if (commandPlugin.getStandardErrorUrl() != null) {
                jsonGenerator.writeFieldName("StandardErrorUrl").writeValue(commandPlugin.getStandardErrorUrl());
            }
            if (commandPlugin.getOutputS3Region() != null) {
                jsonGenerator.writeFieldName("OutputS3Region").writeValue(commandPlugin.getOutputS3Region());
            }
            if (commandPlugin.getOutputS3BucketName() != null) {
                jsonGenerator.writeFieldName("OutputS3BucketName").writeValue(commandPlugin.getOutputS3BucketName());
            }
            if (commandPlugin.getOutputS3KeyPrefix() != null) {
                jsonGenerator.writeFieldName("OutputS3KeyPrefix").writeValue(commandPlugin.getOutputS3KeyPrefix());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CommandPluginJsonMarshaller instance;

    public static CommandPluginJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandPluginJsonMarshaller();
        return instance;
    }

}
