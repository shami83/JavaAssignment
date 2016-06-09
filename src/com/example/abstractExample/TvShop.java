package com.example.abstractExample;

public class TvShop {
	
	public static void main(String[] args) {
		
		
		TvSpecification obj = new Samsung();
		System.out.println(obj);
		obj.extraSpecification();
		System.out.println("*****************");
		
		 obj = new Sony();
		System.out.println(obj);
		obj.extraSpecification();
		
	}

}
