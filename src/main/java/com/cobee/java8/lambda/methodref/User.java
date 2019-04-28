package com.cobee.java8.lambda.methodref;

public class User {

    private String name;
    private Integer age;

    public User()
    {
        System.out.println("public User()");
    }

    public User(String name)
    {
        System.out.println("public User(String name)");
        this.name = name;
    }

    public User(String name, Integer age)
    {
        System.out.println("public User(String name, Integer age)");
        this.name = name;
        this.age = age;
    }

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
