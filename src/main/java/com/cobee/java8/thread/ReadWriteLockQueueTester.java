package com.cobee.java8.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2018/8/26.
 */
public class ReadWriteLockQueueTester {

    public static void main(String[] args) {
        final Queue queue = new Queue();
        for (int i = 0; i < 3; i++)
        {
            if (i == 0)
            {
                new Thread(() -> {
                    while(true)
                    {
                        queue.put();
                    }
                }).start();
            }
            else
            {
                new Thread(() -> {
                    while(true)
                    {
                        queue.get();
                    }
                }).start();
            }

        }
    }

}

class Queue
{
    private Object data;
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public Object get()
    {
        Long dataLong = null;
        try {
            readWriteLock.readLock().lock();
            System.out.println(">>>>>>>>>>线程" + Thread.currentThread().getName() + ",准备读取数据");
            Thread.sleep((long) (Math.random() * 1000));
            dataLong = (Long) data;
            System.out.println(">>>>>>>>>>线程" + Thread.currentThread().getName() + ",完成读取数据,data=" + dataLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            readWriteLock.readLock().unlock();
        }
        return dataLong;
    }

    public void put()
    {
        try {
            readWriteLock.writeLock().lock();
            System.out.println("线程" + Thread.currentThread().getName() + ",准备写入数据");
            Thread.sleep((long) (Math.random() * 1000));
            long dataLong = (long) (Math.random() * 100);
            this.data = dataLong;
            System.out.println("线程" + Thread.currentThread().getName() + ",完成写入数据,data=" + dataLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            readWriteLock.writeLock().unlock();
        }
    }

}