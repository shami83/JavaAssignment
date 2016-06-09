package com.example.exception;

public class MultipleCatch {
	
	public void test()
	{
		try
		{
			int result =1/0;
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("In Arithmetic Exception block");
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("In  Exception block");
			ex.printStackTrace();
		}
	}
	
	public void test(String str)
	{
		try
		{
			str.toLowerCase();
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("In Arithmetic Exception block");
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("In  Exception block");
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MultipleCatch obj = new MultipleCatch();
		obj.test();
		obj.test(null);
		
	}

}
