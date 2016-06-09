package com.example.InnerClass;

public class Outer {
	
	
	public String msg="I am Outer class Message";
	public Inner inner;
	public class Inner
	{
		public String msg="I am Inner class Message";
		
	}
	
	public void displyInnerClassMessage()
	{
		Inner inner = new Inner();
		System.out.println(inner.msg);
		
		
	}
	
	
	
	public void displyOuterClassMessage()
	{
		System.out.println(this.msg);
				
	}
	
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.displyInnerClassMessage();
		outer.displyOuterClassMessage();
		
	}
	
	
	
	
	

}
