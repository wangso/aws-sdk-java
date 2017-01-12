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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * PutItemRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutItemRequestMarshaller implements Marshaller<Request<PutItemRequest>, PutItemRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutItemRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutItemRequest> marshall(PutItemRequest putItemRequest) {

        if (putItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutItemRequest> request = new DefaultRequest<PutItemRequest>(putItemRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.PutItem");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (putItemRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(putItemRequest.getTableName());
            }

            java.util.Map<String, AttributeValue> itemMap = putItemRequest.getItem();
            if (itemMap != null) {
                jsonGenerator.writeFieldName("Item");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> itemMapValue : itemMap.entrySet()) {
                    if (itemMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(itemMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(itemMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, ExpectedAttributeValue> expectedMap = putItemRequest.getExpected();
            if (expectedMap != null) {
                jsonGenerator.writeFieldName("Expected");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, ExpectedAttributeValue> expectedMapValue : expectedMap.entrySet()) {
                    if (expectedMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expectedMapValue.getKey());

                        ExpectedAttributeValueJsonMarshaller.getInstance().marshall(expectedMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (putItemRequest.getReturnValues() != null) {
                jsonGenerator.writeFieldName("ReturnValues").writeValue(putItemRequest.getReturnValues());
            }
            if (putItemRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity").writeValue(putItemRequest.getReturnConsumedCapacity());
            }
            if (putItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonGenerator.writeFieldName("ReturnItemCollectionMetrics").writeValue(putItemRequest.getReturnItemCollectionMetrics());
            }
            if (putItemRequest.getConditionalOperator() != null) {
                jsonGenerator.writeFieldName("ConditionalOperator").writeValue(putItemRequest.getConditionalOperator());
            }
            if (putItemRequest.getConditionExpression() != null) {
                jsonGenerator.writeFieldName("ConditionExpression").writeValue(putItemRequest.getConditionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = putItemRequest.getExpressionAttributeNames();
            if (expressionAttributeNamesMap != null) {
                jsonGenerator.writeFieldName("ExpressionAttributeNames");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> expressionAttributeNamesMapValue : expressionAttributeNamesMap.entrySet()) {
                    if (expressionAttributeNamesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expressionAttributeNamesMapValue.getKey());

                        jsonGenerator.writeValue(expressionAttributeNamesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = putItemRequest.getExpressionAttributeValues();
            if (expressionAttributeValuesMap != null) {
                jsonGenerator.writeFieldName("ExpressionAttributeValues");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> expressionAttributeValuesMapValue : expressionAttributeValuesMap.entrySet()) {
                    if (expressionAttributeValuesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expressionAttributeValuesMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(expressionAttributeValuesMapValue.getValue(), jsonGenerator);
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
