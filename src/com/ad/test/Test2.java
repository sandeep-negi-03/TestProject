package com.ad.test;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("java.lang.String").getName()); // will Run
		System.out.println(Class.forName("String").getName()); // Will not run
		// java.lang.ClassNotFoundException: String , full classpath needed to be given
	}
	
	/**
	 * public class LinkageError
	extends Error
	Subclasses of LinkageError indicate that a class has some dependency on another class; 
	however, the latter class has incompatibly changed after the compilation of the former class.
	
	 */
	
}
