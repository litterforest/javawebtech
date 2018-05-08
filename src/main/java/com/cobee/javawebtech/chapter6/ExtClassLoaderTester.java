package com.cobee.javawebtech.chapter6;

public class ExtClassLoaderTester {

	public ExtClassLoaderTester() 
	{
		throw new ExceptionInInitializerError("初始化实例出错");
	}
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println(System.getProperty("java.class.path"));
		ExtClassLoaderTester extClassLoaderTester = new ExtClassLoaderTester();
		System.out.println(extClassLoaderTester.getClass().getClassLoader().getResource("").toString());
		
		Object obj = new String("I am a boy");
		String str = null;
		if (obj instanceof String)
		{
			str = (String) obj;
		}
		System.out.println(str);
	}

}
