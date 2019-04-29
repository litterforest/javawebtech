package com.cobee.java8.algorithm.divideandconquer;

public class RecursionTest {

    public static void main(String[] args) {
        System.out.println(fun(2));
    }

    /**
     * 测试斐波那契数列
     */
    private static int fun(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return fun(n - 1) + fun(n -2);
        }
    }

}
