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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.json.*;

/**
 * HttpMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Http http, StructuredJsonGenerator jsonGenerator) {

        if (http == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (http.getHttpURL() != null) {
                jsonGenerator.writeFieldName("HttpURL").writeValue(http.getHttpURL());
            }
            if (http.getHttpStatus() != null) {
                jsonGenerator.writeFieldName("HttpStatus").writeValue(http.getHttpStatus());
            }
            if (http.getHttpMethod() != null) {
                jsonGenerator.writeFieldName("HttpMethod").writeValue(http.getHttpMethod());
            }
            if (http.getUserAgent() != null) {
                jsonGenerator.writeFieldName("UserAgent").writeValue(http.getUserAgent());
            }
            if (http.getClientIp() != null) {
                jsonGenerator.writeFieldName("ClientIp").writeValue(http.getClientIp());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HttpJsonMarshaller instance;

    public static HttpJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpJsonMarshaller();
        return instance;
    }

}
