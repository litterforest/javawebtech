package com.cobee.javawebtech.chapter2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTester {

	public static void main(String[] args) throws IOException {
		
		Charset charset = Charset.forName("UTF-8");
		CharsetDecoder decoder = charset.newDecoder();
		RandomAccessFile raf = new RandomAccessFile("F:\\tmp\\test.txt", "rw");
		
		FileChannel fileChannel = raf.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		CharBuffer charBuffer = CharBuffer.allocate(1024);
		int readBs = fileChannel.read(byteBuffer);
		
		byteBuffer.flip();
        decoder.decode(byteBuffer, charBuffer, false);
        charBuffer.flip();
		
		System.out.println(charBuffer.toString());
		
		fileChannel.close();
		raf.close();
		
	}

}
