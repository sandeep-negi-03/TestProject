package com.java.tricky;

import java.util.Date;

final class ImmutableClass {
	public ImmutableClass(int id, String name, Date doj) {
		this.id = id;
		this.name = name;
		this.doj = new Date(doj.getTime());
	}

	private final int id;
	private final String name;
	private final Date doj;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return the
	 * reference of original instance variable. Instead of a new Date object, with
	 * content copied to it, should be returned.
	 */
	public Date getDoj() {
		return new Date(doj.getTime()); // For mutable fields
	}
}

public class ImmutableClassDemo {
	public static void main(String[] args) {
		String name = "raj";
		int id = 1;
		Date doj = new Date();

		ImmutableClass class1 = new ImmutableClass(id, name, doj);
		ImmutableClass class2 = new ImmutableClass(id, name, doj);
// every time will get a new reference for same object. Modification in
// reference will not affect the immutability because it is temporary reference.
		Date date = class1.getDoj();
		date.setTime(date.getTime() + 122435);
		System.out.println("Class1 Date : " + class1.getDoj().getTime());
		System.out.println("Class2 Date : " + class2.getDoj().getTime());
		System.out.println(class1.getDoj() == class2.getDoj());
	}
}
