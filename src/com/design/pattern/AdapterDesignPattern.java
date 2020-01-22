package com.design.pattern;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		aw.writeAssignment("Calling method");;
	}
	
}


class AssignmentWork{
	
	private Pen p;
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String s){
		
	}
}

interface Pen{
		void write(String s);
}