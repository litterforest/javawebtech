package com.cobee.java8.jvm;

/**
 * 无限递归调用测试栈溢出异常
 *
 * Created by Administrator on 2018/12/16.
 */
public class StackOverflowTest {

    private static int count = 0;

    public static void main(String[] args) {
        print();
    }

    private static void print()
    {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("********************************" + count++);
        print();
    }

}
