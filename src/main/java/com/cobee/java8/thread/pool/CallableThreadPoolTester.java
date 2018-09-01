package com.cobee.java8.thread.pool;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/9/1.
 */
public class CallableThreadPoolTester {

    public static void main(String[] args) throws Exception {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        Future<String> future = threadPool.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                if (1 == 1)
                {
                    throw new RuntimeException("这是一个异常");
                }
                return "hello";
            }
        });
        System.out.println("before future get");

        try {
            String result = future.get(5L, TimeUnit.SECONDS).toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println();

        System.out.println("after future get");
    }

}
