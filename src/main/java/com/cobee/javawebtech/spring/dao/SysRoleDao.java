package com.cobee.javawebtech.spring.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cobee.javawebtech.spring.entity.SysRole;

@Repository
public class SysRoleDao implements ISysRoleDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public SysRole get(String id) {
		SysRole sysRole = jdbcTemplate.queryForObject("select * from sys_role where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<SysRole>(SysRole.class));
		return sysRole;
	}
	
	public Integer update(SysRole sysRole)
	{
		return jdbcTemplate.update("update sys_role set name = ? where id = ?", new Object[]{sysRole.getName(), sysRole.getId()});
	}

}
