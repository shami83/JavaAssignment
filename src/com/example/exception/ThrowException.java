package com.example.exception;

public class ThrowException {
	
	public void test() throws ArithmeticException
	{
		int result=1/0;
		
	}
	
	public void test(String str) throws NullPointerException
	{
		
		try
		{
			str.toLowerCase();
			
		}
		catch(NullPointerException ex){
			
			throw ex;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ThrowException obj= new ThrowException();
		try
		{
			obj.test();
			
			
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			obj.test(null);
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		
	}

}
