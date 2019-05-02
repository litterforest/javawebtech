package com.cobee.java8.algorithm.greedy;

/**
 * 集装箱问题，包含最先存放和最优存放
 *
 * Created by Administrator on 2019/5/2.
 */
public class ContainerTest {

    public static void main(String[] args) {
        int c = 10;
        int[] s = {4,2,7,3,5,4,2,3,6,2};
        System.out.println("firstfit:" + firstfit(10, s));
        System.out.println("bestfit:" + bestfit(10, s));
    }

    /**
     * 最先存放策略
     *
     * @param c 每一个集装箱的容量
     * @param s 需要放置的货物的容量的数组
     * @return
     */
    private static int firstfit(int c, int[] s)
    {
        int n = s.length;
        // 表示第i + 1个集装箱已经装入的容量
        int[] b = new int[n];
        // 循环变量
        int i, j;
        // 需要集装箱的个数
        int k = 0;
        // 初始化b[]数组
        for (i = 0; i < n; i++)
        {
            b[i] = 0;
        }
        // 把货物进行装箱
        for (i = 0; i < n; i++){
            j = 0;
            // 如果当前集装箱放不下，则查找下一个集装箱
            while(c - b[j] - s[i] < 0)
            {
                j++;
            }
            // 把当前货物放入对应的集装箱
            b[j] += s[i];
            k = k > (j + 1) ? k : (j + 1);
        }

        return k;
    }

    /**
     * 最优存放策略
     *
     * @param c 每一个集装箱的容量
     * @param s 需要放置的货物的容量的数组
     * @return
     */
    private static int bestfit(int c, int[] s)
    {
        int n = s.length;
        // 表示第i + 1个集装箱已经装入的容量
        int[] b = new int[n];
        // 循环变量
        int i, j;
        // 集装箱最少剩余容量
        int min;
        // 当前所需的集装箱的数量
        int m;
        int temp;
        // 需要集装箱的个数
        int k = 0;
        // 初始化b[]数组
        for (i = 0; i < n; i++)
        {
            b[i] = 0;
        }
        // 把货物进行装箱
        for (i = 0; i < n; i++){
            min = c;
            m = k + 1;

            for (j = 0; j < k + 1; j++){
                temp = c - b[j] - s[i];
                if (temp > 0 && temp < min)
                {
                    min = temp;
                    m = j;
                }
            }

            b[m] += s[i];

            k = k > (m + 1) ? k : (m + 1);

        }

        return k;
    }

}
