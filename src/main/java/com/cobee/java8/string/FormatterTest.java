/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.string;

/**
 * 格式化打印测试
 * @author cobee
 * @since 2019/8/31
 */
public class FormatterTest {

    public static void main(String[] args) {
        String name = "cobee33333333333333333333333333";
        int age = 18;
        double score = 9788888888.58888;
        // 这里的数字表明的是最小宽度，-表示向左对齐
        System.out.printf("my name is %-12s, my age is %-5d, my score is %5.2f\n", name, age, score);
    }

}
