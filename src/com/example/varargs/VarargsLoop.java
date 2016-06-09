package com.example.varargs;

public class VarargsLoop {
	
	public void sum(int...i)
	{
		int result=0;
		
		for(int element : i )
		{
			result=result+element;
		}
		System.out.println("sum is " + result);
	}
	
	public static void main(String[] args) {
		
		VarargsLoop loop = new VarargsLoop();
		loop.sum(1,2,3,4,5,6,7,8,9,10);
		
	}

}
