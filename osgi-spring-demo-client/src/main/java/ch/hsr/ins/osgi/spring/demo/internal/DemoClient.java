package ch.hsr.ins.osgi.spring.demo.internal;

import ch.hsr.ins.osgi.spring.demo.DemoService;

public class DemoClient {

	private DemoService demoService;

	public void start() {
		System.out.println(getClass().getSimpleName() + " starting...");
		demoService.demo();
	}

	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

}
