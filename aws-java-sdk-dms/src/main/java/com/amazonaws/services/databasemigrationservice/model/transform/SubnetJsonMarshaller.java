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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.json.*;

/**
 * SubnetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Subnet subnet, StructuredJsonGenerator jsonGenerator) {

        if (subnet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (subnet.getSubnetIdentifier() != null) {
                jsonGenerator.writeFieldName("SubnetIdentifier").writeValue(subnet.getSubnetIdentifier());
            }
            if (subnet.getSubnetAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("SubnetAvailabilityZone");
                AvailabilityZoneJsonMarshaller.getInstance().marshall(subnet.getSubnetAvailabilityZone(), jsonGenerator);
            }
            if (subnet.getSubnetStatus() != null) {
                jsonGenerator.writeFieldName("SubnetStatus").writeValue(subnet.getSubnetStatus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SubnetJsonMarshaller instance;

    public static SubnetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubnetJsonMarshaller();
        return instance;
    }

}
