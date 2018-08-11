package com.cobee.javawebtech.chapter6;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExceptionInInitializerExceptionTester {

	private static Map map = new HashMap(){{
		put("a", "2");
	}};
	
	public static void main(String[] args)
	{
//		Integer isInt = (Integer) map.get("a");
//		System.out.println(isInt);
		
		System.out.println("cn.cobee.Tester".replace(".", File.separator));
		
	}
	
}
