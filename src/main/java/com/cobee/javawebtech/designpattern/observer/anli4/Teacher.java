package com.cobee.javawebtech.designpattern.observer.anli4;

import java.util.Observable;

public class Teacher extends Observable {

	private String phone;

	public Teacher(String phone) {
		super();
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		super.setChanged();
		super.notifyObservers();
	}
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher("");
		Student s1 = new Student("zhangsan", teacher.getPhone());
		Student s2 = new Student("lisi", teacher.getPhone());
		Student s3 = new Student("wangwu", teacher.getPhone());
		teacher.addObserver(s1);
		teacher.addObserver(s2);
		teacher.addObserver(s3);
		teacher.setPhone("12345");
		
		teacher.deleteObserver(s1);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}
	
}
