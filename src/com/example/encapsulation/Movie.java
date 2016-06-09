package com.example.encapsulation;

public class Movie {
	
	private Integer age;
	
	
	public void watchMovie()
	{
		if(age.intValue()>18)
		{
			System.out.println("Watching Movie");
		}
		else
		{
			System.out.println("You are not permitted to Watch Movie");
		}
	}
	
	
	
	
	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		if(age==null)			
		{
			age=0;
		}
		this.age = age;
	}




	public static void main(String[] args) {
		
		Movie movie=new Movie();
		// intentionally I did not set the age
		movie.setAge(null);
		movie.watchMovie();
		
	}

}
