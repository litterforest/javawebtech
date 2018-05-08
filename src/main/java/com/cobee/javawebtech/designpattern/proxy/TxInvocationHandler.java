package com.cobee.javawebtech.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TxInvocationHandler implements InvocationHandler {

	private Object target;
	
	public TxInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Method concreteClass = target.getClass().getMethod(method.getName(), method.getParameterTypes());
		Object result = null;
		Object ant = concreteClass.getAnnotation(SimpleTransactional.class);
		if (ant == null)
		{
			result = method.invoke(target, args);
		}
		else
		{
			System.out.println("------打开数据库事务");
			
			result = method.invoke(target, args);
			
			System.out.println("------提交并且关闭数据库事务");
		}
		return result;
		
	}

}
