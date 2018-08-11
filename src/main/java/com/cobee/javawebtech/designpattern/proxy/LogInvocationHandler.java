package com.cobee.javawebtech.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public LogInvocationHandler() {}
	
	public LogInvocationHandler(Object target)
	{
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("记录日志开始......");
		Object result = method.invoke(target, args);
		System.out.println("记录日志结束......");
		
		return result;
	}

}
