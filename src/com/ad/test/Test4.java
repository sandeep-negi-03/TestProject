package com.ad.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public int deserialize(byte[] stream) throws IOException, ClassNotFoundException {
		int sum = 0;
		List<Person> personList = new ArrayList<Person>();

		ByteArrayInputStream bis = new ByteArrayInputStream(stream);
		ObjectInputStream in = new ObjectInputStream(bis);
		personList = (ArrayList<Person>) in.readObject();

		for (Person person : personList) {
			System.out.println(person.getAge());
			sum += person.getAge();
		}

		return sum;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("A", 10, 101));
		personList.add(new Person("B", 20, 201));

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(personList);

		byte[] stream = bos.toByteArray();

		Test4 test4 = new Test4();
		System.out.println("Total age : " + test4.deserialize(stream));
	}

}

class Person implements Serializable {

	private String name;
	private int age;
	private int id;

	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}