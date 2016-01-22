package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

	public static void main(String[] args) {
		Executor executor = Executors.newCachedThreadPool();
		for (int i = 0 ; i < 10 ; i++) {
			executor.execute(new R1(new String("1")) );
			System.out.println("new + " + i); 
		}
	}
	
	static class R1 implements Runnable {
		
		static int i = 0;
		
		private String key ;
		
		static ConcurrentHashMap<String, String> lockBuff = new ConcurrentHashMap<String, String>();
		
		public R1(String key) {
				/*this.lock = lockBuff.get(lock);
				if (this.lock == null) {
					this.lock = String.valueOf(lock);
					System.out.println("new lock : " + this.lock); 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					lockBuff.put(this.lock, this.lock);
				}*/
			this.key = key;
//			this.lock = "1";
		}
//		static Lock lock = new ReentrantLock();
		public void run() {
			/*String lock = lockBuff.get(key);
			if (lock == null) {
				lock = String.valueOf(key);
				System.out.println("new lock : " + lock); 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lockBuff.put(lock, lock);
			}
			
			synchronized (key) {*/
				Lock lock = new MyLock(key);
				try {
					lock.lock();
					for (int j = 0; j < 10; j++) {
							Thread.sleep(100);
						System.out.println(j);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					System.out.println("remove lock : " + lockBuff.size());
					lockBuff.remove(key);
					lock.unlock();
				}
			
//			}
		}
		
	}
}
