package com.cobee.javawebtech.designpattern.composite;

public class CompositeClient {

	public static void main(String[] args) {
		Dir root = new Dir("ltd.s");
		
		Dir dir1 = new Dir("我的代码");
		
		Dir dir11 = new Dir("jxfparent");
		Dir dir111 = new Dir("jxfapi");
		Dir dir112 = new Dir("jxfcore");
		Dir dir113 = new Dir("jxferp");
		
		dir11.addComponent(dir111);
		dir11.addComponent(dir112);
		dir11.addComponent(dir113);
		
		File file111 = new File(".classpath");
		File file112 = new File("pom.xml");
		dir11.addComponent(file111);
		dir11.addComponent(file112);
		
		dir1.addComponent(dir11);
		
		Dir dir2 = new Dir("我的数据库");
		Dir dir3 = new Dir("我的项目");
		Dir dir4 = new Dir("我的资料");
		Dir dir41 = new Dir("web备份_安全扫描版");
		Dir dir42 = new Dir("客服工作资料");
		File file41 = new File("cobee框架.txt");
		File file42 = new File("大糖粮文案清单.txt");
		dir4.addComponent(dir41);
		dir4.addComponent(dir42);
		dir4.addComponent(file41);
		dir4.addComponent(file42);
		
		root.addComponent(dir1);
		root.addComponent(dir2);
		root.addComponent(dir3);
		root.addComponent(dir4);

		root.display(0);
		
	}

}
