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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.json.*;

/**
 * FaceRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FaceRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FaceRecord faceRecord, StructuredJsonGenerator jsonGenerator) {

        if (faceRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (faceRecord.getFace() != null) {
                jsonGenerator.writeFieldName("Face");
                FaceJsonMarshaller.getInstance().marshall(faceRecord.getFace(), jsonGenerator);
            }
            if (faceRecord.getFaceDetail() != null) {
                jsonGenerator.writeFieldName("FaceDetail");
                FaceDetailJsonMarshaller.getInstance().marshall(faceRecord.getFaceDetail(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FaceRecordJsonMarshaller instance;

    public static FaceRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceRecordJsonMarshaller();
        return instance;
    }

}
