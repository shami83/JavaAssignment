package com.example.exception;

public class ExceptionTest {

	public int[] arr = {1,2};
	
	public void access(){
		
		try
		{
			System.out.println("Access a 3rd element that does not Exist");
			int result = arr[2];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
			e.printStackTrace();
		}

		
		
		
	}
	
	public static void main(String[] args) {
		
		ExceptionTest obj = new ExceptionTest();
		obj.access();
		
	}
	
	
}
