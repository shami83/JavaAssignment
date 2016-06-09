package com.example.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentCustom implements Serializable{	

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
		
		
		
		
		private void writeObject(ObjectOutputStream out) throws IOException {
			System.out.println("call custom write");
		    setTutionDay("MonDay");
		    out.writeObject(this.tutionDay);
		    out.defaultWriteObject();
		  }
		
		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
			System.out.println("call custom read");
			this.tutionDay= (String)in.readObject();
		    in.defaultReadObject();
		  }
		
		
		
		
		
		
		@Override
		public String toString() {
			return "StudentCustom [name=" + name + ", subject=" + subject
					+ ", tutionDay=" + tutionDay + ", fee=" + fee + "]";
		}
		
		
		

	


}
