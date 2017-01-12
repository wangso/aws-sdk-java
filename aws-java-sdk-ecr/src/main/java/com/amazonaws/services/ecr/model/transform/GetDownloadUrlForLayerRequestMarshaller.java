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
package com.amazonaws.services.ecr.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GetDownloadUrlForLayerRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDownloadUrlForLayerRequestMarshaller implements Marshaller<Request<GetDownloadUrlForLayerRequest>, GetDownloadUrlForLayerRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetDownloadUrlForLayerRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetDownloadUrlForLayerRequest> marshall(GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest) {

        if (getDownloadUrlForLayerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDownloadUrlForLayerRequest> request = new DefaultRequest<GetDownloadUrlForLayerRequest>(getDownloadUrlForLayerRequest, "AmazonECR");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerRegistry_V20150921.GetDownloadUrlForLayer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getDownloadUrlForLayerRequest.getRegistryId() != null) {
                jsonGenerator.writeFieldName("registryId").writeValue(getDownloadUrlForLayerRequest.getRegistryId());
            }
            if (getDownloadUrlForLayerRequest.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(getDownloadUrlForLayerRequest.getRepositoryName());
            }
            if (getDownloadUrlForLayerRequest.getLayerDigest() != null) {
                jsonGenerator.writeFieldName("layerDigest").writeValue(getDownloadUrlForLayerRequest.getLayerDigest());
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
