/*
 * Copyright (c) OSGi Alliance (2011, 2013). All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.osgi.test.cases.framework.secure.weaving.tb.woven;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.hooks.weaving.WeavingHook;
import org.osgi.test.cases.framework.secure.junit.hooks.weaving.TestConstants;
import org.osgi.test.support.OSGiTestCase;

public class Activator extends OSGiTestCase implements BundleActivator {
	private ServiceRegistration<WeavingHook> reg;
	
	public void start(BundleContext context) throws Exception {
		TestWeavingHook hook = new TestWeavingHook();
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(Constants.SERVICE_RANKING, Integer.MAX_VALUE);
		reg = context.registerService(WeavingHook.class, hook, properties);
		try {
			Class.forName(TestConstants.WOVEN_CLASS);
		} catch (Exception e) {
			fail("Class should have loaded", e);
		}
		assertTrue("Failed to call weaving hook", hook.isCalled());
	}

	public void stop(BundleContext context) throws Exception {
		try {
			reg.unregister();
		}
		catch (Exception e) {}
	}
}