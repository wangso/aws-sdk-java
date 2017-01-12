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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeStreamRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamRequestMarshaller implements Marshaller<Request<DescribeStreamRequest>, DescribeStreamRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeStreamRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeStreamRequest> marshall(DescribeStreamRequest describeStreamRequest) {

        if (describeStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStreamRequest> request = new DefaultRequest<DescribeStreamRequest>(describeStreamRequest, "AmazonDynamoDBStreams");
        request.addHeader("X-Amz-Target", "DynamoDBStreams_20120810.DescribeStream");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeStreamRequest.getStreamArn() != null) {
                jsonGenerator.writeFieldName("StreamArn").writeValue(describeStreamRequest.getStreamArn());
            }
            if (describeStreamRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeStreamRequest.getLimit());
            }
            if (describeStreamRequest.getExclusiveStartShardId() != null) {
                jsonGenerator.writeFieldName("ExclusiveStartShardId").writeValue(describeStreamRequest.getExclusiveStartShardId());
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
