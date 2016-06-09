package com.example.InnerClass;

public class MethodLocalClass {
	
	
	public void display()
	{
		
		final String prefix ="Hello Student This is : ";
		
		 class DisplayMessage{
			
			public void showMessage(String str)
			{
				System.out.println(prefix + str);
			}
		}
		 
		 DisplayMessage msg = new DisplayMessage();
		 msg.showMessage("Method Local inner Class");
		
		
	}
	
	public static void main(String[] args) {
		
		MethodLocalClass obj = new MethodLocalClass();
		obj.display();
		
	}

}
