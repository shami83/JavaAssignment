package com.example.constructor;

public class Man extends Mamals{
	
	
	public Man()
	{
		//super(); If you call or not compiler call super for you 
		System.out.println("Mans Constructor call");
		
		System.out.println("Second line call after constructor's call");
	}
	
	public static void main(String[] args) {
		
		Man man =new Man();
		
		
	}

}
