package com.example.overloading;

public class BoxingVarargs {
	
	/*public void doIt(int i)
	{
		System.out.println("Call int version"  + i);
	}*/
	public void doIt(Integer i)
	{
		System.out.println("Call Integer version"  + i);
	}
	
	public void doIt(int... i)
	{
		System.out.println("Call varargs version"  + i);
	}
	
	
	public static void main(String[] args) {
		
		BoxingVarargs obj = new BoxingVarargs();
		obj.doIt(2);
		
		
	}
	
	

}
