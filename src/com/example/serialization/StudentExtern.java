package com.example.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentExtern implements Externalizable{
	
	private String name;
	private String subject;
	transient private String tutionDay;
	private int fee;
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
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		
		System.out.println("Call read External");
		this.name = (String)in.readObject();
		this.subject= (String)in.readObject();
		this.tutionDay = (String)in.readObject();
		this.fee = (Integer)in.readInt();
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Call Write External");
		out.writeObject(name);
		out.writeObject(subject);
		out.writeObject(tutionDay);
		out.writeInt(fee);
		
		
	}
	@Override
	public String toString() {
		return "StudentExtern [name=" + name + ", subject=" + subject
				+ ", fee=" + fee + "]";
	}
	
	
	
	
	
	

}
