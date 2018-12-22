package com.cobee.java8.enume;

/**
 * 角色枚举类型
 *
 * Created by Administrator on 2018/12/22.
 */
public enum Role {

    CommonUser(1), VIP(2), Admin(3);

    // 定义一个数据库的值
    private int value;

    Role(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
