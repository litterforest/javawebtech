/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli2;

/** 
 * <pre></pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class Student {
	
	private String name;
	private Teacher teacher;
	
	public Student(String name, Teacher teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", teacher#phone=" + teacher.getPhone() + "]";
	}
	
}
