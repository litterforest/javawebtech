package com.cobee.java8.lambda;

/**
 * Created by Administrator on 2018/12/23.
 */
@FunctionalInterface
public interface ISleep {

    void sleep(long mstime);

    static int insert(){
        return 1;
    }

    default int update()
    {
        return 1;
    }

    //void m1();

}
