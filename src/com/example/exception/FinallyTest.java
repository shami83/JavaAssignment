package com.example.exception;

public class FinallyTest {
	
	public void testFinally() throws ArithmeticException
	{
		try
		{
			System.out.println("In try block");
			int result = 1/0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("In Exception block");
			throw ex;
		}
		finally
		{
			System.out.println("In Finally block");
		}
	}
	
	public static void main(String[] args) {
		
		FinallyTest test=new FinallyTest();
		test.testFinally();
		
		
	}

}
