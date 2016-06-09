package com.example.arrytest;

public class ReturnArrayFromMethod {
	
	public int[] reverse(int[] arr) {
		  int[] reverseArr = new int[arr.length];

		  for (int i = 0, j = reverseArr.length - 1; i < arr.length; i++, j--) {
			  reverseArr[j] = arr[i];
		  }
		  return reverseArr;
		}
	
	
	
	public void print(int[] arr)
	{
		 for (int i = 0;i <arr.length;i++) {
			  System.out.print(arr[i]+ " ");
		  }
		 
		 System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		ReturnArrayFromMethod obj =new ReturnArrayFromMethod();
		int[] arr={1,2,3,4};
		obj.print(arr);
		int[] res = obj.reverse(arr);
		obj.print(res);
		
	}

}
