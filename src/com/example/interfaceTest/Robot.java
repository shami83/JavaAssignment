package com.example.interfaceTest;

public class Robot implements computerizedWork{

	public void work() {
		System.out.println("Doing work using Computer");
		
	}

	public void computerSpecification() {
		System.out.println("Updated quad core processor");
		
	}
	
	public static void main(String[] args) {
		
		Robot obj =new Robot();
		obj.computerSpecification();
		obj.work();
		
	}

}
