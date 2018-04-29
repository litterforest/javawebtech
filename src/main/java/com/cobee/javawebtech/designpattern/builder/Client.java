package com.cobee.javawebtech.designpattern.builder;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2018/4/29.
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        person.setProperty("name", "cobee").setProperty("age", 30);
        System.out.println(person);
    }

}
