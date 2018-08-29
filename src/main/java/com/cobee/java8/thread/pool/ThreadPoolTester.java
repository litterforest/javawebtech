package com.cobee.java8.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/8/29.
 */
public class ThreadPoolTester {

    public static void main(String[] args) {
        //ExecutorService threadPool = Executors.newFixedThreadPool(3);
//        ExecutorService threadPool = Executors.newCachedThreadPool();
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 10; i++)
        {
            final int taskId = i;
            threadPool.execute(() -> {
                for (int j = 1; j <= 10; j++)
                {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    if (taskId == 3 && j == 5)
//                    {
//                        throw new RuntimeException("业务执行出错了");
//                    }
                    System.out.println(Thread.currentThread().getName() + "，当前循环每" + j + "次，任务ID是：" + taskId);
                }
            });
        }
        System.out.println("所有任务都提交完成!");
        threadPool.shutdown();
//        threadPool.shutdownNow();
    }

}
