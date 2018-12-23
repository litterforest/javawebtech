package com.cobee.java8.lambda;

/**
 * Created by Administrator on 2018/12/23.
 */
public class Human {

    private long sleepTime;

    public Human(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void doRest(ISleep iSleep)
    {
        iSleep.sleep(sleepTime);
    }

}
