package com.cobee.java8.jvm;

/**
 * 查看java应用，可使用的CPU的进程数量
 *
 * Created by Administrator on 2018/12/19.
 */
public class AvailableProcTest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
