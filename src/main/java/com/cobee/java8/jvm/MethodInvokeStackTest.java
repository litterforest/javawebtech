package com.cobee.java8.jvm;

/**
 * 模拟vm stack入栈和出栈的过程
 *
 * Created by Administrator on 2018/12/16.
 */
public class MethodInvokeStackTest {

    private static void fun()
    {
        System.out.println("============fun=============");
    }

    private static void foo()
    {
        System.out.println("============foo=============");
        fun();
    }

    public static void main(String[] args) {
        foo();
    }

}
