package com.example.Association;

public class MobileSpecification {
	
	
	
	private String personName="SHAMIK";
	private String mobileBrand="SAMSUNG GALAXY";
	
	
	public void display()
	{
		System.out.println(personName + " has a mobile "+ mobileBrand);
	}
	
	public static void main(String[] args) {
		
		MobileSpecification obj = new MobileSpecification();
		obj.display();
		
	}
	
	
	
	

}
