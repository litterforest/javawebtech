/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.interfacemgr.menu;

/**
 * 点餐类
 * @author cobee
 * @since 2019/9/1
 */
public class Meal {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(Course course : Course.values()) {
                Food food = course.randomFood();
                System.out.println(food);
            }
            System.out.println("--------------------------------------");
        }
    }

}
