package com.example.InnerClass;

public abstract class Anonymous {
	
	public abstract void display();
	
	public static void main(String[] args) {
		
		Anonymous obj = new Anonymous(){
			
			@Override
			public void display()
			{
				System.out.println("Example of Anonymous class");
			}
			
		
			public void show()
			{
				System.out.println("show nevre called");
			}
			
			
			
		};
		
		obj.display();
		
	}
	

}
