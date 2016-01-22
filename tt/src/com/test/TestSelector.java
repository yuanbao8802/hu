package com.test;

import java.nio.channels.Channel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class TestSelector {

	public static void main(String[] args) throws Exception {
		Selector selector = Selector.open();
		
		ServerSocketChannel ssc = ServerSocketChannel.open();
		SocketChannel channel = ssc.accept();
		
		channel.configureBlocking(false);
		
		channel.register(selector, SelectionKey.OP_ACCEPT);
		
		/*Iterator<SelectionKey> ite = selector.selectedKeys().iterator();
		while (ite.hasNext()) {
			SelectionKey key = ite.next();
		}*/
		
		selector.select();
		
	}
}
