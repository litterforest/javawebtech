package com.cobee.javawebtech.misc;

import java.sql.Date;

public class ImmutableTester {

	public static void main(String[] args) {
//		Boolean b1 = Boolean.valueOf(true);
//		Boolean b2 = Boolean.valueOf(true);
//		Boolean b3 = new Boolean(true);
//		System.out.println(b1 == b2);
//		System.out.println(b1 .equals( b3));
		
		
//		Date d1 = Date.valueOf("2017-08-29");
//		Date d2 = Date.valueOf("2017-08-29");
//		System.out.println(d1 .equals( d2));
//		System.out.println(d1.hashCode());
//		d1.setMonth(6);
//		System.out.println(d1.hashCode());
//		d1.setDate(31);
//		System.out.println(d1.hashCode());
		
		
//		String s1 = "ABCD";
//		System.out.println(s1.hashCode());
//		s1 = s1.toLowerCase();
//		System.out.println(s1);
//		System.out.println(s1.hashCode());
//		String s2 = "";
		
		m1();
	}
	
	public static void m1()
	{
		StringBuilder sbuff1 = new StringBuilder("计算").append("机");
		String str1 = sbuff1.toString().intern(); // 在字符串常量池里面缓存一份数据
		StringBuilder sbuff2 = new StringBuilder("计算").append("机");
		String str2 = sbuff2.toString();
		System.out.println(str2 == str2.intern());
	}

}
