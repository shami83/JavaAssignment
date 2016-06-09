package com.example.constructor;

public class Car {
	
	
	private String registrationNumber;//required
	
	private String ac;//optional

	
	Car(String registrationNumber)
	{
		this.registrationNumber=registrationNumber;
		
	}
	
	
	
	
	public String getAc() {
		return ac;
	}




	public void setAc(String ac) {
		this.ac = ac;
	}
	
	




	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", ac=" + ac
				+ "]";
	}




	public static void main(String[] args) {
		
		//Car car = new Car(); can't do as no blank constructor is there
		Car car = new Car("WB0442323");
		car.setAc("AC");
		System.out.println(car);
	}
}
