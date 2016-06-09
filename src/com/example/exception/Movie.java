package com.example.exception;

public class Movie {
	int age;
	public void watchMovie()
	{
		System.out.println("Movie is very good");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeValidationException {
		if (age <18)
		{
			throw new AgeValidationException("Age can not be less than 18 ,given ", age);
		}
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		try
		{
			Movie mv =new Movie();
			mv.setAge(11);
			mv.watchMovie();
			
		}
		catch(AgeValidationException ex)
		{
			ex.printMessage();
		}
		
	}
	

}
