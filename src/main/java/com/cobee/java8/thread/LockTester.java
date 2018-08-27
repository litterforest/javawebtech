package com.cobee.java8.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/8/27.
 */
public class LockTester {

    public static void main(String[] args) {
        new LockTester().startup();
    }

    public void startup()
    {
        OutputHelper outputHelper = new OutputHelper();
        new Thread(() -> {
            while(true)
            {
                outputHelper.print("cobee");
            }
        }).start();
        new Thread(() -> {
            while(true)
            {
                outputHelper.print("solar");
            }
        }).start();
    }

    static class OutputHelper
    {
        // 使用lock对象来替代sychronized关键字
        private Lock lock = new ReentrantLock();
        public void print(String str)
        {
            if (str == null)
            {
                return;
            }
            int len = str.length();
            if (len > 0)
            {
                lock.lock();
                try
                {
                    for (int i = 0; i < len; i++)
                    {
                        System.out.print(str.charAt(i));
                    }
                    System.out.println();
                }
                finally {
                    lock.unlock();
                }
            }
        }
    }

}
