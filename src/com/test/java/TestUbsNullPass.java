package com.test.java;


public class TestUbsNullPass {

	public static void main(String[] args) {
		TestUbsNullPass obj = new TestUbsNullPass();
		Object s = null;
		//		obj.methodA(null);
		
		System.out.println(int[].class.isPrimitive());
		   System.out.println(int[].class.getName());
		   System.out.println(int[].class.getSuperclass());
		    
		   System.out.println(int.class.isPrimitive());
		   System.out.println(int.class.getName());
		   System.out.println(int.class.getSuperclass());
		 
		   Object ref=new int[]{1,2,3};   // valid statement?
		  // Object[] ref=new int[]{1,2,3}; // valid statement? Invalid
	}
	
	void methodA(StringBuilder str){
		System.out.println("StrBuilder invoked");
		System.out.println(str);
	}
	
	void methodA(String str){
		System.out.println("Str invoked");
		System.out.println(str);
	}
	
	void methodA(Object obj){
		System.out.println("Object Invoked");
		System.out.println(obj);
	}

}
