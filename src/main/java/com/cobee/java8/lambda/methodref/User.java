package com.cobee.java8.lambda.methodref;

public class User {

    public String getPoint()
    {
        System.out.println("你当前有1000积分");
        return "你当前有1000积分";
    }

    public void setName(String name)
    {
        System.out.println("名称设置成" + name);
    }

}
