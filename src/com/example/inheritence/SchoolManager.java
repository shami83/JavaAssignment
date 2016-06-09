package com.example.inheritence;

public class SchoolManager {
	public static void main(String[] args) {
		
		ComuterizedScool sch = new ComuterizedScool();
		sch.setName("DPS");
		sch.setMedium("ENGLISH");
		sch.display();
		ManualSchool ms=new ManualSchool();
		ms.setName("RAMKRISHNA MISSION");
		ms.setMedium("BENGALI");
		ms.display();
	}

}
