package com.cobee.javawebtech.chapter2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		SocketChannel socketChannel = SocketChannel.open();
		socketChannel.configureBlocking(true);
		socketChannel.connect(new InetSocketAddress("127.0.0.1", 60000));
		if (socketChannel.isConnectionPending())
		{
			socketChannel.finishConnect();
		}
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		byteBuffer.clear();
		byteBuffer.put("hello world".getBytes("UTF-8"));
		byteBuffer.flip();
		socketChannel.write(byteBuffer);
		socketChannel.close();
//		while(true){Thread.sleep(1000);}
		
	}

}
