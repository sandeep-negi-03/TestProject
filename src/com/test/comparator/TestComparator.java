package com.test.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name = "a";
		student1.age = 1;
		Student student2 = new Student();
		student2.name = "b";
		student2.age = 2;
		
		List<Student> a = new ArrayList<Student>();
		a.add(student1);
		a.add(student2);
		
//		Collections.sort(a, new Compare());
//		for(Student st:a){    
//			System.out.println(st.name+" "+st.age);    
//			}    
//		System.out.println("Compare result: " + new Compare().compare(student1, student2));
		
		Comparator<Student> comparing = Comparator.comparing(Student::getAge);
		System.out.println("comparing : " + comparing.compare(student1, student2));
		Comparator<Student> thenComparing = comparing.thenComparing(Student::getName);
		System.out.println("thenComparing : " + thenComparing.reversed().compare(student1, student2));
	}

}


//class Compare implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.name.compareTo(o2.name);
//	}
//}

class Student{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}