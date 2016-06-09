package com.example.InnerClass;

public class AnonymousClassAsArgument {
	
	
	public void diaplayMsg(Message obj)
	{
		System.out.println(obj.msg());
	}
	
	
	public static void main(String[] args) {
		
		AnonymousClassAsArgument object = new AnonymousClassAsArgument();
		
		object.diaplayMsg(new Message(){

			
			public String msg() {
				
				return "I am an AnonymousClass pass as a argument";
			}
			
		}
		
		);
		
	}

}
