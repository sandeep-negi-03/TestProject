package com.java.core.threads;

import java.util.concurrent.locks.*;

public class TGSystemGroupTest {

	public static void main(String[] args) {
		ThreadGroup system  = Thread.currentThread().getThreadGroup().getParent();
		
		Thread [] t = new Thread[system.activeCount()];
		
		system.enumerate(t);
		
		for(Thread t1 : t){
			System.out.println(t1.getName() + " : is Deamon : " + t1.isDaemon());
		}
		
		Lock l = new ReentrantLock();
		
	}

}
