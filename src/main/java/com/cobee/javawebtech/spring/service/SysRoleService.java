package com.cobee.javawebtech.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cobee.javawebtech.spring.dao.SysRoleMapper;
import com.cobee.javawebtech.spring.entity.SysRole;

@Service
@Transactional(readOnly = true)
public class SysRoleService {
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	public SysRole get(String id) {
		return sysRoleMapper.get(id);
	}
	
	@Transactional(readOnly = false)
	public Integer update(SysRole sysRole)
	{
		return sysRoleMapper.update(sysRole);
	}
	
}
