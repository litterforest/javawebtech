/**
 * 
 */
package com.cobee.javawebtech.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/** <pre>文件夹类型对象</pre>
 * @author 陈淦森
 * @version 1.0.1
 * @date 2017年10月26日
 *
 */
public class Dir extends FileComponent {
	
	List<FileComponent> componentList = new ArrayList<FileComponent>();
	
	public Dir() {
		super();
	}

	public Dir(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.composite.FileComponent#addComponent(com.cobee.javawebtech.designpattern.composite.FileComponent)
	 */
	@Override
	protected void addComponent(FileComponent component) {
		componentList.add(component);
	}

	/* (non-Javadoc)
	 * @see com.cobee.javawebtech.designpattern.composite.FileComponent#removeComponent(com.cobee.javawebtech.designpattern.composite.FileComponent)
	 */
	@Override
	protected void removeComponent(FileComponent component) {
		componentList.remove(component);
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
		System.out.println(getName() + "(*)");
		if (componentList.size() > 0)
		{
			dept += 2;
			for (FileComponent fc : componentList)
			{
				fc.display(dept);
			}
		}
	}

}
