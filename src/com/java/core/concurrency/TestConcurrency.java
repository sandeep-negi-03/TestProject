package com.java.core.concurrency;

class Foo {
    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}



public class TestConcurrency implements Runnable{
	Foo foo = new Foo();
	
	@Override
	public void run() {
		System.out.println("inside run method");
		for(int i=0;i<10;i++){
		foo.setX(10);
		System.out.println("foo.getX - " + foo.getX());
		foo.setX(20);
		System.out.println("foo.getX - " + foo.getX());
		foo.setX(30);
		System.out.println("foo.getX - " + foo.getX());
		}
	}

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new TestConcurrency());
		
		Thread t2 = new Thread(new TestConcurrency());
		
		

		t1.start();
		t2.start();
		
		System.out.println("Class Ended");
	}
	
	
	
	
}
