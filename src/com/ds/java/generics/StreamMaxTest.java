package com.ds.java.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class StreamMaxTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Peter Gibbons"),
			    new Employee(2, "Samir Nagheenanajar"),
			    new Employee(3, "Michael Bolton"),
			    new Employee(4, "Milton Waddams"));

			// Anonymous inner class implementation of Comparator<Employee>
			Employee maxId = employees.stream()
			    .max(new Comparator<Employee>() {
			        @Override
			        public int compare(Employee e1, Employee e2) {
			            return e1.getId() - e2.getId();
			        }
			    }).orElse(Employee.DEFAULT_EMPLOYEE);

			// Anonymous inner class implementation of Comparator<Object>
			Employee maxName = employees.stream()
			    .max(new Comparator<Object>() {
			        @Override
			        public int compare(Object o1, Object o2) {
			            return o1.toString().compareTo(o2.toString());
			        }
			    }).orElse(Employee.DEFAULT_EMPLOYEE);

			System.out.println(maxId);   // Milton Waddams
			System.out.println(maxName);
			
			
//			Example 14. Idiomatic approach to finding the max Employee
			
			Employee maxId1 = employees.stream()
				    .max(comparingInt(Employee::getId)).orElse(Employee.DEFAULT_EMPLOYEE);
				Employee maxName1 = employees.stream()
				    .max(comparing(Object::toString)).orElse(Employee.DEFAULT_EMPLOYEE);
				Employee maxName2 = employees.stream()
					    .max(comparing(Employee::getName)).orElse(Employee.DEFAULT_EMPLOYEE);

				System.out.println(maxId1);    // same results
				System.out.println(maxName1);  //   as before
				System.out.println(maxName2);
	}
	
}

class Employee {
	public static final Employee DEFAULT_EMPLOYEE = new Employee(0, "No Name");

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Employee getDefaultEmployee() {
		return DEFAULT_EMPLOYEE;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}