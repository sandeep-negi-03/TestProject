package com.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaSort {
	public static void main(String[] args) {
		ArrayList<Employee> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);

		Collections.sort(employees, compareByName);

		System.out.println(employees);
	}

	private static ArrayList<Employee> getUnsortedEmployeeList() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(2, "Lokesh", "Gupta"));
		list.add(new Employee(1, "Alex", "Gussin"));
		list.add(new Employee(4, "Brian", "Sux"));
		list.add(new Employee(5, "Neon", "Piper"));
		list.add(new Employee(3, "David", "Beckham"));
		list.add(new Employee(7, "Alex", "Beckham"));
		list.add(new Employee(6, "Brian", "Suxena"));
		return list;
	}
}

class Employee {
	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]\n";
	}

	
}