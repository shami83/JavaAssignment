package com.example.toString;

public class House {
	
	private String length="10X10 feet";
	private String color="Pink";
	private String furnished="Furnished";
	public String decoration="Well decorated with delux bed";
	
	
	//here override the toString method so it can print details
	@Override
	public String toString() {
		return "House [length=" + length + ", color=" + color + ", furnished="
				+ furnished + ", decoration=" + decoration + "]";
	}
	
	
	public static void main(String[] args) {
		
		House house = new House();
		System.out.println(house); //here we not call toString but System.out.println always call toString for you.
		
	}
	
	
	

}
