package com.cobee.javawebtech.chapter2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWriteTester {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileChannel fileChannel = null;
		try {
			fos = new FileOutputStream("F:\\tmp\\test.txt", true);
			fileChannel = fos.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			byteBuffer.clear();
			byteBuffer.put("non-blocking io write to the file...".getBytes());
			byteBuffer.flip();
			while(byteBuffer.hasRemaining())
			{
				fileChannel.write(byteBuffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileChannel != null){
				try {
					fileChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
