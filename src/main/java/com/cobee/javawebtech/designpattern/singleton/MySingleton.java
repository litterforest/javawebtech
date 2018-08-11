package com.cobee.javawebtech.designpattern.singleton;

/**
 * <pre>单例模式，整个应用一个类有且仅有一个实例</pre>
 * 
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月24日
 *
 */
public class MySingleton {
	
	private static final MySingleton instance;
	
	static {
		instance = new MySingleton();
	}
	
	private MySingleton(){}
	
	public static MySingleton getInstance()
	{
		return instance;
	}

}
