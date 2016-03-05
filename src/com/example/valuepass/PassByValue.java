package com.example.valuepass;
/*
 * 
 * This example describes pass by value
 * 
 * Whwn we pass a parameter to a method it create a temporery copy and take action on that so original value is not modified
 * 
 * unless we re-assign it with return value;
 */
public class PassByValue {
	public void takeActionWithNoReturn(int passingParameter)
	{
		passingParameter=passingParameter*2;
		System.out.println("Value in metod is" +passingParameter );
		
	}
	
	public int  takeActionWithReturn(int passingParameter)
	{
		passingParameter=passingParameter*2;
		System.out.println("Value in inside takeActionWithReturn is " +passingParameter);
		return passingParameter;
		
	}
	
	
	public static void main(String[] args) {
		
		PassByValue value = new PassByValue();
		int passingParameter = 7;
		value.takeActionWithNoReturn(passingParameter);
		System.out.println("After method call Now value is " + passingParameter);
		passingParameter = value.takeActionWithReturn(passingParameter);
		System.out.println("After method call Now value is " + passingParameter);
		
		
		
	}

}
