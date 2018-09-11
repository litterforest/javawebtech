package com.cobee.java8.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 使用两个只有1空间的阻塞队列来实现多线程之间的顺序执行。
 *
 * Created by Administrator on 2018/9/11.
 */
public class BlockingQueueTester {

    public static void main(String[] args) {
        final Business business = new Business();
        new Thread(() -> {
            for (int i = 0; i < 10; i++)
            {
                business.main();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++)
            {
                business.sub();
            }
        }).start();
    }

    static class Business {

        private BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<Integer>(1);
        private BlockingQueue<Integer> queue2 = new ArrayBlockingQueue<Integer>(1);

        public Business()
        {
            try {
                queue2.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void main()
        {
            try {
                queue1.put(1);
                System.out.println("main线正在处理数据");
                queue2.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void sub()
        {
            try {
                queue2.put(1);
                System.out.println("sub线程正在处理数据");
                queue1.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
