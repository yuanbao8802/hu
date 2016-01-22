package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Lock{
	
	private Lock lock;
	
	private static final Map<String, Lock> logs = new ConcurrentHashMap<String, Lock>();
	
	public MyLock(String key) {
		lock = getLock(key);
	}

	private Lock getLock(String key) {
		synchronized (logs) {
			lock = logs.get(key);
			if (lock == null) {
				lock = new ReentrantLock();
				logs.put(key, lock);
			}
		}
		return lock;
	}

	public void lock() {
		lock.lock();
	}

	public void lockInterruptibly() throws InterruptedException {
		lock.lockInterruptibly();
	}

	public boolean tryLock() {
		return lock.tryLock();
	}

	public boolean tryLock(long time, TimeUnit unit)
			throws InterruptedException {
		return lock.tryLock(time, unit);
	}

	public void unlock() {
		lock.unlock();
	}

	public Condition newCondition() {
		return lock.newCondition();
	}
}
