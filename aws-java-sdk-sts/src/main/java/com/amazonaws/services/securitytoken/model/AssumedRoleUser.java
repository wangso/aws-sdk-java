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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The identifiers for the temporary security credentials that the operation returns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumedRoleUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumedRoleUser implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that contains the role ID and the role session name of the role that is being assumed. The
     * role ID is generated by AWS when the role is created.
     * </p>
     */
    private String assumedRoleId;
    /**
     * <p>
     * The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For more
     * information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * A unique identifier that contains the role ID and the role session name of the role that is being assumed. The
     * role ID is generated by AWS when the role is created.
     * </p>
     * 
     * @param assumedRoleId
     *        A unique identifier that contains the role ID and the role session name of the role that is being assumed.
     *        The role ID is generated by AWS when the role is created.
     */

    public void setAssumedRoleId(String assumedRoleId) {
        this.assumedRoleId = assumedRoleId;
    }

    /**
     * <p>
     * A unique identifier that contains the role ID and the role session name of the role that is being assumed. The
     * role ID is generated by AWS when the role is created.
     * </p>
     * 
     * @return A unique identifier that contains the role ID and the role session name of the role that is being
     *         assumed. The role ID is generated by AWS when the role is created.
     */

    public String getAssumedRoleId() {
        return this.assumedRoleId;
    }

    /**
     * <p>
     * A unique identifier that contains the role ID and the role session name of the role that is being assumed. The
     * role ID is generated by AWS when the role is created.
     * </p>
     * 
     * @param assumedRoleId
     *        A unique identifier that contains the role ID and the role session name of the role that is being assumed.
     *        The role ID is generated by AWS when the role is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRoleUser withAssumedRoleId(String assumedRoleId) {
        setAssumedRoleId(assumedRoleId);
        return this;
    }

    /**
     * <p>
     * The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For more
     * information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @param arn
     *        The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For
     *        more information about ARNs and how to use them in policies, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        <i>Using IAM</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For more
     * information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @return The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *         <i>Using IAM</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For more
     * information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @param arn
     *        The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For
     *        more information about ARNs and how to use them in policies, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        <i>Using IAM</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRoleUser withArn(String arn) {
        setArn(arn);
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
        if (getAssumedRoleId() != null)
            sb.append("AssumedRoleId: ").append(getAssumedRoleId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumedRoleUser == false)
            return false;
        AssumedRoleUser other = (AssumedRoleUser) obj;
        if (other.getAssumedRoleId() == null ^ this.getAssumedRoleId() == null)
            return false;
        if (other.getAssumedRoleId() != null && other.getAssumedRoleId().equals(this.getAssumedRoleId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssumedRoleId() == null) ? 0 : getAssumedRoleId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public AssumedRoleUser clone() {
        try {
            return (AssumedRoleUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
