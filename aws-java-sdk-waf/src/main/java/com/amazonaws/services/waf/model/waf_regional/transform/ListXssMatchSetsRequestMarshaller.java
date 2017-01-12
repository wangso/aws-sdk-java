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
package com.amazonaws.services.waf.model.waf_regional.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ListXssMatchSetsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListXssMatchSetsRequestMarshaller implements Marshaller<Request<ListXssMatchSetsRequest>, ListXssMatchSetsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListXssMatchSetsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListXssMatchSetsRequest> marshall(ListXssMatchSetsRequest listXssMatchSetsRequest) {

        if (listXssMatchSetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListXssMatchSetsRequest> request = new DefaultRequest<ListXssMatchSetsRequest>(listXssMatchSetsRequest, "AWSWAFRegional");
        request.addHeader("X-Amz-Target", "AWSWAF_Regional_20161128.ListXssMatchSets");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listXssMatchSetsRequest.getNextMarker() != null) {
                jsonGenerator.writeFieldName("NextMarker").writeValue(listXssMatchSetsRequest.getNextMarker());
            }
            if (listXssMatchSetsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(listXssMatchSetsRequest.getLimit());
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
