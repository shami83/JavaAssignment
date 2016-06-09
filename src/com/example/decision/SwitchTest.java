package com.example.decision;

public class SwitchTest {
	
	public void greetWorld(int time)
	{
		
		
		
		if(time>0 && time <12)
		{
			time =0;
			
		}
		else if(time>=12 && time <16)
		{
			time =12;
					}
		else if(time>=16 && time <18)
		{
			time =16;
			
		}
		else
		{
			time =124;
			
			
		}
		
		// set time to 0,12,16,24 as case only support constant or literal
		switch(time)
		{
		case 0:
			System.out.println("Good Morning");
			break;
			
		case 12:
			System.out.println("Good Afternoon");
			break;
		case 16:
			System.out.println("Good Evening");
			break;
		default:
			System.out.println("Good Night");
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Greet greet = new Greet();
		greet.greetWorld(17);
		
	}

}

