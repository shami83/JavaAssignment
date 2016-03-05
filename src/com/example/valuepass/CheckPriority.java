package com.example.valuepass;

public class CheckPriority {
	
	
	public int value=3;//member variable
	
	public void  localValue()
	{
		int value=9;
		System.out.println("Local value is " + value);
	}
	
	public void memberValue()
	{
		System.out.println("global value is " + value);
	}
	
	public static void main(String[] args) {
		
		CheckPriority cp = new CheckPriority();
		cp.localValue();
		cp.memberValue();
		
		
	}

}
