package com.example.Methodshadowing;

public class Child extends Methodshadowing{
	
	public static void display()
	{
		System.out.println("I am child's static version");
	}
	
	
	
	public static void main(String[] args) {
		Methodshadowing obj = new Methodshadowing();//polymorphic assignment
		obj.display();
		
		Child child = new Child();
		child.display();
		
	}
	


}
