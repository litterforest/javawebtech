package com.cobee.javawebtech.chapter8;

public class XssTester {

	private static long count = 0;
    
    public static void main(String[] args) {
        infinitelyRecursiveMethod(1L);
    }
    
    public static void infinitelyRecursiveMethod(long a)
    {
        System.out.println(count++);
        infinitelyRecursiveMethod(a);
    }


}
