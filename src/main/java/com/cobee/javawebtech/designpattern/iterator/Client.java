package com.cobee.javawebtech.designpattern.iterator;

import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		
		Television<String> tv = new Television<String>();
		tv.add("第一频道");
		tv.add("第二频道");
		tv.add("第三频道");
		tv.add("第四频道");
		tv.add("第五频道");
		tv.add("第六频道");
		tv.add("第七频道");
		
		Iterator<String> iterator = tv.iterate();
		while(iterator.hasNext())
		{
			String obj = iterator.next();
			if ("第一频道".equals(obj))
			{
				iterator.remove();
			}
			System.out.println(obj);
		}
		
		iterator = tv.iterate();
		while(iterator.hasNext())
		{
			String obj = iterator.next();
			System.out.println(obj);
		}
		
	}

}
