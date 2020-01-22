package com.java.exception;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcurrentModificationExceptionExample {

	ConcurrentModificationExceptionExample(String s) throws IOException{
		if(null == s){
			throw new IOException();
		}
	}
	
	public static void main(String args[]) throws IOException {
		new ConcurrentModificationExceptionExample(null);
		
/*		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value);
		}*/

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");
		myMap.put("4", "4");
		myMap.put("5", "5");
		myMap.put("6", "6");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
			//	myMap.put("7", "7");
//				myMap.remove("3");
			}
		}

	}
}

