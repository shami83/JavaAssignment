package com.example.interfaceTest;

public class Man implements Workable{

	public void work() {
		//Workable.work=10;
		System.out.println("Doing work for "+ Workable.work + " hrs");
		
	}
	
	
	public static void main(String[] args) {
		
		Man man = new Man();
		man.work();
		
	}

}
