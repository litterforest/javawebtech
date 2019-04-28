package com.cobee.java8.lambda.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造函数方法引用
 *     如果函数式接口的实现恰好只调用一个构造函数来实现的，那么就可以使用构造函数方法引用。
 *
 * 语法：
 *     实例名称::new
 */
public class ConstructorMethodRef {

    public static void main(String[] args) {
        // 无参构造函数方法引用
        Supplier<User> supplier = User::new;
        supplier.get();

        BiFunction<String, Integer, User> function = User::new;
        function.apply("cobee", 30);

        Function<String, Integer> function1 = Integer::new;

    }

}
