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

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * PutParameterRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutParameterRequestMarshaller implements Marshaller<Request<PutParameterRequest>, PutParameterRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutParameterRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutParameterRequest> marshall(PutParameterRequest putParameterRequest) {

        if (putParameterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutParameterRequest> request = new DefaultRequest<PutParameterRequest>(putParameterRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.PutParameter");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (putParameterRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(putParameterRequest.getName());
            }
            if (putParameterRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(putParameterRequest.getDescription());
            }
            if (putParameterRequest.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(putParameterRequest.getValue());
            }
            if (putParameterRequest.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(putParameterRequest.getType());
            }
            if (putParameterRequest.getKeyId() != null) {
                jsonGenerator.writeFieldName("KeyId").writeValue(putParameterRequest.getKeyId());
            }
            if (putParameterRequest.getOverwrite() != null) {
                jsonGenerator.writeFieldName("Overwrite").writeValue(putParameterRequest.getOverwrite());
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
