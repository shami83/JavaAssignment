package com.example.inheritence;

public class ComuterizedScool extends School{
	
	private String Computerized="Fully Computerized";
	public void display()
	{
		System.out.println("School Name " + this.getName());
		System.out.println("School Medium " + this.getMedium());
		System.out.println("Mode of teaching " + Computerized );
	}
	
	
	

}
