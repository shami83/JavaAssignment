package com.example.Association;

public class Person {
	
	private String name="Shamik";
	private Mobile mobile;

	public String getName() {
		return name;
	}
	
	
	
	public Mobile getMobile() {
		return mobile;
	}



	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}



	public static void main(String[] args) {
		
		
		Mobile mobileAssociation = new Mobile();
		Person person=new Person();
		
		//Associate Mobile object with person. actually person's mobile property now points to 
		//mobileAssociation object
		
		person.setMobile(mobileAssociation);
		
		System.out.println(person.getName() + " HAS A Mobile and it's specifiaction is");
		person.getMobile().printSpecification();//call mobile;s print specification from person class
		
		
		
		
		
	}
	
	
	

}
