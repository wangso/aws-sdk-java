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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifySnapshotCopyRetentionPeriodRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotCopyRetentionPeriodRequestMarshaller implements
        Marshaller<Request<ModifySnapshotCopyRetentionPeriodRequest>, ModifySnapshotCopyRetentionPeriodRequest> {

    public Request<ModifySnapshotCopyRetentionPeriodRequest> marshall(ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) {

        if (modifySnapshotCopyRetentionPeriodRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySnapshotCopyRetentionPeriodRequest> request = new DefaultRequest<ModifySnapshotCopyRetentionPeriodRequest>(
                modifySnapshotCopyRetentionPeriodRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifySnapshotCopyRetentionPeriod");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySnapshotCopyRetentionPeriodRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(modifySnapshotCopyRetentionPeriodRequest.getClusterIdentifier()));
        }

        if (modifySnapshotCopyRetentionPeriodRequest.getRetentionPeriod() != null) {
            request.addParameter("RetentionPeriod", StringUtils.fromInteger(modifySnapshotCopyRetentionPeriodRequest.getRetentionPeriod()));
        }

        return request;
    }

}
