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
package com.amazonaws.services.lightsail.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GetOperationsForResourceRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOperationsForResourceRequestMarshaller implements Marshaller<Request<GetOperationsForResourceRequest>, GetOperationsForResourceRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetOperationsForResourceRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetOperationsForResourceRequest> marshall(GetOperationsForResourceRequest getOperationsForResourceRequest) {

        if (getOperationsForResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetOperationsForResourceRequest> request = new DefaultRequest<GetOperationsForResourceRequest>(getOperationsForResourceRequest,
                "AmazonLightsail");
        request.addHeader("X-Amz-Target", "Lightsail_20161128.GetOperationsForResource");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getOperationsForResourceRequest.getResourceName() != null) {
                jsonGenerator.writeFieldName("resourceName").writeValue(getOperationsForResourceRequest.getResourceName());
            }
            if (getOperationsForResourceRequest.getPageToken() != null) {
                jsonGenerator.writeFieldName("pageToken").writeValue(getOperationsForResourceRequest.getPageToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
