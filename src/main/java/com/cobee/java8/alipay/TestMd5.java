package com.cobee.java8.alipay;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2019/3/16.
 */
public class TestMd5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest("Hello worldydghdfgdrrteyh5645745645345urtyjfghgretew".getBytes());
        System.out.println(bytes.length);
    }

}
