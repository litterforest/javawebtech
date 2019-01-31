package com.cobee.java8.exception;

public class MyException extends RuntimeException {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * 覆写这个方法，减少性能消耗。
     * @return
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        System.out.println("=======================fillInStackTrace()=============start============");
        System.out.println("=======================fillInStackTrace()=============end============");
        //return super.fillInStackTrace();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("1 + 2 = " + (1 + 2));

        //return null;
        return this;
    }
}
