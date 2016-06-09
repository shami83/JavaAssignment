package com.example.varargs;

public class VaragsTest {
	
	
	public void sum(int ... i)
	{
		
		int a = i[0];
		int b= i[1];
		int c = i[2];
		
		int sum = a+b+c;
		System.out.println("Sum is "+ sum);
	}
	
	public static void main(String[] args) {
		
		VaragsTest obj = new VaragsTest();
		obj.sum(10,20,30);
		
	}

}
