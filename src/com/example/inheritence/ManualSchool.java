package com.example.inheritence;

public class ManualSchool extends School{
	private String mode="Manually using Black Board";
	public void display()
	{
		System.out.println("School Name " + this.getName());
		System.out.println("School Medium " + this.getMedium());
		System.out.println("Mode of teaching " + mode );
	}
	

}
