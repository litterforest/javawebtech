/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli3;

import java.util.ArrayList;
import java.util.List;

/** <pre></pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class Teacher implements Subject {
	
	private String phone;
	private List<Observer> observerList = new ArrayList<Observer>();
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		notifyObservers();
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.observer.anli3.Subject#registObserver(com.cobee.javawebtech.designpattern.observer.anli3.Observer)
	 */
	public void registObserver(Observer observer) {
		observerList.add(observer);
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.observer.anli3.Subject#notifyObservers()
	 */
	public void notifyObservers() {
		if (observerList.size() > 0)
		{
			for (Observer observer : observerList)
			{
				observer.update(this);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.observer.anli3.Subject#removeObserver(com.cobee.javawebtech.designpattern.observer.anli3.Observer)
	 */
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.setPhone("123456");
		Student s1 = new Student("zhangsan", teacher.getPhone());
		Student s2 = new Student("lishi", teacher.getPhone());
		Student s3 = new Student("wangwu", teacher.getPhone());
		teacher.registObserver(s1);
		teacher.registObserver(s2);
		teacher.registObserver(s3);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println("=================================================");
		teacher.removeObserver(s3);
		teacher.setPhone("9870");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
	
}
