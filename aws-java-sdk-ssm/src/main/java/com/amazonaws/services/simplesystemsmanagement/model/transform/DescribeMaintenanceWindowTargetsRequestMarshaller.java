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
 * DescribeMaintenanceWindowTargetsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowTargetsRequestMarshaller implements
        Marshaller<Request<DescribeMaintenanceWindowTargetsRequest>, DescribeMaintenanceWindowTargetsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeMaintenanceWindowTargetsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeMaintenanceWindowTargetsRequest> marshall(DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest) {

        if (describeMaintenanceWindowTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeMaintenanceWindowTargetsRequest> request = new DefaultRequest<DescribeMaintenanceWindowTargetsRequest>(
                describeMaintenanceWindowTargetsRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.DescribeMaintenanceWindowTargets");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeMaintenanceWindowTargetsRequest.getWindowId() != null) {
                jsonGenerator.writeFieldName("WindowId").writeValue(describeMaintenanceWindowTargetsRequest.getWindowId());
            }

            com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter> filtersList = (com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter>) describeMaintenanceWindowTargetsRequest
                    .getFilters();
            if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartArray();
                for (MaintenanceWindowFilter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        MaintenanceWindowFilterJsonMarshaller.getInstance().marshall(filtersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeMaintenanceWindowTargetsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(describeMaintenanceWindowTargetsRequest.getMaxResults());
            }
            if (describeMaintenanceWindowTargetsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeMaintenanceWindowTargetsRequest.getNextToken());
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
