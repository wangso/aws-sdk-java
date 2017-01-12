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
package com.amazonaws.services.marketplacecommerceanalytics.model.transform;

import java.io.ByteArrayInputStream;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.marketplacecommerceanalytics.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GenerateDataSetRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateDataSetRequestMarshaller implements Marshaller<Request<GenerateDataSetRequest>, GenerateDataSetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GenerateDataSetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GenerateDataSetRequest> marshall(GenerateDataSetRequest generateDataSetRequest) {

        if (generateDataSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GenerateDataSetRequest> request = new DefaultRequest<GenerateDataSetRequest>(generateDataSetRequest, "AWSMarketplaceCommerceAnalytics");
        request.addHeader("X-Amz-Target", "MarketplaceCommerceAnalytics20150701.GenerateDataSet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (generateDataSetRequest.getDataSetType() != null) {
                jsonGenerator.writeFieldName("dataSetType").writeValue(generateDataSetRequest.getDataSetType());
            }
            if (generateDataSetRequest.getDataSetPublicationDate() != null) {
                jsonGenerator.writeFieldName("dataSetPublicationDate").writeValue(generateDataSetRequest.getDataSetPublicationDate());
            }
            if (generateDataSetRequest.getRoleNameArn() != null) {
                jsonGenerator.writeFieldName("roleNameArn").writeValue(generateDataSetRequest.getRoleNameArn());
            }
            if (generateDataSetRequest.getDestinationS3BucketName() != null) {
                jsonGenerator.writeFieldName("destinationS3BucketName").writeValue(generateDataSetRequest.getDestinationS3BucketName());
            }
            if (generateDataSetRequest.getDestinationS3Prefix() != null) {
                jsonGenerator.writeFieldName("destinationS3Prefix").writeValue(generateDataSetRequest.getDestinationS3Prefix());
            }
            if (generateDataSetRequest.getSnsTopicArn() != null) {
                jsonGenerator.writeFieldName("snsTopicArn").writeValue(generateDataSetRequest.getSnsTopicArn());
            }

            java.util.Map<String, String> customerDefinedValuesMap = generateDataSetRequest.getCustomerDefinedValues();
            if (customerDefinedValuesMap != null) {
                jsonGenerator.writeFieldName("customerDefinedValues");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> customerDefinedValuesMapValue : customerDefinedValuesMap.entrySet()) {
                    if (customerDefinedValuesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(customerDefinedValuesMapValue.getKey());

                        jsonGenerator.writeValue(customerDefinedValuesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
