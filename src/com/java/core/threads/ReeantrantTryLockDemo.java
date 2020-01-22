package com.java.core.threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReeantrantTryLockDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread1 t1 = new MyThread1("Thread1");
		MyThread1 t2 = new MyThread1("Thread2");
		
		t1.start();
		t2.start();
		
	}

}

/*
class Display{
	
	ReentrantLock l = new ReentrantLock();
	
	//synchronized keyword to display output in sync , but lock is at method level
	public  void wish(String name)
	{
		l.lock();
		for(int i=0;i<5;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}*/

class MyThread1 extends Thread{
	
	public MyThread1(String name) {
		super(name);
	}
	
	static ReentrantLock l = new ReentrantLock();
	
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName() + " .. got lock");
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){}
			l.unlock();
		}else{
			System.out.println(Thread.currentThread().getName() + " .. did not got lock");
		}
		
	}
}