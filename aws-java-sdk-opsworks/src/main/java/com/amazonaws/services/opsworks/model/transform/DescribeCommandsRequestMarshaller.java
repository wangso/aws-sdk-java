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
package com.amazonaws.services.opsworks.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeCommandsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCommandsRequestMarshaller implements Marshaller<Request<DescribeCommandsRequest>, DescribeCommandsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeCommandsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeCommandsRequest> marshall(DescribeCommandsRequest describeCommandsRequest) {

        if (describeCommandsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCommandsRequest> request = new DefaultRequest<DescribeCommandsRequest>(describeCommandsRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.DescribeCommands");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeCommandsRequest.getDeploymentId() != null) {
                jsonGenerator.writeFieldName("DeploymentId").writeValue(describeCommandsRequest.getDeploymentId());
            }
            if (describeCommandsRequest.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(describeCommandsRequest.getInstanceId());
            }

            com.amazonaws.internal.SdkInternalList<String> commandIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCommandsRequest
                    .getCommandIds();
            if (!commandIdsList.isEmpty() || !commandIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CommandIds");
                jsonGenerator.writeStartArray();
                for (String commandIdsListValue : commandIdsList) {
                    if (commandIdsListValue != null) {
                        jsonGenerator.writeValue(commandIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
