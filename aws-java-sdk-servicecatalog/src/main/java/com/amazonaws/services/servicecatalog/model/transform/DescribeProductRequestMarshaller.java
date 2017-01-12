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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeProductRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductRequestMarshaller implements Marshaller<Request<DescribeProductRequest>, DescribeProductRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeProductRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeProductRequest> marshall(DescribeProductRequest describeProductRequest) {

        if (describeProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeProductRequest> request = new DefaultRequest<DescribeProductRequest>(describeProductRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.DescribeProduct");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeProductRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(describeProductRequest.getAcceptLanguage());
            }
            if (describeProductRequest.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(describeProductRequest.getId());
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
