package com.cobee.javawebtech.chapter2;

import java.io.UnsupportedEncodingException;

/**
 * <pre>编码测试</pre>
 * 
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年8月10日
 *
 */
public class EncodeTester {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "I am 君山";
		System.out.println(toHex(name.getBytes("iso-8859-1")));
		System.out.println(toHex(name.getBytes("GB2312")));
		System.out.println(toHex(name.getBytes("GBK")));
		System.out.println(toHex(name.getBytes("UTF-16")));
		System.out.println(toHex(name.getBytes("UTF-8")));
	}

	private static String toHex(byte[] bytes)
	{
		StringBuilder sbuff = new StringBuilder("");
		
		for(int i = 0; i < bytes.length; i++){  
            String temp = Integer.toHexString(bytes[i] & 0xFF);  
            if(temp.length() == 1){  
                sbuff.append("0");
            }  
            sbuff.append(temp);
        }  
		
		return sbuff.toString();
	}
	
}
