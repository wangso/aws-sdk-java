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
package com.amazonaws.services.inspector.model.transform;

import java.io.ByteArrayInputStream;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * AddAttributesToFindingsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddAttributesToFindingsRequestMarshaller implements Marshaller<Request<AddAttributesToFindingsRequest>, AddAttributesToFindingsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AddAttributesToFindingsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AddAttributesToFindingsRequest> marshall(AddAttributesToFindingsRequest addAttributesToFindingsRequest) {

        if (addAttributesToFindingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddAttributesToFindingsRequest> request = new DefaultRequest<AddAttributesToFindingsRequest>(addAttributesToFindingsRequest, "AmazonInspector");
        request.addHeader("X-Amz-Target", "InspectorService.AddAttributesToFindings");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<String> findingArnsList = addAttributesToFindingsRequest.getFindingArns();
            if (findingArnsList != null) {
                jsonGenerator.writeFieldName("findingArns");
                jsonGenerator.writeStartArray();
                for (String findingArnsListValue : findingArnsList) {
                    if (findingArnsListValue != null) {
                        jsonGenerator.writeValue(findingArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> attributesList = addAttributesToFindingsRequest.getAttributes();
            if (attributesList != null) {
                jsonGenerator.writeFieldName("attributes");
                jsonGenerator.writeStartArray();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
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
