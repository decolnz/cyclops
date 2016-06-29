/*
 * Copyright (c) 2016. Zuercher Hochschule fuer Angewandte Wissenschaften
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */

package ch.icclab.cyclops.endpoint;

import ch.icclab.cyclops.util.APICallCounter;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Author: Skoviera
 * Created: 21/01/16
 * Description: Serve application's version over root endpoint
 */
public class RootEndpoint extends ServerResource {

    // used as counter
    private APICallCounter counter = APICallCounter.getInstance();

    public static String ENDPOINT = "/";

    @Get
    public String root(){
        counter.increment(ENDPOINT);
        return "RCB CDR micro service - version 1.0.1";
    }
}
