package com.java.core.threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReeantrantLockDemo {

	public static void main(String[] args) {

			ReentrantLock l = new ReentrantLock();
			l.lock();
			l.lock();
			
			System.out.println("isLocked : " + l.isLocked());
			System.out.println("getHoldCount : " + l.getHoldCount());
			System.out.println("isHeldByCurrentThread : " + l.isHeldByCurrentThread());
			System.out.println("getQueueLength : " + l.getQueueLength());
			
			l.unlock();
			
			System.out.println("getHoldCount : " + l.getHoldCount());
			System.out.println("isLocked : " + l.isLocked());
			
			l.unlock();
			
			System.out.println("isLocked : " + l.isLocked());
			System.out.println("isFair : " + l.isFair());
			
			// l.unlock(); // java.lang.IllegalMonitorStateException
	}

}
