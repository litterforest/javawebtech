package com.cobee.java8.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 静态方法引用
 *     如果函数式接口的实现恰好只调用一个静态方法来实现的，那么就可以使用静态方法引用。
 *
 * 语法：
 *     类名::staticMethod
 */
public class StaticMethodRef {

    public static String getName()
    {
        System.out.println("read db by id");
        return "cobee";
    }

    public static String getUpperCaseName(String str)
    {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

        Supplier<String> supplier = () -> StaticMethodRef.getName();


        Supplier<String> supplier1 = StaticMethodRef::getName;

        //Function<String, String> supplier2 = StaticMethodRef::getUpperCaseName("abc");

        System.out.println(supplier1.get());
    }

}
