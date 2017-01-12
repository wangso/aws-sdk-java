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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DeleteApplicationRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationRequestMarshaller implements Marshaller<Request<DeleteApplicationRequest>, DeleteApplicationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteApplicationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteApplicationRequest> marshall(DeleteApplicationRequest deleteApplicationRequest) {

        if (deleteApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteApplicationRequest> request = new DefaultRequest<DeleteApplicationRequest>(deleteApplicationRequest, "AmazonKinesisAnalytics");
        request.addHeader("X-Amz-Target", "KinesisAnalytics_20150814.DeleteApplication");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (deleteApplicationRequest.getApplicationName() != null) {
                jsonGenerator.writeFieldName("ApplicationName").writeValue(deleteApplicationRequest.getApplicationName());
            }
            if (deleteApplicationRequest.getCreateTimestamp() != null) {
                jsonGenerator.writeFieldName("CreateTimestamp").writeValue(deleteApplicationRequest.getCreateTimestamp());
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
