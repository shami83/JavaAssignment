package com.example.decision;

public class IfElse {
	
	public void checkIf(int number)
	{
		if(number >9)
		{
			System.out.println("This is 2 digit Number");
		}
		else
		{
			System.out.println("This is 1 digit Number");
		}
		
	}
	
	public static void main(String[] args) {
		
		IfElse obj =new IfElse();
		obj.checkIf(8);
		
	}


}
