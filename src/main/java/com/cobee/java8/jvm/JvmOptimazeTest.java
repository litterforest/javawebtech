package com.cobee.java8.jvm;

/**
 * Created by Administrator on 2018/12/17.
 */
public class JvmOptimazeTest {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 默认分配操作系统的 1/4 的内存空间
        System.out.println("maxMemory = " + (runtime.maxMemory() / 1024 / 1024) + "M");
        // 默认情况下除了申缩区之外的可用内存空间
        System.out.println("totalMemory = " + (runtime.totalMemory() / 1024 / 1024) + "M");
        System.out.println("freeMemory = " + (runtime.freeMemory() / 1024 / 1024) + "M");
    }

}
