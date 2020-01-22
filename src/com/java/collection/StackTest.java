package com.java.collection;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.*; 

// Java code for stack implementation 
public class StackTest {

		// Pushing element on the top of the stack 
		static void stack_push(Stack<Integer> stack) throws Exception, IOException, BufferOverflowException
		{ 
			for(int i = 0; i < 5; i++) 
			{ 
				stack.push(i); 
			} 
		} 
		
		// Popping element from the top of the stack 
		static void stack_pop(Stack<Integer> stack) 
		{ 
			System.out.println("Pop :"); 

			for(int i = 0; i < 5; i++) 
			{ 
				Integer y = (Integer) stack.pop(); 
				System.out.println(y); 
			} 
		} 

		// Displaying element on the top of the stack 
		static void stack_peek(Stack<Integer> stack) 
		{ 
			Integer element = (Integer) stack.peek(); 
			System.out.println("Element on stack top : " + element); 
		} 
		
		// Searching element in the stack 
		static void stack_search(Stack<Integer> stack, int element) 
		{ 
			Integer pos = stack.search(element); 

			if(pos == -1) 
				System.out.println("Element not found"); 
			else
				System.out.println("Element is found at position " + pos); 
		} 


		public static void main (String[] args) throws BufferOverflowException, IOException, Exception 
		{ 
			Stack<Integer> stack = new Stack<>(); 

			stack_push(stack);
			System.out.println("Element on stack top : " + stack.peek());
			stack_pop(stack); 
			stack_push(stack); 
			stack_peek(stack); 
			stack_search(stack, 2); 
			stack_search(stack, 6); 
		} 
	} 
