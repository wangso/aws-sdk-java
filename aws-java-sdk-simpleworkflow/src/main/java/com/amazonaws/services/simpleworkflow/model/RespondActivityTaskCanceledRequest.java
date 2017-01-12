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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RespondActivityTaskCanceledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important><code>taskToken</code> is generated by the service and should be treated as an opaque value. If the
     * task is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.</important>
     */
    private String taskToken;
    /**
     * <p>
     * <i>Optional.</i> Information about the cancellation.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important><code>taskToken</code> is generated by the service and should be treated as an opaque value. If the
     * task is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.</important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important><code>taskToken</code> is generated
     *        by the service and should be treated as an opaque value. If the task is passed to another process, its
     *        <code>taskToken</code> must also be passed. This enables it to provide its progress and respond with
     *        results.
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important><code>taskToken</code> is generated by the service and should be treated as an opaque value. If the
     * task is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.</important>
     * 
     * @return The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important><code>taskToken</code> is generated
     *         by the service and should be treated as an opaque value. If the task is passed to another process, its
     *         <code>taskToken</code> must also be passed. This enables it to provide its progress and respond with
     *         results.
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important><code>taskToken</code> is generated by the service and should be treated as an opaque value. If the
     * task is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.</important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important><code>taskToken</code> is generated
     *        by the service and should be treated as an opaque value. If the task is passed to another process, its
     *        <code>taskToken</code> must also be passed. This enables it to provide its progress and respond with
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondActivityTaskCanceledRequest withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Information about the cancellation.
     * </p>
     * 
     * @param details
     *        Optional.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * <i>Optional.</i> Information about the cancellation.
     * </p>
     * 
     * @return Optional.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * <i>Optional.</i> Information about the cancellation.
     * </p>
     * 
     * @param details
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondActivityTaskCanceledRequest withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondActivityTaskCanceledRequest == false)
            return false;
        RespondActivityTaskCanceledRequest other = (RespondActivityTaskCanceledRequest) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public RespondActivityTaskCanceledRequest clone() {
        return (RespondActivityTaskCanceledRequest) super.clone();
    }

}
