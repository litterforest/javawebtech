package com.cobee.java8.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2018/8/26.
 */
public class ReadWriteLockCacheUtils {

    private static final Map<String, Object> dataMap = new HashMap<>();
    private static final ReadWriteLock lock = new ReentrantReadWriteLock();

    public static Object getObject(String key)
    {
        // 上读锁
        lock.readLock().lock();
        Object data = null;
        try
        {
            data = dataMap.get(key);
            if (data == null)
            {
                lock.readLock().unlock();
                lock.writeLock().lock();
                try {
                    data = dataMap.get(key);
                    if (data == null)
                    {
                        System.out.println("从数据库里查询数据");
                        data = "data";
                        dataMap.put(key, data);
                    }
                }
                catch (Exception e1)
                {
                    e1.printStackTrace();
                }
                finally
                {
                    lock.readLock().lock();
                    lock.writeLock().unlock();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.readLock().unlock();
        }
        return data;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
        {
            new Thread(() -> {
                ReadWriteLockCacheUtils.getObject("key");
            }).start();
        }
    }

}
