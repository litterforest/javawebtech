package com.cobee.java8.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Administrator on 2018/8/26.
 */
public class ConcurrentCollectionsTester {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.get("");
        concurrentHashMap.put("", "");
        concurrentHashMap.size();

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

    }

}
