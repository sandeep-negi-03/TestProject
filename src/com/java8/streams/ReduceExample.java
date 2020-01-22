package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	
	public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany", "England", "China",
                "Denmark", "Brazil", "France", "Australia");
 
        Optional<String> longestCountryName = countries.stream().reduce(
                (c1, c2) -> c1.length() > c2.length() ? c1 : c2);
        
        Optional<String> CountryNameAdd = countries.stream().reduce(
                (c1, c2) -> c1 + c2);
        System.out.println(CountryNameAdd.get());
 
        longestCountryName.ifPresent(System.out::println);
	}
}
