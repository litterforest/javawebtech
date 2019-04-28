package com.cobee.java8.lambda.methodref;

import java.util.function.BiFunction;
import java.util.function.Consumer;
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

    public static void con(String str)
    {
        System.out.println(str);
    }

    public static String toUpperCase(String str)
    {
        return str.toUpperCase();
    }

    public static Integer strTotalLen(String str1, String str2)
    {
        return str1.length() + str2.length();
    }

    public static String getUpperCaseName(String str)
    {
        return str.toUpperCase();
    }

    public static void main(String[] args) {

        Supplier<String> supplier = () -> StaticMethodRef.getName();


        Supplier<String> supplier1 = StaticMethodRef::getName;
        // 任意的静态方法都可以
        Supplier<String> supplier2 = Foo::getName;

        //System.out.println(supplier1.get());

        Consumer<String> consumer = str -> StaticMethodRef.con(str);
        // 不需要写括号，传入参数
        Consumer<String> consumer1 = StaticMethodRef::con;

        consumer1.accept("abc");

        // 有传参也有返回值
        Function<String, String> function = (str) -> { return StaticMethodRef.getUpperCaseName(str); };
        Function<String, String> function1 = (str) -> StaticMethodRef.getUpperCaseName(str);
        Function<String, String> function3 = StaticMethodRef::getUpperCaseName;
        System.out.println(function3.apply("lambda"));

        // 传两个参数的，也有返回值
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> { return str1.length() + str2.length(); };
        BiFunction<String, String, Integer> biFunction1 = (str1, str2) -> StaticMethodRef.strTotalLen(str1, str2);
        BiFunction<String, String, Integer> biFunction2 = StaticMethodRef::strTotalLen;
        System.out.println(biFunction2.apply("java", "se"));
    }

}

class Foo {
    public static String getName()
    {
        System.out.println("read db by id");
        return "cobee";
    }
}