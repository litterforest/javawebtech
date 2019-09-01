/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.interfacemgr.menu1;

import java.util.Random;

/**
 * 枚举组织枚举
 *
 * @author cobee
 * @since 2019/9/1
 */
public enum Meal2 {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] foods;

    Meal2(Class<? extends Food> kind) {
        foods = kind.getEnumConstants();
    }

    public Food randomSelection() {
        Random random = new Random(47);
        return foods[random.nextInt(foods.length)];
    }

    public interface Food {
        /**
         * 前菜
         */
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        /**
         * 主菜
         */
        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
        }

        /**
         * 甜品
         */
        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
        }

        /**
         * 咖啡
         */
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }

    public static void main(String[] args) {
        System.out.println(Meal2.APPETIZER.randomSelection());
        System.out.println(Meal2.MAINCOURSE.randomSelection());
        System.out.println(Meal2.DESSERT.randomSelection());
        System.out.println(Meal2.COFFEE.randomSelection());
    }

}
