/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated;

/**
 * @author cobee
 * @since 2019/8/31
 */
public class EnumTest {

    public static void main(String[] args) {
        print(Season.SPRING);
        System.out.println(Season.AUTUMN.getClass());
        System.out.println(Season.AUTUMN.getClass().getSuperclass().getSuperclass());
        System.out.println(Season.SPRING.thingsToDo());
        Season[] seasons = Season.values();
        Season[] seasons1 = Season.class.getEnumConstants();
        for(Season season : seasons1) {
            System.out.println(season);
        }
    }

    public static void print(Season season) {
        System.out.println("ordinal:" + season.ordinal() + ",season:" + season);
    }

}
