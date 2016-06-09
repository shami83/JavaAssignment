package com.example.interfaceTest.DiamondProblem;

public class NewSchool implements ManualSchool,ComputerizedSchool{

	public void display() {
		System.out.println("Both Balackboard and Computer");
		
	}
	
	public static void main(String[] args) {
		
		NewSchool sch =new NewSchool();
		sch.display();
		
		
	}

}
