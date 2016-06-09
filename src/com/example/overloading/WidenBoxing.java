package com.example.overloading;

public class WidenBoxing {
	
	public void doIt(Object i)
	{
		System.out.println("Call box and widen int->Integer->Object  "   + i);
	}
	
	public void doIt(Long i)
	{
		System.out.println("Call widen and box int->long->Long  not possible " + i);
	}
	
	public static void main(String[] args) {
		
		WidenBoxing obj =new WidenBoxing();
		obj.doIt(2);
	}

}
