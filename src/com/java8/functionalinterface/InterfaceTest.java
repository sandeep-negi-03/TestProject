package com.java8.functionalinterface;


@FunctionalInterface
public interface InterfaceTest {

	public abstract void abstractmethod();
	
	public default void defaultMethod() {}
	
	public String toString();
	
}
