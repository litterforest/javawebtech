package com.cobee.java8.jvm;

import java.util.Random;

/**
 * 测试内存溢出异常
 *
 * Created by Administrator on 2018/12/16.
 */
public class OutOfMemoryTest {

    public static void main(String[] args) {
        String str = "hello world";
        while(true)
        {
            str += str + new Random().nextInt(999999999);
            str.intern();  // 入池
        }
    }

}
