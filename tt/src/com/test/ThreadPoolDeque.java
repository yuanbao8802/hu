package com.test;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPoolDeque {
	

	private static ThreadPoolDeque threadPoolDeque=new ThreadPoolDeque();
	
	private ExecutorService executors;
	
	private static Deque<Runnable> deq = new LinkedBlockingDeque<Runnable>();
	private static boolean flag = false;
	
	private boolean isWork ;
	
	private ThreadPoolDeque(){
		executors = Executors.newCachedThreadPool();
		isWork = true;
	}
	
	public static ThreadPoolDeque getInstance(){
		if (threadPoolDeque==null) {
			threadPoolDeque=new ThreadPoolDeque();
		}
		return threadPoolDeque;
	}
	
	private Thread executorThread=new Thread(new Runnable() {
		public void run() {
			while(true) {
				if (flag) {
					break;
				}
				Runnable info = null;
				synchronized (deq) {
					info = deq.poll();
					if (info == null) {
						try {
							isWork = false;
							deq.wait();
						} catch (InterruptedException e) {
						}
						continue;
					}
				}
				executors.execute(info);
			}
		}
	});
	
	
	public void add(Runnable at) {
		synchronized (deq) {
			deq.offer(at);
			if (!isWork) {
				isWork = true;
				deq.notify();
			}
		}
	}
	
	public void start() {
		executorThread.setName("ExecutorThread");
		executorThread.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		executorThread.start();
	}
	
	public void stop() {
		try {
			flag = true;
			executorThread.interrupt();
			executors.shutdown();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
    class ThreadExceptionHandler implements UncaughtExceptionHandler {

		/* (non-Javadoc)
		 * @see java.lang.Thread.UncaughtExceptionHandler#uncaughtException(java.lang.Thread, java.lang.Throwable)
		 * Âº?èë‰∫∫ÂëòÔºöshaobin.huang
		 */
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			e.printStackTrace();
			start();
		}
    	
    }
    
}
