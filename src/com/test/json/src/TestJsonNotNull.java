package com.test.json.src;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonNotNull {

	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Balance bal = new Balance();
		
		bal.setMand("Hi");
//		bal.setNonMan(null);
		
		
		
		String s = mapper.writeValueAsString(bal);
		System.out.println(s);
		
	}
	
	
	
}
