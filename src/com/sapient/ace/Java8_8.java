package com.sapient.ace;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * I have a stream of strings and I want to collect them in  a map with key as length and value as a Set of those words
 * @author sannegi6
 *
 */

public class Java8_8 {

	
	public static void main(String[] args) {
		
		String [] array = {"Abc","Def", "abcd", "dedd"};
		List<String> list = Arrays.asList(array);
		
				
		Map<Integer,Set<String>> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		
		System.out.println(map);
		
	}
}

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

