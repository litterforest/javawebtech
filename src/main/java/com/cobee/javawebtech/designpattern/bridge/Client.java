package com.cobee.javawebtech.designpattern.bridge;

public class Client {

	public static void main(String[] args) {
		
		DataReader mysql = new MySQLDataReader();
		DataReader oracle = new OracleDataReader();
		
		PDFData2File PDFData2File = new PDFData2File();
		PDFData2File.setDataReader(mysql);
		
		PDFData2File.writeFile();
		
		PDFData2File.setDataReader(oracle);
		
		PDFData2File.writeFile();

	}

}
