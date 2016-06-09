package com.example.arrytest;

public class PassArrayToMethod {
	
	public  void display(int[] array) {
		  for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i] + " ");
		  }
		}
	
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,5,8,11,14};
		PassArrayToMethod obj = new PassArrayToMethod();
		obj.display(arr);
		
	}

}
