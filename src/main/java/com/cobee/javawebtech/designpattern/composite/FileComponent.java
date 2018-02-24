/**
 * 
 */
package com.cobee.javawebtech.designpattern.composite;

/** 
 * <pre>文件系统组件，用于抽象文件和文件夹对象的共性</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月26日
 *
 */
public abstract class FileComponent {
	
	private String name;
	
	public FileComponent() {
		super();
	}

	public FileComponent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected abstract void addComponent(FileComponent component);
	protected abstract void removeComponent(FileComponent component);
	protected abstract void display(int dept);
	
}
