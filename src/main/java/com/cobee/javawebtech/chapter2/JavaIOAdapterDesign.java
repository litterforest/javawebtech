package com.cobee.javawebtech.chapter2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class JavaIOAdapterDesign {

	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = new FileInputStream("F:\\tmp\\jingxianfeng.sql");
		Reader reader = new InputStreamReader(inputStream);
		reader.read();
		
		OutputStream outputStream = new FileOutputStream("F:\\tmp\\jingxianfeng.sql");
		Writer writer = new OutputStreamWriter(outputStream);
		writer.write("");
		
		InputStream is = new FileInputStream("");
		BufferedInputStream bis = new BufferedInputStream(is);
		bis.read();
	}

}
