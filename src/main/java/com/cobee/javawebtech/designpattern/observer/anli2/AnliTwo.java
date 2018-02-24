/**
 * 
 */
package com.cobee.javawebtech.designpattern.observer.anli2;

/** 
 * <pre>开学的时候，教师公布联系方式，学生记下老师的联系方式。增加依赖倒置设计原则</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月25日
 *
 */
public class AnliTwo {

	/** <pre></pre>
	 * @author 陈淦森
	 * @version 1.0.1
	 * @date 2017年10月25日
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("123456");
		Student student1 = new Student("zhangsan", teacher);
		Student student2 = new Student("lishi", teacher);
		Student student3 = new Student("wangwu", teacher);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		teacher.setPhone("7890");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
	}

}
