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
package com.amazonaws.services.kms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.json.*;

/**
 * GrantListEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantListEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GrantListEntry grantListEntry, StructuredJsonGenerator jsonGenerator) {

        if (grantListEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (grantListEntry.getKeyId() != null) {
                jsonGenerator.writeFieldName("KeyId").writeValue(grantListEntry.getKeyId());
            }
            if (grantListEntry.getGrantId() != null) {
                jsonGenerator.writeFieldName("GrantId").writeValue(grantListEntry.getGrantId());
            }
            if (grantListEntry.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(grantListEntry.getName());
            }
            if (grantListEntry.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(grantListEntry.getCreationDate());
            }
            if (grantListEntry.getGranteePrincipal() != null) {
                jsonGenerator.writeFieldName("GranteePrincipal").writeValue(grantListEntry.getGranteePrincipal());
            }
            if (grantListEntry.getRetiringPrincipal() != null) {
                jsonGenerator.writeFieldName("RetiringPrincipal").writeValue(grantListEntry.getRetiringPrincipal());
            }
            if (grantListEntry.getIssuingAccount() != null) {
                jsonGenerator.writeFieldName("IssuingAccount").writeValue(grantListEntry.getIssuingAccount());
            }

            com.amazonaws.internal.SdkInternalList<String> operationsList = (com.amazonaws.internal.SdkInternalList<String>) grantListEntry.getOperations();
            if (!operationsList.isEmpty() || !operationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Operations");
                jsonGenerator.writeStartArray();
                for (String operationsListValue : operationsList) {
                    if (operationsListValue != null) {
                        jsonGenerator.writeValue(operationsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (grantListEntry.getConstraints() != null) {
                jsonGenerator.writeFieldName("Constraints");
                GrantConstraintsJsonMarshaller.getInstance().marshall(grantListEntry.getConstraints(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GrantListEntryJsonMarshaller instance;

    public static GrantListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrantListEntryJsonMarshaller();
        return instance;
    }

}
