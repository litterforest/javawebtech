/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli3;

/** 
 * <pre>学生观察者</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
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

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.observer.anli3.Observer#update(java.lang.Object)
	 */
	public void update(Object val) {
		
		if (val instanceof Teacher)
		{
			Teacher teacher = (Teacher) val;
			teacherPhone = teacher.getPhone();
		}
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", teacherPhone=" + teacherPhone + "]";
	}
	
}
