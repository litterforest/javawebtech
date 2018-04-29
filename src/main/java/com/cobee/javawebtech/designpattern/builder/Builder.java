package com.cobee.javawebtech.designpattern.builder;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2018/4/29.
 */
public interface Builder {

    Builder setProperty(String propName, Object propVal) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

}
