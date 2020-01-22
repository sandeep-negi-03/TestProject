package com.sapient.ace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write a program to count the number of ‘e’ in a list. E.g "Ken", "Jeff",
 * "Ellen" should print 4.
 * 
 * @author sannegi6
 */

public class Java8_7 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Elle");
		list.add("Ane");
		list.add("pele");
		
//		 list.stream().forEach(i->Stream.of(i.toLowerCase().toCharArray()).map(chr->chr.equals('e'))));
		
		long count=list.get(0).chars().filter(ch-> ch==101||ch==69).count();
//		System.out.println(count);
		
		long counts = list.stream().reduce(0L,(Curcount,item)->item.chars().
				filter(ch->ch=='e'||ch=='E').count()+Curcount, (a,b)->a+b);
	
		System.out.println(counts);
	}
}
