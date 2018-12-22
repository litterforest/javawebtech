package com.cobee.java8.enume.dao;

import com.cobee.java8.enume.Role;
import com.cobee.java8.enume.entity.User;

/**
 * 使用枚举类型的话，从库里取值需要匹配，写到库里需要取值
 *
 * Created by Administrator on 2018/12/22.
 */
public class UserDao {

    // =====================================================枚举开发版本===========================================================

//    public User getUser(String username, String password)
//    {
//        // 1,从数据库返回查询到的值
//        String dbUsername = username;
//        String dbPassword = password;
//        // vip用户
//        int role = 2;
//
//        User user = new User();
//        user.setUsername(dbUsername);
//        user.setPassword(dbPassword);
//
//        switch (role)
//        {
//            case 1:
//                user.setRole(Role.CommonUser);
//                break;
//            case 2:
//                user.setRole(Role.VIP);
//                break;
//            case 3:
//                user.setRole(Role.Admin);
//                break;
//        }
//
//        return user;
//    }
//
//    public void save(User user)
//    {
//
//        int role = user.getRole().getValue();
//
//        // 取出枚举值，写入数据库
//
//    }

    // =====================================================枚举开发版本===========================================================


    // =====================================================接口常量开发版本===========================================================

    public User getUser(String username, String password)
    {
        // 1,从数据库返回查询到的值
        String dbUsername = username;
        String dbPassword = password;
        // vip用户
        int role = 2;

        User user = new User();
        user.setUsername(dbUsername);
        user.setPassword(dbPassword);
        user.setRole(role);

        return user;
    }

    public void save(User user)
    {

        int role = user.getRole();

        // 取出枚举值，写入数据库

    }

    // =====================================================接口常量开发版本===========================================================

}
