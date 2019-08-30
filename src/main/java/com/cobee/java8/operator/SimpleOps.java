package com.cobee.java8.operator;

/**
 * 操作符测试类
 */
public class SimpleOps {

    public static void main(String[] args) {
        int c = multiNegative(2, -2);
        System.out.printf("int c = %d\n", c);
    }

    /**
     * 乘以负数
     *
     * @param a
     * @param b 方法内部取负数
     * @return
     */
    public static int multiNegative(int a, int b){
        return a * (-b);
    }

}
