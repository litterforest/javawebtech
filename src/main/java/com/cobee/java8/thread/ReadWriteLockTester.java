package com.cobee.java8.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2018/8/26.
 */
public class ReadWriteLockTester {

    List<String> list = new ArrayList<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        ReadWriteLockTester readWriteLockTester = new ReadWriteLockTester();
        readWriteLockTester.startup();

    }

    public void startup()
    {
        writeWithLock(0);
        readWithLock(100);
        readWithLock(100);
//        writeWithLock(150);
    }

    private void writeWithLock(long sleepMillis)
    {
        // 写线程
        new Thread(() -> {
            if (sleepMillis > 0)
            {
                try {
                    Thread.sleep(sleepMillis);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 30; i++)
            {
                readWriteLock.writeLock().lock();
                String str = "篮球" + i;
                list.add(str);
                System.out.println("线程" + Thread.currentThread().getName() + ":添加了[" + str + "]");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                readWriteLock.writeLock().unlock();
            }

        }).start();
    }

    private void readWithLock(long sleepMillis)
    {
        // 读线程
        new Thread(() -> {
            if (sleepMillis > 0) {
                try {
                    Thread.sleep(sleepMillis);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            readWriteLock.readLock().lock();
            for (int i = 0; i < list.size(); i++)
            {
                String str = list.get(i);
                System.out.println("线程" + Thread.currentThread().getName() + ":>>>>>>>>>>获取了[" + str + "]");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            readWriteLock.readLock().unlock();
        }).start();
    }

}
