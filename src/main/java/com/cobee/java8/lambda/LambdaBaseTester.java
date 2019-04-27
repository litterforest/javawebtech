package com.cobee.java8.lambda;

import java.util.function.Function;

/**
 *  lambda基础语法演示
 */
public class LambdaBaseTester {

    public static void main(String[] args) {
        // 即有输入又有输出的函数式接口
        Function<String, Integer> function = (str) -> { return Integer.valueOf(str); };
        Function<String, Integer> function1 = (String str) -> { return Integer.valueOf(str); };
    }

}
