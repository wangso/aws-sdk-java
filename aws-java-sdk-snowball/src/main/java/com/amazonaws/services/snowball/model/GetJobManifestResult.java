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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobManifest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobManifestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     * </p>
     */
    private String manifestURI;

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     * </p>
     * 
     * @param manifestURI
     *        The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     */

    public void setManifestURI(String manifestURI) {
        this.manifestURI = manifestURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     * </p>
     * 
     * @return The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     */

    public String getManifestURI() {
        return this.manifestURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     * </p>
     * 
     * @param manifestURI
     *        The Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobManifestResult withManifestURI(String manifestURI) {
        setManifestURI(manifestURI);
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
        if (getManifestURI() != null)
            sb.append("ManifestURI: ").append(getManifestURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobManifestResult == false)
            return false;
        GetJobManifestResult other = (GetJobManifestResult) obj;
        if (other.getManifestURI() == null ^ this.getManifestURI() == null)
            return false;
        if (other.getManifestURI() != null && other.getManifestURI().equals(this.getManifestURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestURI() == null) ? 0 : getManifestURI().hashCode());
        return hashCode;
    }

    @Override
    public GetJobManifestResult clone() {
        try {
            return (GetJobManifestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
