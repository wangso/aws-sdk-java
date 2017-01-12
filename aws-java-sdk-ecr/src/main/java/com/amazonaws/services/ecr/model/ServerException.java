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
package com.amazonaws.services.ecr.model;

import javax.annotation.Generated;

/**
 * <p>
 * These errors are usually caused by a server-side issue.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerException extends com.amazonaws.services.ecr.model.AmazonECRException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServerException(String message) {
        super(message);
    }

}
