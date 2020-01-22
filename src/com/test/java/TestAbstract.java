package com.test.java;

public class TestAbstract {

	public static void main(String[] args) {
		Abs abs = new AbsImpl();
		abs.hi();

	}
}

abstract class Abs {
	Abs() {
		System.out.println("Abs Constructor");
	}

	{
		System.out.println("Abs Instance block");
	}

	static {
		System.out.println("Abs Static instance block");
	}

	public abstract void hello();

	public void hi() {
		System.out.println("Hi");
	}
}

class AbsImpl extends Abs {

	public AbsImpl() {
		System.out.println("AbsImpl Constructor");
	}

	{
		System.out.println("AbsImpl Instance block");
	}

	static {
		System.out.println("AbsImpl Static instance block");
	}

	@Override
	public void hello() {
		System.out.println("Hello");
	}

	public void hi() {
		System.out.println("Child Hi");
		super.hi();
	}

}

interface Java8Interface {
	void alpha();
	default int beta  ()
	{ return 6; 
	}
	static String omega()  {
		return "Cannot override"; 
		}
	}