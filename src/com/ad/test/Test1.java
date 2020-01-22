package com.ad.test;

public class Test1 {

	private Test1(int a)
	{
	}
	
	/*private Test1(){
		
	}*/
	
	
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("com.ad.test.Test1");
		Test1 test1 = (Test1)cls.newInstance();
		System.out.println(test1.getClass().getName());
	}
}


/**
 * java.lang.InstantiationException: com.ad.test.Test1 will be thrown as no default constructor is there
 */

