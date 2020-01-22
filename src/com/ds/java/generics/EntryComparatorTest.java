package com.ds.java.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.toMap;

public class EntryComparatorTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Peter Gibbons"),
			    new Employee(2, "Samir Nagheenanajar"),
			    new Employee(3, "Michael Bolton"),
			    new Employee(4, "Milton Waddams"));
		
		
		Map<Integer, Employee> employeeMap = employees.stream()
			    .collect(toMap(Employee::getId, Function.identity()));
		
		// Sort employees by id and print them
		System.out.println("Sorted by key:");
		employeeMap.entrySet().stream()
		    .sorted(Map.Entry.comparingByKey())
		    .forEach(entry -> {
		        System.out.println(entry.getKey() + ": " + entry.getValue());
		    });
		
	}

}


/*class Employee {
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
	
}*/
