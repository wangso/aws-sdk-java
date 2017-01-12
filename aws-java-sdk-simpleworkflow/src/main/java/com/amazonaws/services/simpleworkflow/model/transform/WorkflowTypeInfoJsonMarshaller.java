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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.json.*;

/**
 * WorkflowTypeInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkflowTypeInfo workflowTypeInfo, StructuredJsonGenerator jsonGenerator) {

        if (workflowTypeInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workflowTypeInfo.getWorkflowType() != null) {
                jsonGenerator.writeFieldName("workflowType");
                WorkflowTypeJsonMarshaller.getInstance().marshall(workflowTypeInfo.getWorkflowType(), jsonGenerator);
            }
            if (workflowTypeInfo.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(workflowTypeInfo.getStatus());
            }
            if (workflowTypeInfo.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(workflowTypeInfo.getDescription());
            }
            if (workflowTypeInfo.getCreationDate() != null) {
                jsonGenerator.writeFieldName("creationDate").writeValue(workflowTypeInfo.getCreationDate());
            }
            if (workflowTypeInfo.getDeprecationDate() != null) {
                jsonGenerator.writeFieldName("deprecationDate").writeValue(workflowTypeInfo.getDeprecationDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkflowTypeInfoJsonMarshaller instance;

    public static WorkflowTypeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowTypeInfoJsonMarshaller();
        return instance;
    }

}
