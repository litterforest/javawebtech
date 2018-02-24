package com.cobee.javawebtech.chapter11;

public interface Lifecycle {
	
//	void addLifecycleListener(Listener listener);
//	Listener[] findLifecycleListener();
//	void removeLifecycleListener(Listener listener);
	
	void start();
	void stop();
	void initialize();
	void destroy();
	
}
