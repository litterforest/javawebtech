package com.cobee.java8.date;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * Created by Administrator on 2018/8/11.
 */
public class DateTest {


    public static void test1()
    {
        // 持久层使用，存储日期
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }

    /**
     * java.util.Date 和 java.sql.Date(只有日期部分)之间的转换
     * java.util.Date 和 java.sql.Timestamp(日期 + 时间)之间的转换
     */
    public static void test2()
    {
        // 子类转父类是安全的，因为是大转小
        java.util.Date utilDate = new java.sql.Date(System.currentTimeMillis());

        // 父类转子类是不安全的，因为是小转大，会出现内存溢出
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());

        // 子类转父类是安全的，因为是大转小
        utilDate = new Timestamp(System.currentTimeMillis());

        // 父类转子类是不安全的，因为是小内存转大内存，容易出现内存溢出
        Timestamp timestamp = new Timestamp(utilDate.getTime());
    }

    /**
     * 使用日历类Calendar来计算日期和时间，是一个可变对象
     */
    public static void test3()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -15);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    /**
     * 使用LocalDate对象输出日期，是一个不可变的对像
     */
    public static void test4()
    {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(localDate.format(dateTimeFormatter));
    }

    /**
     * 使用LocalDate对象输出日期，是一个不可变的对像
     */
    public static void test5()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }



    public static void main(String[] args) {
        test5();
    }

}
