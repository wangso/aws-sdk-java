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
 * DescribeExportTasksRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequestMarshaller implements Marshaller<Request<DescribeExportTasksRequest>, DescribeExportTasksRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeExportTasksRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeExportTasksRequest> marshall(DescribeExportTasksRequest describeExportTasksRequest) {

        if (describeExportTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeExportTasksRequest> request = new DefaultRequest<DescribeExportTasksRequest>(describeExportTasksRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.DescribeExportTasks");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeExportTasksRequest.getTaskId() != null) {
                jsonGenerator.writeFieldName("taskId").writeValue(describeExportTasksRequest.getTaskId());
            }
            if (describeExportTasksRequest.getStatusCode() != null) {
                jsonGenerator.writeFieldName("statusCode").writeValue(describeExportTasksRequest.getStatusCode());
            }
            if (describeExportTasksRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeExportTasksRequest.getNextToken());
            }
            if (describeExportTasksRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("limit").writeValue(describeExportTasksRequest.getLimit());
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
