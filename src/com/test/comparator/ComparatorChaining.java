package com.test.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorChaining {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(1, "A", "B", 34),
				new Employee(1, "A", "B", 36),
				new Employee(1, "A", "C", 36),
				new Employee(4, "C", "D", 30),
				new Employee(3, "B", "A", 31), 
				new Employee(2, "D", "C", 25));

		Collections.sort(list,
				new FirstNameSorter().thenComparing(new LastNameSorter()).thenComparing(new AgeSorter()));

		System.out.println(list);
	}
}

class Employee {
	private Integer id = -1;
	private Integer age = -1;
	private String firstName = null;
	private String lastName = null;

	public Employee(Integer id, String fName, String lName, Integer age) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
		return "\nEmployee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

class FirstNameSorter implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}

class LastNameSorter implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}

class AgeSorter implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}
}