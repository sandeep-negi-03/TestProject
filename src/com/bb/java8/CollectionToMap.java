package com.bb.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionToMap {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("a", "dep1"));
		list.add(new Student("b", "dep2"));
		list.add(new Student("c", "dep2"));
		System.out.println(list);
		
		Map<String, String> map = list.stream().collect
				(Collectors.toMap(Student::getDepartment, Student::getName));
		System.out.println(map);
	}
	
	
}

class Student{
	
	private String name;
	private String department;
	
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return name + " " + department;
	}
	
}