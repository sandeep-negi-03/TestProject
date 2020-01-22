package com.java.core.threads;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvi");
		
		t1.start();
		t2.start();
		
	}

}


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
}

class MyThread extends Thread{
	Display d;
	String name;
	
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
}