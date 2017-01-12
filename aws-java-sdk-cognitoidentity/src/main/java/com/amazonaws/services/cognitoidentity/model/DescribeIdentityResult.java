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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A description of the identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DescribeIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens.
     * </p>
     */
    private java.util.List<String> logins;
    /**
     * <p>
     * Date on which the identity was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Date on which the identity was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityResult withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens.
     * </p>
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens.
     */

    public java.util.List<String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens.
     */

    public void setLogins(java.util.Collection<String> logins) {
        if (logins == null) {
            this.logins = null;
            return;
        }

        this.logins = new java.util.ArrayList<String>(logins);
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogins(java.util.Collection)} or {@link #withLogins(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityResult withLogins(String... logins) {
        if (this.logins == null) {
            setLogins(new java.util.ArrayList<String>(logins.length));
        }
        for (String ele : logins) {
            this.logins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityResult withLogins(java.util.Collection<String> logins) {
        setLogins(logins);
        return this;
    }

    /**
     * <p>
     * Date on which the identity was created.
     * </p>
     * 
     * @param creationDate
     *        Date on which the identity was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Date on which the identity was created.
     * </p>
     * 
     * @return Date on which the identity was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * Date on which the identity was created.
     * </p>
     * 
     * @param creationDate
     *        Date on which the identity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Date on which the identity was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date on which the identity was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date on which the identity was last modified.
     * </p>
     * 
     * @return Date on which the identity was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Date on which the identity was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date on which the identity was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getLogins() != null)
            sb.append("Logins: ").append(getLogins()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityResult == false)
            return false;
        DescribeIdentityResult other = (DescribeIdentityResult) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityResult clone() {
        try {
            return (DescribeIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
