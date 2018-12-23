package com.cobee.java8.lambda;

/**
 * lambda表达式函数式接口的参数传递，使用构造方法来传递参数
 *
 * Created by Administrator on 2018/12/23.
 */
public class ClientTest {

    public static void main(String[] args) {

        Human human = new Human(10000);

        human.doRest((mstime) -> {
            System.out.println("sleep time is " + mstime);
        });

    }

}
