package com.example.constructor;

public class Child extends Parent{
	
	public Child(String str)
	{
		super(str);//Has to invoke parametric version as paren does not has any blank constructor
		System.out.println("Child :" + str);
	}
	
	public static void main(String[] args) {
		
		Child c =new Child("Hello");
		
		
	}

}
