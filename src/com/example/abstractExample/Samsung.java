package com.example.abstractExample;

public class Samsung extends TvSpecification{

	
	
	
	
	@Override
	public void extraSpecification() {
		System.out.println("HDMI ready");
		System.out.println("100 PMPO woofer");
		
		
	}

	@Override
	public void init() {
		this.setBrand("SamSung");
		this.setLed("LCD");
		this.setMode("Color");
		this.setSize(44);
		
	}

}
