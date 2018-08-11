package com.cobee.javawebtech.designpattern.bridge;

public class XmlData2File extends BaseData2File {

	@Override
	public void writeFile() {
		super.getDataReader().readData();
		System.out.println("数据导出成xml文件格式");
	}

}
