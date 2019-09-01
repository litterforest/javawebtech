/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.interfacemgr.menu;

/**
 * 食物品类接口组织
 *
 * @author cobee
 * @since 2019/9/1
 */
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
