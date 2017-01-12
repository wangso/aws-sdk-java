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
package com.amazonaws.services.logs.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeLogGroupsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLogGroupsRequestMarshaller implements Marshaller<Request<DescribeLogGroupsRequest>, DescribeLogGroupsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeLogGroupsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeLogGroupsRequest> marshall(DescribeLogGroupsRequest describeLogGroupsRequest) {

        if (describeLogGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLogGroupsRequest> request = new DefaultRequest<DescribeLogGroupsRequest>(describeLogGroupsRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.DescribeLogGroups");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeLogGroupsRequest.getLogGroupNamePrefix() != null) {
                jsonGenerator.writeFieldName("logGroupNamePrefix").writeValue(describeLogGroupsRequest.getLogGroupNamePrefix());
            }
            if (describeLogGroupsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeLogGroupsRequest.getNextToken());
            }
            if (describeLogGroupsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("limit").writeValue(describeLogGroupsRequest.getLimit());
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
