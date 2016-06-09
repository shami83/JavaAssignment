package com.example.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	
	private String name;
	private String subject;
	transient private String tutionDay;
	private int fee;
	private String holyDay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTutionDay() {
		return tutionDay;
	}
	public void setTutionDay(String tutionDay) {
		this.tutionDay = tutionDay;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	

	public String getHolyDay() {
		return holyDay;
	}
	public void setHolyDay(String holyDay) {
		this.holyDay = holyDay;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject
				+ ", tutionDay=" + tutionDay + ", fee=" + fee + "]";
	}
	
	
	

}
