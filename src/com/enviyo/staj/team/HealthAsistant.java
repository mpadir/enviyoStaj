package com.enviyo.staj.team;

public class HealthAsistant extends Member {
	
	String education;
	
	public HealthAsistant(String name, String surname, String education) {
		super(name,surname);
		this.education = education;
	}
	
	public void printHealthAsistant () {
		System.out.println("--------------------Health Asistant--------------");
		this.printMember();
		System.out.println("Education: " + education);
		
		
	}


}
