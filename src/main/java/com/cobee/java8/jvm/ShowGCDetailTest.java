package com.cobee.java8.jvm;

import java.util.Random;

/**
 * 通过 -Xmx16m -Xms16m 来配置堆内存大小 和 -XX:+PrintGCDetails
 */
public class ShowGCDetailTest {

    public static void main(String[] args) {
        Random random = new Random();
        String str = "Hello world";
        // jvm先执行GC，然后再抛出OutOfMemoryError异常
        while(true)
        {
            str += str + random.nextInt(999999999);
            str.intern(); // 字符串入池操作
        }

    }

}
