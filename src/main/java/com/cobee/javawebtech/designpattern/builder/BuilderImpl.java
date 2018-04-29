package com.cobee.javawebtech.designpattern.builder;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2018/4/29.
 */
public class BuilderImpl implements Builder {

    /**
     *  实体类构建器方法
     *
     * @param propName
     * @param propVal
     * @return
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    @Override
    public Builder setProperty(String propName, Object propVal) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        PropertyUtils.setProperty(this, propName, propVal);
        return this;
    }

}
