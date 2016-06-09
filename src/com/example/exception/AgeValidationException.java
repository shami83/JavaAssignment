package com.example.exception;

public class AgeValidationException extends Exception{
	
	int age;
	String msg;
	
	AgeValidationException(String msg,int age)
	{
		this.age=age;
		this.msg=msg;
	}
	
	public void printMessage()
	{
		System.out.println(msg + age);
	}
	

}
