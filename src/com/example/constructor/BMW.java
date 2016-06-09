package com.example.constructor;

public class BMW {
	
	private String regNo;
	private String AC;
	
	
	public BMW()
	{
		
	}
	
	public BMW(String regNo)
	{
		this.regNo=regNo;
	}
	

	public BMW(String regNo,String AC)
	{
		this.regNo=regNo;
		this.AC=AC;
	}
	
	
	
	@Override
	public String toString() {
		return "BMW [regNo=" + regNo + ", AC=" + AC + "]";
	}

	public static void main(String[] args) {
		BMW bmw = new BMW();
		BMW bmw1 = new BMW("WB0345");
		BMW bmw2 = new BMW("WB0345","AC");
		System.out.println("call blank constructor" + bmw);
		System.out.println("call registration only constructor" + bmw1);
		System.out.println("call with full implement constructor" + bmw2);
		
	}

}
