package com.example.valuepass;

public class PassByRefrence {
	
	public void takeActionWithNoReturn(Refrence obj)
	{
		System.out.println("My message before assign is  " + obj.getMessage());
		
		 obj.setMessage("NOW this method  changed my value and i hold this value for long unless any one changed me");
		System.out.println("My message after assign is " + obj.getMessage());
		
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Refrence rObject = new Refrence();
		PassByRefrence ref = new PassByRefrence();
		ref.takeActionWithNoReturn(rObject);
		System.out.println("After method call " + rObject.getMessage());
		
		
	}

}
