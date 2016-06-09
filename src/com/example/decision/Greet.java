package com.example.decision;

public class Greet {
	
	public void greetWorld(int time)
	{
		if(time>0 && time <12)
		{
			System.out.println("Good Morning");
		}
		else if(time>=12 && time <16)
		{
			System.out.println("Good Afternoon");
		}
		else if(time>=16 && time <18)
		{
			System.out.println("Good Evening");
		}
		else
		{
			System.out.println("Good Night");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Greet greet = new Greet();
		greet.greetWorld(17);
		
	}

}
