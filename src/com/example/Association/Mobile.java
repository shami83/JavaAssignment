package com.example.Association;

public class Mobile {
	
	private String name="SamSung Galaxy";
	private String os="Android Lollypop";
	private int ram=1;
	
	
	public String getName() {
		return name;
	}
	public String getOs() {
		return os;
	}
	public int getRam() {
		return ram;
	}
	
	public void printSpecification()
	{
		
		System.out.println("Phone name "+ name);
		System.out.println("Phone OS "+ os);
		System.out.println("Phone RAM "+ ram + "GB");
		
	}
	
	
	
	
	
	

}
