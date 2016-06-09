package com.example.decision;

public class IfTest {
	
	
	public void checkIf(int number)
	{
		if(number >9)
		{
			System.out.println("This is 2 digit Number");
		}
		
	}
	
	public static void main(String[] args) {
		
		IfTest obj =new IfTest();
		obj.checkIf(10);
		
	}

}
