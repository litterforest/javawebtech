package com.cobee.java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 测试方法引用，当lambda表达式的方法体只有一句话时，可以转换成方法引用。
 */
public class MethodRefrenceTester1 {

    public static void main(String[] args) {

        // 返回字符串大写型式
        Function<String, String> function = str -> str.toUpperCase();
        System.out.println(function.apply("admin"));

        // 打印输入参数的大写型式
        Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
        consumer.accept("admin");
    }

}
