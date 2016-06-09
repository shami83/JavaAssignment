package com.example.abstractExample;

public abstract class TvSpecification {

	private String brand;
	private String mode;
	private int size;
	private String led;

	public TvSpecification()
	{
		init();
	}
	
	public abstract void extraSpecification();
	public abstract void init();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLed() {
		return led;
	}

	public void setLed(String led) {
		this.led = led;
	}
	@Override
	public String toString() {
		return "TvSpecification [brand=" + brand + ", mode=" + mode + ", size="
				+ size + " inch , led=" + led + "]";
	}

	
	
	
	
}
