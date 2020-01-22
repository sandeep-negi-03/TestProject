package com.java.collection;

import java.util.List;

public class Test {
	
	public void invalid(List<String> strings) { } 
//    public void invalid(List<Object> objects) { } // Erasure of method invalid(List<String>) is the same as another method in type Test
	
	public static void main(String[] args) {
		
	}

}
