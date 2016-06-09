package com.example.generics;

public class Adder<T extends Number> {
	
	
	public void add(T a, T b,AddOperation<T> addOp)
	{
		T result =addOp.add(a, b);
		System.out.println("Result is " + result);
	}
	
	
	public static void main(String[] args) {
		
		Adder<Integer> addInteger = new Adder<Integer>();
		
		addInteger.add(1, 2, new AddOperation<Integer>(){
			
			public  Integer add(Integer lhs, Integer rhs) {
				return lhs+rhs;
			}
			
			
		});
		
		
		
	Adder<Long> addLong = new Adder<Long>();
			
			addLong.add(5L, 6L, new AddOperation<Long>(){
				
				public  Long add(Long lhs, Long rhs) {
					return lhs+rhs;
				}
				
				
			});
			
	
			
			
			
		}
		

}
