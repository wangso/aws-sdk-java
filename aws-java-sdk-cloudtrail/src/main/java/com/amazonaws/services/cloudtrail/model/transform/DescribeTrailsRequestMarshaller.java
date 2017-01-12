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
package com.amazonaws.services.cloudtrail.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeTrailsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrailsRequestMarshaller implements Marshaller<Request<DescribeTrailsRequest>, DescribeTrailsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeTrailsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeTrailsRequest> marshall(DescribeTrailsRequest describeTrailsRequest) {

        if (describeTrailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrailsRequest> request = new DefaultRequest<DescribeTrailsRequest>(describeTrailsRequest, "AWSCloudTrail");
        request.addHeader("X-Amz-Target", "com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101.DescribeTrails");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> trailNameListList = (com.amazonaws.internal.SdkInternalList<String>) describeTrailsRequest
                    .getTrailNameList();
            if (!trailNameListList.isEmpty() || !trailNameListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("trailNameList");
                jsonGenerator.writeStartArray();
                for (String trailNameListListValue : trailNameListList) {
                    if (trailNameListListValue != null) {
                        jsonGenerator.writeValue(trailNameListListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeTrailsRequest.getIncludeShadowTrails() != null) {
                jsonGenerator.writeFieldName("includeShadowTrails").writeValue(describeTrailsRequest.getIncludeShadowTrails());
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
