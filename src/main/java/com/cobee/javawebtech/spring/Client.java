package com.cobee.javawebtech.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cobee.javawebtech.spring.entity.SysRole;
import com.cobee.javawebtech.spring.service.SysRoleService;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-tx.xml", "classpath:applicationContext-mybatis.xml", "classpath:applicationContext.xml");
		
		SysRoleService sysRoleService = (SysRoleService) ctx.getBean("sysRoleService");
		System.out.println(sysRoleService.get("95fe15e9cad14f8b9aab20bc502f2975"));
		SysRole newSysRole = new SysRole();
		newSysRole.setId("95fe15e9cad14f8b9aab20bc502f2975");
		newSysRole.setName("cgs123456");
		System.out.println(sysRoleService.update(newSysRole));
		
	}
	
}
