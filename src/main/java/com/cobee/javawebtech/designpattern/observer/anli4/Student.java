package com.cobee.javawebtech.designpattern.observer.anli4;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
	
	private String name;
	private String teacherPhone;
	
	public Student(String name, String teacherPhone) {
		super();
		this.name = name;
		this.teacherPhone = teacherPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public void update(Observable o, Object arg) {
		
		if (o instanceof Teacher)
		{
			Teacher teacher = (Teacher) o;
			this.setTeacherPhone(teacher.getPhone());
		}
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", teacherPhone=" + teacherPhone + "]";
	}
	
}
