package com.java.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class CustomRuntimeExTest {

	public static void main(String[] args) {
		
		CustomException ce = new CustomException();
		ce.getMessage();
		/*CustomRuntimeEx cre = new CustomRuntimeEx("Runtime Error Occured");
		cre.getMessage();*/
		throw new CustomRuntimeEx("Error occured");
		
		//SSystem.out.println("Done");
	}
	

}

class CustomRuntimeEx extends RuntimeException{
	
	public CustomRuntimeEx(final String message){
		super(message);
	}

	 public void printStackTrace(final PrintStream s) {
	        synchronized (s) {
	            printStackTrace(new PrintWriter(s));
	        }
	    }

	    public void printStackTrace(final PrintWriter s) {
	        synchronized (s) {
	            s.println("\t-------------------------------");
	            s.println(getMessage());
	            s.println("\t-------------------------------");
	            s.flush();
	        }
	    }
	
}

class CustomException extends Exception{
	
}