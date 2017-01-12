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
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GetIntegrationRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntegrationRequestMarshaller implements Marshaller<Request<GetIntegrationRequest>, GetIntegrationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetIntegrationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetIntegrationRequest> marshall(GetIntegrationRequest getIntegrationRequest) {

        if (getIntegrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetIntegrationRequest> request = new DefaultRequest<GetIntegrationRequest>(getIntegrationRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id", getIntegrationRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "resource_id", getIntegrationRequest.getResourceId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "http_method", getIntegrationRequest.getHttpMethod());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
