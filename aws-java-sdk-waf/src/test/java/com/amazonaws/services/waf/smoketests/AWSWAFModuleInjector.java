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
package com.amazonaws.services.waf.smoketests;

import javax.annotation.Generated;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.services.waf.AWSWAFClient;

/**
 * Injector that binds the AmazonWebServiceClient interface to the com.amazonaws.services.waf.AWSWAFClient
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWAFModuleInjector implements InjectorSource {

    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, new AWSWAFModule());
    }

    static class AWSWAFModule extends AbstractModule {

        @Override
        protected void configure() {
            bind(AmazonWebServiceClient.class).to(AWSWAFClient.class);
        }
    }
}
