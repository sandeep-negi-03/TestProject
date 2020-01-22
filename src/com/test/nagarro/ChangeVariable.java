package com.test.nagarro;

/** Create a method which takes a string input and return a string which
 	-- if it have _ then it is c variable so convert to java variable where _ is removed and the character
 		after _ will be in UpperCase. The converted variable can not start with Capital letter.
		If _ is the first character then remove it and vice versa for Java
	
*/


public class ChangeVariable {

	public static void main(String[] args) {
		String input1 = "_this_is_new_string";
		System.out.println(convert(input1));
		
		String input1_2 = "_single";
		System.out.println(convert(input1_2));

		String input2 = "thisIsJavaKeyword";
		System.out.println(convert(input2));

		String input2_1 = "this";
		System.out.println(convert(input2_1));

	}

	public static String convert(String input1) {
		StringBuilder sb = new StringBuilder();

		if (input1.contains("_")) {
			System.out.println("String to convert to java convention : " + input1);
			if (input1.charAt(0) == '_') {
				input1 = input1.substring(1);
			}
			for (int i = 0; i < input1.length(); i++) {
				if (input1.charAt(i) == '_') {
					sb.append(Character.toUpperCase(input1.charAt(i + 1)));
					i++;
				} else
					sb.append(input1.charAt(i));
			}
			return sb.toString();
		}

		else {
			System.out.println("String to convert to c convention : " + input1);
			for (int i = 0; i < input1.length(); i++) {
				if (Character.isUpperCase(input1.charAt(i))) {
					sb.append('_');
					sb.append(Character.toLowerCase(input1.charAt(i)));
				} else {
					sb.append(input1.charAt(i));
				}
			}
			return sb.toString();
		}
	}

}
