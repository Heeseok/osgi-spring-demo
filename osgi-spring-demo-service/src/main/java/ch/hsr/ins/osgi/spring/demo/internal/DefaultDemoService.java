package ch.hsr.ins.osgi.spring.demo.internal;

import ch.hsr.ins.osgi.spring.demo.DemoService;

public class DefaultDemoService implements DemoService {

	public void start() {
		System.out.println(getClass().getSimpleName() + " starting...");
	}
	
	public void demo() {
		System.out.println("Hello world!");
	}

}
