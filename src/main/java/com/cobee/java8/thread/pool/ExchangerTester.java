package com.cobee.java8.thread.pool;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用于线程之间交换数据，最快到达的两个线程数据可交换。
 * Created by Administrator on 2018/9/5.
 */
public class ExchangerTester {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);
    private static Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {

        startExchanger("cobee");
        startExchanger("lili");
        startExchanger("tom");

    }

    private static void startExchanger(final String myData)
    {
        executorService.execute(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " before data: " + myData);
                Thread.sleep((long) (Math.random() * 10000));
                String newData = exchanger.exchange(myData);
                System.out.println(Thread.currentThread().getName() + " after exchanger data: " + newData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
