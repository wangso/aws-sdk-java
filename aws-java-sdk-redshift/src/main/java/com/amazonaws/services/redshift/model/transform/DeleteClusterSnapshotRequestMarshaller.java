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
 * DeleteClusterSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterSnapshotRequestMarshaller implements Marshaller<Request<DeleteClusterSnapshotRequest>, DeleteClusterSnapshotRequest> {

    public Request<DeleteClusterSnapshotRequest> marshall(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) {

        if (deleteClusterSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteClusterSnapshotRequest> request = new DefaultRequest<DeleteClusterSnapshotRequest>(deleteClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteClusterSnapshot");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(deleteClusterSnapshotRequest.getSnapshotIdentifier()));
        }

        if (deleteClusterSnapshotRequest.getSnapshotClusterIdentifier() != null) {
            request.addParameter("SnapshotClusterIdentifier", StringUtils.fromString(deleteClusterSnapshotRequest.getSnapshotClusterIdentifier()));
        }

        return request;
    }

}
