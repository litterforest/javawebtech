package com.cobee.java8.thread.pool;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 循环路障工具，等所有工作线程都集合到位，再继续往下执行代码
 * Created by Administrator on 2018/9/3.
 */
public class CyclicBarrierTester {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            System.out.println("Let's go!");
        });
        final Random random = new Random();
        for(int i = 0; i < 3; i++)
        {
            executorService.execute(() -> {
                try {
                    Thread.sleep(random.nextInt(10000));
                    System.out.println("线程" + Thread.currentThread().getName() + "已经到达了，当前共有" + (cyclicBarrier.getNumberWaiting() + 1) + "人在等待坐车");
                    // 等待线程全部集合到位,以最后一个到达的线程为准。
                    cyclicBarrier.await();

                    Thread.sleep(random.nextInt(10000));
                    System.out.println("线程" + Thread.currentThread().getName() + "已经到达了，当前共有" + (cyclicBarrier.getNumberWaiting() + 1) + "人在等待参观");
                    cyclicBarrier.await();

                    Thread.sleep(random.nextInt(10000));
                    System.out.println("线程" + Thread.currentThread().getName() + "已经到达了，当前共有" + (cyclicBarrier.getNumberWaiting() + 1) + "人在等待吃饭");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();
    }

}
