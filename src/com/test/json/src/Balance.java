package com.test.json.src;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Balance {

	String mand;
	String nonMan;
	
	
	public String getMand() {
		return mand;
	}
	public void setMand(String mand) {
		this.mand = mand;
	}
	public String getNonMan() {
		return nonMan;
	}
	public void setNonMan(String nonMan) {
		this.nonMan = nonMan;
	}
	
	
	
}
