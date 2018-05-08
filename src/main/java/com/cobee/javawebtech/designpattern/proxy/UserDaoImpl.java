package com.cobee.javawebtech.designpattern.proxy;

public class UserDaoImpl implements UserDao {

	@SimpleTransactional
	public void save(String name) {
		System.out.println("把名称:" + name + "，保存到数据库里面。");
	}

}
