package com.example.boxing;

public class BoxingUnBoxing {
	
	
	public void box(Integer i)
	{
		System.out.println("Automatically Box to Integer "  + i);
	}
	
	public void unbox(int i)
	{
		System.out.println("Automatically unBox to int "  + i);
	}
	
	public static void main(String[] args) {
		
		BoxingUnBoxing obj =new BoxingUnBoxing();
		int i=2;
		obj.box(i);
		Integer obInt= new Integer(10);
		obj.unbox(obInt);
		
		
	}


}
