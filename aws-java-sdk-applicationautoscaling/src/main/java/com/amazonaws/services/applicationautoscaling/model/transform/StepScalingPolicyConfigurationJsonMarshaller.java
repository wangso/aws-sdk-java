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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;

import com.amazonaws.protocol.json.*;

/**
 * StepScalingPolicyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepScalingPolicyConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StepScalingPolicyConfiguration stepScalingPolicyConfiguration, StructuredJsonGenerator jsonGenerator) {

        if (stepScalingPolicyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stepScalingPolicyConfiguration.getAdjustmentType() != null) {
                jsonGenerator.writeFieldName("AdjustmentType").writeValue(stepScalingPolicyConfiguration.getAdjustmentType());
            }

            java.util.List<StepAdjustment> stepAdjustmentsList = stepScalingPolicyConfiguration.getStepAdjustments();
            if (stepAdjustmentsList != null) {
                jsonGenerator.writeFieldName("StepAdjustments");
                jsonGenerator.writeStartArray();
                for (StepAdjustment stepAdjustmentsListValue : stepAdjustmentsList) {
                    if (stepAdjustmentsListValue != null) {

                        StepAdjustmentJsonMarshaller.getInstance().marshall(stepAdjustmentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (stepScalingPolicyConfiguration.getMinAdjustmentMagnitude() != null) {
                jsonGenerator.writeFieldName("MinAdjustmentMagnitude").writeValue(stepScalingPolicyConfiguration.getMinAdjustmentMagnitude());
            }
            if (stepScalingPolicyConfiguration.getCooldown() != null) {
                jsonGenerator.writeFieldName("Cooldown").writeValue(stepScalingPolicyConfiguration.getCooldown());
            }
            if (stepScalingPolicyConfiguration.getMetricAggregationType() != null) {
                jsonGenerator.writeFieldName("MetricAggregationType").writeValue(stepScalingPolicyConfiguration.getMetricAggregationType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StepScalingPolicyConfigurationJsonMarshaller instance;

    public static StepScalingPolicyConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepScalingPolicyConfigurationJsonMarshaller();
        return instance;
    }

}
