package com.test;

public class TestWait {

	public static void main(String[] args) throws InterruptedException {
		final String lock = "x";
		Thread tt = new Thread(){
			public void run() {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Œ“±ªªΩ–—¡À");
			}
		};
		tt.start();
		
		System.out.println("1111111");
		Thread.sleep(2111);
		lock.notify();
	
	}
	
}
