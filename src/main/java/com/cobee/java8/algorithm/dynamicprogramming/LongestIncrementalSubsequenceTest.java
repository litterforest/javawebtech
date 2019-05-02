package com.cobee.java8.algorithm.dynamicprogramming;

import java.util.Arrays;

/**
 * 2014年下半年真题
 * 计算一个整数数组a的最长递增子序列长度
 *
 * Created by Administrator on 2019/5/2.
 */
public class LongestIncrementalSubsequenceTest {

    public static void main(String[] args) {
        // 输入数据数组
        int[] a = {3,10,5,15,6,8};
        // 用于存放结果数组
        int[] b = new int[a.length];
        int n = a.length;
        int i,j;
        b[0] = 1;
        // 最长递增子序列的长度
        int len;
        for (i = 1; i < n; i++)
        {
            for (j = 0, len = 0; j < i; j++)
            {
                if (a[j] <= a[i] && len < b[j])
                {
                    len = b[j];
                }
            }
            b[i] = len + 1;
        }
        System.out.println(Arrays.toString(b));
        System.out.println(maxL(b));

    }

    private static int maxL(int[] a)
    {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > temp)
            {
                temp = a[i];
            }
        }
        return temp;
    }


}
