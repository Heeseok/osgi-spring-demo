package ch.hsr.ins.osgi.spring.demo;

import static org.osgi.framework.Constants.FRAMEWORK_VENDOR;
import static org.osgi.framework.Constants.FRAMEWORK_VERSION;

import org.osgi.framework.Bundle;
import org.springframework.osgi.test.AbstractConfigurableBundleCreatorTests;

public class OsgiDemoTest extends AbstractConfigurableBundleCreatorTests {

	protected String[] getTestBundlesNames() {
		return new String[] {
				"ch.hsr.ins.osgi.spring.demo, osgi-spring-demo-core, 0.0.1-SNAPSHOT",
				"ch.hsr.ins.osgi.spring.demo, osgi-spring-demo-service, 0.0.1-SNAPSHOT",
				"ch.hsr.ins.osgi.spring.demo, osgi-spring-demo-client, 0.0.1-SNAPSHOT",
				"org.apache.felix, org.apache.felix.configadmin, 1.4.0",
				"org.apache.aries, org.apache.aries.util, 0.4",
				"org.apache.aries.proxy, org.apache.aries.proxy, 0.4.1",
				"org.apache.aries.blueprint, org.apache.aries.blueprint, 0.4" };
	}

	public void testOsgiPlatform() throws Exception {
		logger.info(bundleContext.getProperty(FRAMEWORK_VENDOR));
		logger.info(bundleContext.getProperty(FRAMEWORK_VERSION));
	}

	public void testOsgiEnviroment() {
		for (Bundle bundle : bundleContext.getBundles()) {
			logger.info(bundle);
		}
	}

}
