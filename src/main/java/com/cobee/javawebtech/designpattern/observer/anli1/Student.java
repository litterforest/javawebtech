/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli1;

/** 
 * <pre></pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class Student {
	
	private String name;
	private String phone;
	
	public Student(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + "]";
	}
	
}
