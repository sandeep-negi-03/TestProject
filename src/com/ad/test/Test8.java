package com.ad.test;

import java.util.LinkedList;
import java.util.Stack;

public class Test8 {

	
	public static void main(String[] args) {
		LinkedList<Box> listBoxes = new LinkedList<>();
		Stack<Box> anotherBoxList = new Stack<>();
		
		Box a = new Box(5.1f,"India");
		Box b = new Box(3.7f, "Japan");
		Box c = new Box(8.2f, "Tailand");
		
		listBoxes.add(a);
		listBoxes.add(b);
		listBoxes.add(c);
		
		anotherBoxList.push(a);
		anotherBoxList.push(b);
		anotherBoxList.push(c);

		System.out.println(listBoxes.poll().equals(anotherBoxList.pop())); // return false
		// as linked list will return 1st element and stack will pop last element
	}

}

class Box {
	private float weight;
	private String address;
	
	public Box(float weight, String address){
		super();
		this.weight = weight;
		this.address = address;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

