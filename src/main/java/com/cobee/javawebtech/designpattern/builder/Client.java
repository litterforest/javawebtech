package com.cobee.javawebtech.designpattern.builder;

import java.lang.reflect.InvocationTargetException;

/**
 * 客户端使用创建模式来编写代码
 * Created by Administrator on 2018/4/29.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        test1();
        test2();
    }

    public static final void test1() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long start = System.currentTimeMillis();
        Person person = null;
        for (int i = 0; i < 100000; i++)
        {
            person = new Person();
            person.setProperty("name", "cobee").setProperty("age", 30);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "毫秒");
    }

    public static final void test2() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long start = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        long freeMenory = runtime.freeMemory();
        System.out.println("start: " + freeMenory);
//        Person person = null;
        for (int i = 0; i < 10000000; i++)
        {
            Person person = new Person();
            person.setAge(30);
            person.setName("cobee");
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "毫秒");
        long freeMenory1 = runtime.freeMemory();
        System.out.println("end: " + freeMenory1);
        System.out.println("使用了多少字节内存：" + ((freeMenory - freeMenory1) / 1024 / 1024) + "MB");
    }

}
