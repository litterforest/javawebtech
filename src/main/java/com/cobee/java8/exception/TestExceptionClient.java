package com.cobee.java8.exception;

public class TestExceptionClient {

    public static void main(String[] args) {

        MyException myException = new MyException("test exception permance");

        //System.out.println(myException);

        myException.printStackTrace();

        System.out.println("================hello world===============");

        System.out.println("=====================try try try======================");

        System.out.println("------------------------9,8,7-----------------------------");

        System.out.println("888888888888888888888888888888***************************");

        new Thread(() -> {

            System.out.println("+++++++++++++++++++++++this is a new thread+++++++++++++++++++++++++");
            System.out.println("my dad");

            System.out.println((120D));

            System.out.println("hello mon");

            System.out.println("big mon");

            System.out.println("lufu");

            System.out.println("索罗");

            System.out.println("山治");

        }).start();

        new Thread(() -> {
            System.out.println("a new test");

            System.out.println("have a look");

        }).start();

        System.out.println("----------------------------pppp+" + (6 % 2)  +  "+pppp-------------------------------");

        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        System.out.println("这是怎么回事呀？");

        System.out.println("hello world");

        System.out.println("hello my son, i am your father");

    }

}
