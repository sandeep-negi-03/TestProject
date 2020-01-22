package com.test.json.src;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.suite.pojo.SuiteCollection;



public class JsonIterator {

	
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		StringBuilder contentBuilder = new StringBuilder();
		try {
			Stream<String> stream = Files.lines(
					Paths.get("C:/Storage/System Backup/Sandeep/MyWorkSpace/TestProject/src/com/test/json/resource/suite_collection.json"),
					StandardCharsets.UTF_8);
			
			System.out.println(stream.toString());
			
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
			SuiteCollection suiteCollection = mapper.readValue(contentBuilder.toString(), SuiteCollection.class);
			
			System.out.println("Mapper : -  " + suiteCollection);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
