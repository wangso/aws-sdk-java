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
package com.amazonaws.services.directory.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CancelSchemaExtensionRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSchemaExtensionRequestMarshaller implements Marshaller<Request<CancelSchemaExtensionRequest>, CancelSchemaExtensionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CancelSchemaExtensionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CancelSchemaExtensionRequest> marshall(CancelSchemaExtensionRequest cancelSchemaExtensionRequest) {

        if (cancelSchemaExtensionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CancelSchemaExtensionRequest> request = new DefaultRequest<CancelSchemaExtensionRequest>(cancelSchemaExtensionRequest, "AWSDirectoryService");
        request.addHeader("X-Amz-Target", "DirectoryService_20150416.CancelSchemaExtension");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (cancelSchemaExtensionRequest.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(cancelSchemaExtensionRequest.getDirectoryId());
            }
            if (cancelSchemaExtensionRequest.getSchemaExtensionId() != null) {
                jsonGenerator.writeFieldName("SchemaExtensionId").writeValue(cancelSchemaExtensionRequest.getSchemaExtensionId());
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
