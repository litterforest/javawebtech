package com.cobee.java8.enume;

import com.cobee.java8.enume.dao.UserDao;
import com.cobee.java8.enume.entity.Table;
import com.cobee.java8.enume.entity.User;

/**
 * Created by Administrator on 2018/12/22.
 */
public class EnumTest {

    public static void main(String[] args) {
        Table t1 = new Table();
        t1.setColor(Color.Red);

        Table t2 = new Table();
        t2.setColor(Color.Blue);

        // 取值并判断
        switch (t2.getColor())
        {
            case Red:
                System.out.println("table is red");
                break;
            case Blue:
                System.out.println("table is blue");
                break;
            case Green:
                System.out.println("table is green");
                break;
        }

        User user = new UserDao().getUser("cobee", "123456");
        switch (user.getRole())
        {
            case IRole.COMMON_USER:
                System.out.println("普通用户");
                break;
            case IRole.VIP:
                System.out.println("VIP用户");
                break;
            case IRole.ADMIN:
                System.out.println("管理员用户");
                break;
        }

    }

}
