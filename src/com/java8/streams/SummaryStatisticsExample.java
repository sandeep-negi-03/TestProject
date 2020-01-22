package com.java8.streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

import com.java8.streams.Person1.Gender;

public class SummaryStatisticsExample {
	public static void main(String[] args) {

		LongSummaryStatistics stats = new LongSummaryStatistics();
		stats.accept(1);
		stats.accept(2);
		stats.accept(3);
		stats.accept(4);
		stats.accept(5);

		System.out.println("Count:- " + stats.getCount());
		System.out.println("Sum:- " + stats.getSum());
		System.out.println("Min:- " + stats.getMin());
		System.out.println("Max:- " + stats.getMax());
		System.out.println("Average:- " + stats.getAverage());

		List<Person1> persons = new ArrayList<Person1>();
		persons.add(new Person1(1, "Divya", 24, Gender.FEMALE));
		persons.add(new Person1(2, "Mahesh", 22, Gender.MALE));
		persons.add(new Person1(3, "Dinesh", 32, Gender.MALE));
		persons.add(new Person1(4, "Vinay", 25, Gender.MALE));
		persons.add(new Person1(5, "Kapil", 29, Gender.MALE));
		persons.add(new Person1(6, "Pallavi", 23, Gender.FEMALE));
		persons.add(new Person1(7, "Mayuri", 21, Gender.FEMALE));
		persons.add(new Person1(8, "Yashwant", 30, Gender.MALE));

		IntSummaryStatistics summaryByAge = persons.stream().collect(Collectors.summarizingInt(p -> p.getAge()));

		System.out.println();

		System.out.println("Total number of Persons:- " + summaryByAge.getCount());
		System.out.println("Sum Of Age:- " + summaryByAge.getSum());
		System.out.println("Min Age:- " + summaryByAge.getMin());
		System.out.println("Max Age:- " + summaryByAge.getMax());
		System.out.println("Average Age:- " + summaryByAge.getAverage());

	}
}

class Person1 {
	private int personId;
	private String name;
	private int age;
	private Gender gender;

	public Person1(int personId, String name, int age, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Person Id:- " + getPersonId() + " Gender:- " + getGender() + " Name:- " + getName() + " Age:- "
				+ getAge());
		return str.toString();
	}

	public static enum Gender {
		MALE, FEMALE
	}

}