package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends Thread{

	public static void main(String[] args) {
		ArrayListTest arrayListTest = new ArrayListTest();
		ArrayListTest arrayListTest2 = new ArrayListTest();
		arrayListTest.start();
		arrayListTest2.start();
	}
	
	@Override
	public void run() {
		List<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		remove(list);
	}

	public void remove(List<String> list){
		
		
		for(String s :list){
			if(s.equals("b")){
				list.remove("b");
			}
		}
		System.out.println(list);
	}
}
