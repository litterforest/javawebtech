package com.cobee.javawebtech.designpattern.bridge;

public class MySQLDataReader implements DataReader {

	public void readData() {
		System.out.println("read data from mysql");
	}

}
