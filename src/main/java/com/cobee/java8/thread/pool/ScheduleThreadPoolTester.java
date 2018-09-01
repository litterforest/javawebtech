package com.cobee.java8.thread.pool;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/9/1.
 */
public class ScheduleThreadPoolTester {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(new Random().nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " say hello at " + LocalDateTime.now().toString());
        }, 3L, 2L, TimeUnit.SECONDS);
        System.out.println(LocalDateTime.now().toString());
        //scheduledExecutorService.shutdown();
    }

}
