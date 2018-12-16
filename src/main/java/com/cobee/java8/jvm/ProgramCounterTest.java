package com.cobee.java8.jvm;

/**
 *
 * 演示程序计数器的作用。
 *
 * Created by Administrator on 2018/12/16.
 */
public class ProgramCounterTest {

    public static void main(String[] args) {
        int x = 10;
//        int y = 20;
        int y = 0;
        // 程序运行到这里会抛出一个异常，并且记录抛出异常的代码行号，这个就是程序计数器的负责的
        System.out.println(x / y);
    }

}
