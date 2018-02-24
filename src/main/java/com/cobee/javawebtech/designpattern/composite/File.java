/**
 * 
 */
package com.cobee.javawebtech.designpattern.composite;

/** <pre>文件对象，叶子元素</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月26日
 *
 */
public class File extends FileComponent {
	
	public File(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.composite.FileComponent#addComponent(com.cobee.javawebtech.designpattern.composite.FileComponent)
	 */
	@Override
	protected void addComponent(FileComponent component) {
		throw new RuntimeException("文件类型对象不支持addComponent(...)操作");
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.composite.FileComponent#removeComponent(com.cobee.javawebtech.designpattern.composite.FileComponent)
	 */
	@Override
	protected void removeComponent(FileComponent component) {
		throw new RuntimeException("文件类型对象不支持removeComponent(...)操作");
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.composite.FileComponent#display(int)
	 */
	@Override
	protected void display(int dept) {
		for (int i = 0; i < dept; i++)
		{
			System.out.print("-");
		}
		System.out.println(getName());
	}

}
