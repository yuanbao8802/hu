package com.util;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadPoolTools {

	private Deque<Runnable> deq ;
	private ExecutorService pool ;
	
	public ThreadPoolTools() {
		deq = new LinkedBlockingDeque<Runnable>();
		pool = Executors.newCachedThreadPool();
	}
	
	public void add(Runnable t) {
		deq.offer(t);
	}
	
	public void start() {
		while(true) {
			Runnable t = deq.poll();
			if (t == null) {
				try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
				continue;
			}
			pool.execute(t);
		}
	}
	
	public void tt() throws InterruptedException, ExecutionException, TimeoutException {
		Future<String> futrue = pool.submit(new Callable<String>() {

			public String call() throws Exception {
				return null;
			}
		});
		
		futrue.get(1000, TimeUnit.SECONDS);
	}
}
