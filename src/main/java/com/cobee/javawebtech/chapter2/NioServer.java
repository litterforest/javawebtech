package com.cobee.javawebtech.chapter2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NioServer {

	public static void main(String[] args) throws IOException {
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		Charset charset = Charset.forName("UTF-8");
//		ExecutorService executorService = Executors.newFixedThreadPool(10);
		System.out.println("server is starting...");
		Selector selector = Selector.open();
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);
		ssc.socket().bind(new InetSocketAddress(60000));
		ssc.register(selector, SelectionKey.OP_ACCEPT);
		while(true)
		{
			selector.select();
			System.out.println("get ready operation");
			Set<SelectionKey> keys = selector.selectedKeys();
			Iterator<SelectionKey> iterator = keys.iterator();
			while(iterator.hasNext())
			{
				SelectionKey selectionKey = iterator.next();
				iterator.remove();
				if (selectionKey.isAcceptable())
				{
					ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
					SocketChannel socketChannel = serverSocketChannel.accept();
					socketChannel.configureBlocking(false);
					socketChannel.register(selector, SelectionKey.OP_READ);
					System.out.println("accept client...");
				}
				else if (selectionKey.isReadable())
				{
					
//					try {
						SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
						while (socketChannel.read(byteBuffer) != -1)
						{
							byteBuffer.flip();
							while(byteBuffer.hasRemaining())
							{
								System.out.println(charset.decode(byteBuffer));
							}
							byteBuffer.clear();
						}
						selectionKey.cancel();
						socketChannel.close();
//					} catch (IOException e) {
//						
//						e.printStackTrace();
//						if (selectionKey != null)
//						{
//							selectionKey.cancel();
//							selectionKey.channel().close();
//						}
//						
//					}
					
				}
			}
		}
		
	}

	private class RequestHandler implements Runnable
	{
		
		private SelectionKey selectionKey;
		
		public RequestHandler(SelectionKey selectionKey)
		{
			this.selectionKey = selectionKey;
		}
		
		public void run()
		{
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			Charset charset = Charset.forName("UTF-8");
			SocketChannel socketChannel = null;
			try {
				socketChannel = (SocketChannel) selectionKey.channel();
				while (socketChannel.read(byteBuffer) != -1)
				{
					byteBuffer.flip();
					while(byteBuffer.hasRemaining())
					{
						System.out.println(charset.decode(byteBuffer));
					}
					byteBuffer.clear();
				}
			} catch (IOException e) {
				e.printStackTrace();
//				if (selectionKey != null)
//				{
//					try {
//						selectionKey.cancel();
//						selectionKey.channel().close();
//					} catch (IOException e1) {
//						e1.printStackTrace();
//					}
//				}
			}
		}
		
	}
	
	private class RequestAcceptHandler implements Runnable
	{
		
		private SelectionKey selectionKey;
		private Selector selector;
		
		public RequestAcceptHandler(SelectionKey selectionKey, Selector selector)
		{
			this.selectionKey = selectionKey;
			this.selector = selector;
		}
		
		public void run()
		{
			try {
				ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
				SocketChannel socketChannel = serverSocketChannel.accept();
				socketChannel.configureBlocking(false);
				socketChannel.register(selector, SelectionKey.OP_READ);
				selectionKey.attach(ByteBuffer.allocate(1024));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
