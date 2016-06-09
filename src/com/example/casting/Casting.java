package com.example.casting;

public class Casting {
	
	public static void main(String[] args) {
		
		Animal a = new Dog(); //Upcasting		
	     a.sound();	      
	      
	      Dog d = (Dog)a;//Downcasting
	      d.sound();
		
	}

}
