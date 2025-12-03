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

package org.apache.xerces.tests.schema.config;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 * @author Peter McCracken, IBM
 * @version $Id$
 */
@Suite
@SuiteDisplayName("Tests for various schema validation configurations.")
@SelectClasses({ BasicTest.class,
    RootTypeDefinitionTest.class,
    RootSimpleTypeDefinitionTest.class,
    IgnoreXSIType_C_A_Test.class,
    IgnoreXSIType_C_C_Test.class,
    IgnoreXSIType_A_A_Test.class,
    IgnoreXSIType_A_C_Test.class,
    IgnoreXSIType_C_AC_Test.class,
    IgnoreXSIType_C_CA_Test.class,
    IdIdrefCheckingTest.class,
    UnparsedEntityCheckingTest.class,
    IdentityConstraintCheckingTest.class,
    UseGrammarPoolOnly_True_Test.class,
    UseGrammarPoolOnly_False_Test.class,
    FixedAttrTest.class,
    FeaturePropagationTest.class }) 
public class AllTests {
    
}