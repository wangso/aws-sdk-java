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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.json.*;

/**
 * SetDimensionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetDimensionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SetDimension setDimension, StructuredJsonGenerator jsonGenerator) {

        if (setDimension == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (setDimension.getDimensionType() != null) {
                jsonGenerator.writeFieldName("DimensionType").writeValue(setDimension.getDimensionType());
            }

            java.util.List<String> valuesList = setDimension.getValues();
            if (valuesList != null) {
                jsonGenerator.writeFieldName("Values");
                jsonGenerator.writeStartArray();
                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        jsonGenerator.writeValue(valuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SetDimensionJsonMarshaller instance;

    public static SetDimensionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SetDimensionJsonMarshaller();
        return instance;
    }

}
