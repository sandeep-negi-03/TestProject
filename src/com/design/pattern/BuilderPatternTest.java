package com.design.pattern;

import com.design.pattern.Pet.Builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		Builder pet = new Pet.Builder().withAddress("address");
		
		Pet petObj = pet.build();
		
		System.out.println(petObj);
		
	}
	
}

