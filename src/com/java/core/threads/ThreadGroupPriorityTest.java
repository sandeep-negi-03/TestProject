package com.java.core.threads;

/**
 * Example reference from Durga Core Java With OCJP/SCJP: Multithreading
 * Enhancement Part- 1|| Introduction || Thread Group
 * 
 * @author SandeepN
 *
 */

public class ThreadGroupPriorityTest {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("tg");
		Thread t1 = new Thread(tg, "Thread1");
		Thread t2 = new Thread(tg, "Thread2");
		
		tg.setMaxPriority(3);
		
		Thread t3 = new Thread(tg, "Thread3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
