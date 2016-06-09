package com.example.overriding;

public class Soundmanager {
	
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		animal.makeSound();
		animal = new Girraf();
		animal.makeSound();
	}

}
