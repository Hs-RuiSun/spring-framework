package com.ruby.sun.bean;

import org.springframework.context.Lifecycle;

public class ConnectorBean implements Lifecycle{

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

}
