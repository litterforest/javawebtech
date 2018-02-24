package com.cobee.javawebtech.spring;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<String> {

	public String getObject() throws Exception {
		return String.valueOf(System.currentTimeMillis());
	}

	public Class<?> getObjectType() {
		return String.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
