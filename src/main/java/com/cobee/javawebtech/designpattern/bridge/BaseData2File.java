package com.cobee.javawebtech.designpattern.bridge;

public abstract class BaseData2File {

	private DataReader dataReader;

	public BaseData2File() {
		super();
	}

	public BaseData2File(DataReader dataReader) {
		super();
		this.dataReader = dataReader;
	}

	public DataReader getDataReader() {
		return dataReader;
	}

	public void setDataReader(DataReader dataReader) {
		this.dataReader = dataReader;
	}

	public abstract void writeFile();

}
