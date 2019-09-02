/**
 * Copyright &copy; 2015-2020 <a href="">softd</a> All rights reserved.
 */

package com.cobee.java8.enumerated.enumsetandmap;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author cobee
 * @since 2019/9/1
 */
public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> enumMap = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        enumMap.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("kitchen fire!");
            }
        });
        enumMap.put(AlarmPoints.BARTHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("barthroom alert!");
            }
        });
        for(Map.Entry<AlarmPoints, Command> entry : enumMap.entrySet()) {
            AlarmPoints alarmPoints = entry.getKey();
            Command command = entry.getValue();
            System.out.println("alarmPoints:" + alarmPoints);
            command.action();
        }
    }

}
