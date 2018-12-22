package com.cobee.java8.enume.entity;

import com.cobee.java8.enume.Role;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/22.
 */
public class User implements Serializable {


    private static final long serialVersionUID = 5919755959199754447L;

    private String username;
    private String password;
    // 1,普通用户 2,VIP用户 3,管理员用户
    private int role;
    // private Role role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }

        public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
