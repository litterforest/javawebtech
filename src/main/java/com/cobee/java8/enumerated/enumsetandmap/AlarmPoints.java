/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.enumsetandmap;

import java.util.EnumSet;

/**
 * EnumSet常见用法
 *
 * @author cobee
 * @since 2019/9/1
 */
public enum AlarmPoints {

    STAIR1, STAIR2, LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BARTHROOM, UTILITY, KITCHEN;

    public static void main(String[] args) {
        EnumSet<AlarmPoints> alarmPointsEnumSet = EnumSet.noneOf(AlarmPoints.class);
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet.add(AlarmPoints.BARTHROOM);
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet.addAll(EnumSet.of(STAIR1, STAIR2, LOBBY, OFFICE1));
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet = EnumSet.allOf(AlarmPoints.class);
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet.remove(STAIR1);
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet.removeAll(EnumSet.of(STAIR1, OFFICE3, BARTHROOM, KITCHEN));
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        System.out.println(alarmPointsEnumSet);
        alarmPointsEnumSet = EnumSet.complementOf(alarmPointsEnumSet);
        System.out.println(alarmPointsEnumSet);
    }

}
