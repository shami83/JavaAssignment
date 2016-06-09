package com.example.overriding;

public class Rectangle extends AreaFinder{
	
	int length=20;
	int breadth=10;
	
	@Override
	public void calculateArea()
	{
		System.out.println("Area is "+ length*breadth);
	}
	
	public static void main(String[] args) {
		
		AreaFinder obj =new Rectangle();
		obj.calculateArea();
		
		AreaFinder obj1 =new AreaFinder();
		obj1.calculateArea();
		
		Rectangle obj2 =new Rectangle();
		obj2.calculateArea();
		
		
		
		
	}

}
