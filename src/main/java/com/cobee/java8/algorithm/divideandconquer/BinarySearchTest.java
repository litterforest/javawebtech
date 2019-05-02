package com.cobee.java8.algorithm.divideandconquer;

/**
 * 分治法-二分查找，前题是元素已经排好序
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] data = {1, 2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(data, 0, 9, 1));
    }

    /**
     *
     * @param data 被查找的数组元素
     * @param l 左下标
     * @param r 右下标
     * @param val 要查找的值
     * @return 返回元素在数组中的下标，查找失败返回-1
     */
    public static int binarySearch(int[] data, int l, int r, int val)
    {
        if (l > r)
        {
            return -1;
        }
        else
        {
            // 求中间下标值，向下取整
            int m = (l + r) / 2;
            if (data[m] == val)
            {
                return m;
            }
            // 值在左边
            else if (data[m] > val)
            {
                return binarySearch(data, l, m - 1, val);
            }
            // 值在右边
            else
            {
                return binarySearch(data, m + 1, r, val);
            }
        }
    }

}
