package com.cobee.javawebtech;

import com.cobee.javawebtech.effective.SingletonTester;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingletonTester singletonTester = SingletonTester.INSTANCE;
        System.out.println(singletonTester.getName());
    }
}
