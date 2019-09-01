/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.interfacemgr.menu;

import java.util.Random;

/**
 * 菜品枚举
 *
 * @author cobee
 * @since 2019/9/1
 */
public enum Course {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class),
    MAINCOURSE1(Food.MainCourse.class);

    private Food[] values;

    Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    /**
     * 返回枚举类型中的随机食物
     * @return
     */
    public Food randomFood() {
        Random random = new Random();
        return values[random.nextInt(values.length)];
    }

    public static void main(String[] args) {
        System.out.println(APPETIZER.randomFood());
    }

}
