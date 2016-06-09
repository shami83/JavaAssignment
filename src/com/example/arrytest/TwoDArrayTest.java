package com.example.arrytest;

public class TwoDArrayTest {
	
	
	Integer[][] arr = new Integer[2][2];
	
	
	public void insertion()
	{
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				
				int res =i*j+1;
				arr[i][j]=res;
				
				System.out.println("value Inserted in cell arr["+i+"]["+j+"] is " + res);
			}
			
		}
	}
	
	
	public void traversal()
	{
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				
				int res =arr[i][j];
				
				
				System.out.println("value retrive from cell arr["+i+"]["+j+"] is " + res);
			}
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		TwoDArrayTest obj = new TwoDArrayTest();
		obj.insertion();
		System.out.println("GOING TO RETRIVE");
		obj.traversal();
		
	}
	
	
	

}
