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
package com.amazonaws.services.elastictranscoder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DetectedPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedPropertiesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DetectedProperties detectedProperties, StructuredJsonGenerator jsonGenerator) {

        if (detectedProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (detectedProperties.getWidth() != null) {
                jsonGenerator.writeFieldName("Width").writeValue(detectedProperties.getWidth());
            }
            if (detectedProperties.getHeight() != null) {
                jsonGenerator.writeFieldName("Height").writeValue(detectedProperties.getHeight());
            }
            if (detectedProperties.getFrameRate() != null) {
                jsonGenerator.writeFieldName("FrameRate").writeValue(detectedProperties.getFrameRate());
            }
            if (detectedProperties.getFileSize() != null) {
                jsonGenerator.writeFieldName("FileSize").writeValue(detectedProperties.getFileSize());
            }
            if (detectedProperties.getDurationMillis() != null) {
                jsonGenerator.writeFieldName("DurationMillis").writeValue(detectedProperties.getDurationMillis());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DetectedPropertiesJsonMarshaller instance;

    public static DetectedPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectedPropertiesJsonMarshaller();
        return instance;
    }

}
