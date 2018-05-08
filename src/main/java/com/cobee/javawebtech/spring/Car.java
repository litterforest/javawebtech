package com.cobee.javawebtech.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean {

	@Value(value = "ford")
	private String model;

	public Car() {
		System.out.println("Car() starting...");
	}

	public Car(String model) {
		System.out.println("Car() starting...");
		this.model = model;
		System.out.println("Car() end");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}

}
