package com.durga.executor.demo;


/**
 * Overriding initialValue Method of the ThreadLocal class
 * @author SandeepN
 *
 */
public class ThreadLocalDemo1A {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal(){
			 public Object initialValue(){
				 return "Sandeep";
			 }
		};
		
		System.out.println(tl.get());
		tl.set("Durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}

