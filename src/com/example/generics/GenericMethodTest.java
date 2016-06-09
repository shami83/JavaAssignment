package com.example.generics;

public class GenericMethodTest {
	
	
	public <T> void printValue(T instance)
	{
		System.out.println("class is "+ instance.getClass() + " value is " + instance);
	}
	
	public static void main(String[] args) {
		GenericMethodTest test = new GenericMethodTest();
		test.printValue(new Integer(2));		
		test.printValue(new Float(2));
		test.printValue("Hi");
		test.printValue(new Integer[]{1,2});
		
		
	}

}
