package com.example.overloading;

public class Adder {
	
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println("Result is in int version of add " + result);
	}
	
	public void add(double a, double b)
	{
		double result=a+b;
		System.out.println("Result is in double version of add " + result);
	}
	
	public static void main(String[] args) {
		Adder obj =new Adder();
		obj.add(1, 2);
		obj.add(1D, 5D);
	}

}
