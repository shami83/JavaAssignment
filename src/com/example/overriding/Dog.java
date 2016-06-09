package com.example.overriding;

public class Dog extends Animal{
	
	@Override
	public void makeSound()
	{
		System.out.println("Bark");
	}

}
