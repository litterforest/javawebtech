/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli1;

/** 
 * <pre>开学的时候，教师公布联系方式，学生记下老师的联系方式</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class AnliOne {

	/** <pre></pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月25日
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("123456");
		Student student1 = new Student("zhangsan", teacher.getPhone());
		Student student2 = new Student("lishi", teacher.getPhone());
		Student student3 = new Student("wangwu", teacher.getPhone());
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		teacher.setPhone("7890");
		student1.setPhone(teacher.getPhone());
		student2.setPhone(teacher.getPhone());
		student3.setPhone(teacher.getPhone());
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
	}

}
