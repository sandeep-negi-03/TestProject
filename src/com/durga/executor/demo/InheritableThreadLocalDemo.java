package com.durga.executor.demo;

public class InheritableThreadLocalDemo {

public static void main(String[] args) {
	
	ParentThread parentThread = new ParentThread();
	parentThread.start();
}

}


class ParentThread extends Thread{
	
	public static InheritableThreadLocal tl = new InheritableThreadLocal<>();
//	public static ThreadLocal tl = new ThreadLocal<>();
	
	@Override
	public void run() {
		tl.set("Parent");
		System.out.println("Parent Thread value : " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread Value : " + ParentThread.tl.get());
	}
}