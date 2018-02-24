package com.cobee.javawebtech.designpattern.proxy;

import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) throws Exception
	{
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		UserDao userDao = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(), new Class[]{UserDao.class}, new TxInvocationHandler(new UserDaoImpl()));
		userDao.save("cobee");
		userDao.hashCode();
	}
	
}
