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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateCustomerGatewayRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomerGatewayRequestMarshaller implements Marshaller<Request<CreateCustomerGatewayRequest>, CreateCustomerGatewayRequest> {

    public Request<CreateCustomerGatewayRequest> marshall(CreateCustomerGatewayRequest createCustomerGatewayRequest) {

        if (createCustomerGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCustomerGatewayRequest> request = new DefaultRequest<CreateCustomerGatewayRequest>(createCustomerGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "CreateCustomerGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createCustomerGatewayRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(createCustomerGatewayRequest.getType()));
        }

        if (createCustomerGatewayRequest.getPublicIp() != null) {
            request.addParameter("IpAddress", StringUtils.fromString(createCustomerGatewayRequest.getPublicIp()));
        }

        if (createCustomerGatewayRequest.getBgpAsn() != null) {
            request.addParameter("BgpAsn", StringUtils.fromInteger(createCustomerGatewayRequest.getBgpAsn()));
        }

        return request;
    }

}
