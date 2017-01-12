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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.io.ByteArrayInputStream;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DescribeConnectionsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectionsRequestMarshaller implements Marshaller<Request<DescribeConnectionsRequest>, DescribeConnectionsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeConnectionsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeConnectionsRequest> marshall(DescribeConnectionsRequest describeConnectionsRequest) {

        if (describeConnectionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeConnectionsRequest> request = new DefaultRequest<DescribeConnectionsRequest>(describeConnectionsRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.DescribeConnections");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<Filter> filtersList = describeConnectionsRequest.getFilters();
            if (filtersList != null) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartArray();
                for (Filter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        FilterJsonMarshaller.getInstance().marshall(filtersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeConnectionsRequest.getMaxRecords() != null) {
                jsonGenerator.writeFieldName("MaxRecords").writeValue(describeConnectionsRequest.getMaxRecords());
            }
            if (describeConnectionsRequest.getMarker() != null) {
                jsonGenerator.writeFieldName("Marker").writeValue(describeConnectionsRequest.getMarker());
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
