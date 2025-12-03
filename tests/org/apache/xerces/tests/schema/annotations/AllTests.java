/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.xerces.tests.schema.annotations;

import org.apache.xerces.tests.jaxp.JAXP12Tests;
import org.apache.xerces.tests.jaxp.JAXPSecureProcessingTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 * All XSModel Tests
 * 
 * @author Neil Delima, IBM
 * @version $Id$
 */
@Suite
@SuiteDisplayName("Tests for JAXP")
@SelectClasses({ XSAttributeGroupAnnotationsTest.class,
    XSNotationAnnotationsTest.class,
    XSElementAnnotationsTest.class,
    XSAttributeUseAnnotationsTest.class,
    XSAttributeAnnotationsTest.class,
    XSFacetAnnotationsTest.class,
    XSModelGroupDefinitionAnnotationsTest.class,
    XSModelGroupAnnotationsTest.class,
    XSParticleAnnotationsTest.class,
    XSWildcardAnnotationsTest.class }) 
public class AllTests {


}