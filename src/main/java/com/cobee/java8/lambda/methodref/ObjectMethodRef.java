package com.cobee.java8.lambda.methodref;

import java.io.Closeable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 对象方法引用
 */
public class ObjectMethodRef {

    /**
     * 没有参数的函数式接口，不能使用对象方法引有。
     */
    public void not()
    {
        Runnable runnable = () -> {};
        Closeable closeable = () -> {};
    }

    public static void main(String[] args) {

        User user = new User();
        Consumer<User> consumer = (u) -> user.getPoint();
        // 函数式接口的型参列表的第一个参数与调用方法的类的类型相同，剩余参数与要调用的方法的参数列表一致。
        Consumer<User> consumer1 = User::getPoint;
        consumer1.accept(user);

        // 有两个参数的对象方法引用
        BiConsumer<User, String> biConsumer = User::setName;
        biConsumer.accept(user, "cobee");

    }

}
