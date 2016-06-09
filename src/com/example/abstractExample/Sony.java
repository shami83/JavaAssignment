package com.example.abstractExample;

public class Sony extends TvSpecification{
	
	
	@Override
	public void extraSpecification() {
		System.out.println("Full HD 1080");
		System.out.println("100 PMPO woofer with sorounding sound");
		System.out.println("3D Enabled");
	}

	@Override
	public void init() {
		this.setBrand("Sony");
		this.setLed("LED");
		this.setMode("Color");
		this.setSize(52);
		
	}

}
