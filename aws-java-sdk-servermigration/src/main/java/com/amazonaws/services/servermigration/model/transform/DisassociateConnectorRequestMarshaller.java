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
package com.amazonaws.services.servermigration.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DisassociateConnectorRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateConnectorRequestMarshaller implements Marshaller<Request<DisassociateConnectorRequest>, DisassociateConnectorRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DisassociateConnectorRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DisassociateConnectorRequest> marshall(DisassociateConnectorRequest disassociateConnectorRequest) {

        if (disassociateConnectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateConnectorRequest> request = new DefaultRequest<DisassociateConnectorRequest>(disassociateConnectorRequest, "AWSServerMigration");
        request.addHeader("X-Amz-Target", "AWSServerMigrationService_V2016_10_24.DisassociateConnector");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (disassociateConnectorRequest.getConnectorId() != null) {
                jsonGenerator.writeFieldName("connectorId").writeValue(disassociateConnectorRequest.getConnectorId());
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
