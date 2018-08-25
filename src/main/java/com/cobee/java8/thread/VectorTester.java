package com.cobee.java8.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * Created by Administrator on 2018/8/25.
 */
public class VectorTester {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 写线程
        new Thread(() -> {
            for (int i = 0; i < 30; i++)
            {
                String str = "篮球" + i;
                list.add(str);
                System.out.println("线程" + Thread.currentThread().getName() + ":添加了[" + str + "]");
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }).start();

        // 读线程
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < list.size(); i++)
            {
                String str = list.get(i);
                System.out.println("线程" + Thread.currentThread().getName() + ":>>>>>>>>>>获取了[" + str + "]");
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }).start();

    }

}
