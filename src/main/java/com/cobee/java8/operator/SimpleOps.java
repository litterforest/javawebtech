package com.cobee.java8.operator;

/**
 * 操作符测试类
 */
public class SimpleOps {

    public static void main(String[] args) {
//        int c = multiNegative(2, -2);
//        System.out.printf("int c = %d\n", c);
//        exponent();
        maxAndMinExp();
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

    /**
     * e的指数
     */
    public static void exponent() {
        float expFloat = 1.39E-43F;
        System.out.printf("expFloat:%s\n", expFloat);
        double expDouble = 47E47;
        System.out.printf("expDouble:%s\n", expDouble);
    }

    /**
     * 测试最大和最小指数记数法
     */
    public static void maxAndMinExp() {
        float maxExp = Float.MAX_EXPONENT;
        float minExp = Float.MIN_EXPONENT;
        System.out.printf("float maxExp:%s,mixExp:%s\n", maxExp, minExp);
        int maxExpDouble = Double.MAX_EXPONENT;
        int minExpDouble = Double.MIN_EXPONENT;
        System.out.printf("double maxExp:%s,mixExp:%s\n", maxExpDouble, minExpDouble);
    }

}
