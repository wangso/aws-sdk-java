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
package com.amazonaws.services.polly.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * PutLexiconRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLexiconRequestMarshaller implements Marshaller<Request<PutLexiconRequest>, PutLexiconRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutLexiconRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutLexiconRequest> marshall(PutLexiconRequest putLexiconRequest) {

        if (putLexiconRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutLexiconRequest> request = new DefaultRequest<PutLexiconRequest>(putLexiconRequest, "AmazonPolly");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/lexicons/{LexiconName}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "LexiconName", putLexiconRequest.getName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (putLexiconRequest.getContent() != null) {
                jsonGenerator.writeFieldName("Content").writeValue(putLexiconRequest.getContent());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
