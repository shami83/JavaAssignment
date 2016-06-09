package com.example.InnerClass;

public class StaticNestedClass {
	
	
	public static class InnerStaticClass{
		
		public void display()
		{
			System.out.println("I am static Nested Class");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		InnerStaticClass obj = new StaticNestedClass.InnerStaticClass();
		obj.display();
	}
}
