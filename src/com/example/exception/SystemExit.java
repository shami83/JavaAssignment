package com.example.exception;

public class SystemExit {
	
	public void test()
	{
		try{
			
			System.out.println("In try block");
			System.exit(0);
			
		}
		finally
		{
			System.out.println("In finally block");
		}
	}
	
	public static void main(String[] args) {
		SystemExit exit = new SystemExit();
		exit.test();
	}

}
