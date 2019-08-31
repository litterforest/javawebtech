/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated;

/**
 * 季节枚举
 *
 * @author cobee
 * @since 2019/8/31
 */
public enum Season {

    SPRING("春天"){
        @Override
        public String thingsToDo() {
            return "插秧";
        }
    },
    SUMMER("夏天") {
        @Override
        public String thingsToDo() {
            return "游泳";
        }
    },
    AUTUMN("秋天") {
        @Override
        public String thingsToDo() {
            return "秋游";
        }
    },
    WINTER("冬天") {
        @Override
        public String thingsToDo() {
            return "打火锅";
        }
    };

    private String name;

    Season(String name) {
        this.name = name;
    }

    public abstract String thingsToDo();

    @Override
    public String toString() {
        return name;
    }

    //    @Override
//    public String toString() {
//        switch(this) {
//            case SPRING: return "春天";
//            case SUMMER: return "夏天";
//            case AUTUMN: return "秋天";
//            case WINTER: return "冬天";
//            default:return "UNKNOWN";
//        }
//    }
}
