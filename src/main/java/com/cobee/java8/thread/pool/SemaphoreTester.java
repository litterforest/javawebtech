package com.cobee.java8.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * semaphore控制同一时间只有多少个线程同时处理资源。
 *
 * Created by Administrator on 2018/9/2.
 */
public class SemaphoreTester {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        final Semaphore semaphore = new Semaphore(3);
        for (int i = 1; i <= 10; i++)
        {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "开始执行任务，当前并发线程数量:" + (3 - semaphore.availablePermits()));
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally
                {
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + "结束执行任务，当前并发线程数量:" + (3 - semaphore.availablePermits()));
                }
            });
        }

        executorService.shutdown();
    }

}
