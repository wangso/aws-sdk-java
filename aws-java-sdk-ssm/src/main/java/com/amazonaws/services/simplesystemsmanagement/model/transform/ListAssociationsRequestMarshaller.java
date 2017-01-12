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
 * ListAssociationsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociationsRequestMarshaller implements Marshaller<Request<ListAssociationsRequest>, ListAssociationsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListAssociationsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListAssociationsRequest> marshall(ListAssociationsRequest listAssociationsRequest) {

        if (listAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListAssociationsRequest> request = new DefaultRequest<ListAssociationsRequest>(listAssociationsRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.ListAssociations");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<AssociationFilter> associationFilterListList = (com.amazonaws.internal.SdkInternalList<AssociationFilter>) listAssociationsRequest
                    .getAssociationFilterList();
            if (!associationFilterListList.isEmpty() || !associationFilterListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AssociationFilterList");
                jsonGenerator.writeStartArray();
                for (AssociationFilter associationFilterListListValue : associationFilterListList) {
                    if (associationFilterListListValue != null) {

                        AssociationFilterJsonMarshaller.getInstance().marshall(associationFilterListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listAssociationsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(listAssociationsRequest.getMaxResults());
            }
            if (listAssociationsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(listAssociationsRequest.getNextToken());
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
