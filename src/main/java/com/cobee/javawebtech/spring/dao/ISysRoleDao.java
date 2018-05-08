package com.cobee.javawebtech.spring.dao;

import com.cobee.javawebtech.spring.entity.SysRole;

public interface ISysRoleDao {
	SysRole get(String id);
	Integer update(SysRole sysRole);
}
