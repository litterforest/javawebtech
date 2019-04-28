package com.cobee.java8.lambda.methodref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 实例方法引用
 *     如果函数式接口的实现恰好只调用一个实例方法来实现的，那么就可以使用实例方法引用。
 *
 * 语法：
 *     实例名称::staticMethod
 */
public class InstanceMethodRef {

    public String getName()
    {
        return "cobee";
    }

    public void setName(String name)
    {
        System.out.println("name set to " + name);
    }

    public Integer parseInt(String str)
    {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        InstanceMethodRef instanceMethodRef = new InstanceMethodRef();
        // 只有返回值的函数式接口
        Supplier<String> supplier = () -> instanceMethodRef.getName();
        Supplier<String> supplier1 = instanceMethodRef::getName;
        System.out.println(supplier1.get());

        //只有参数的函数式接口
        Consumer<String> consumer = (str) -> instanceMethodRef.setName(str);
        Consumer<String> consumer1 = instanceMethodRef::setName;
        consumer1.accept("cobee");

        // 即有参数，也有返回值
        Function<String, Integer> function = (str) -> { return Integer.parseInt(str); };
        Function<String, Integer> function1 = instanceMethodRef::parseInt;
        System.out.println(function1.apply("10"));

    }

}
