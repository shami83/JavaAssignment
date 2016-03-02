package com.example.main;

/* This is show how to create properties,methods ina class and call them via main method*/
public class Helloworld {
	
	
	private String greet=null;//properties initial value is null
	
	public String getGreeting(String name)// method return type is Sting taking argument of type String
	{
		greet = "Hello " + name + " Welcome To Java World !!!";
		
		return greet;
	}
	
	/*
	 * main methods java entry point
	 */

	 public static void main(String[] args) {
		 Helloworld refrenceOfHelloWorldClass = new Helloworld();
		 
		String refString =  refrenceOfHelloWorldClass.getGreeting("Shamik Mitra");
		System.out.println(refString);
	}
}
