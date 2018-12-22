package com.cobee.java8.jvm;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 引用类型测试
 *
 * Created by Administrator on 2018/12/22.
 */
public class ReferenceTest {

    public static void main(String[] args) {

        //strongRef();
        //softRef();
        weakRef();
    }

    /**
     * 测试强引用，java代码中默认的写法就是强引用
     */
    private static void strongRef()
    {

        String str1 = new String("www.cobee.com");
        String str2 = str1;
        str1 = null;
        //str2 = null;
        System.out.println(str2);

    }

    /**
     * 当强引用断开连接后，如果内存不够，在执行gc的时候软引用指向的堆空间会被回收
     */
    private static void softRef()
    {

        String str1 = new String("www.cobee.com");
        Reference<String> softRef = new SoftReference<String>(str1);

        str1 = null;
        Runtime.getRuntime().gc();

        System.out.println(softRef.get());

    }

    /**
     * 弱引用，当强引用断开后，垃圾回收执行时不管内存够不够都会回收堆内存空间
     */
    private static void weakRef(){

        String str1 = new String("www.cobee.com");
        Reference<String> ref = new WeakReference<String>(str1);

        str1 = null;
        Runtime.getRuntime().gc();

        System.out.println(ref.get());

    }

}
