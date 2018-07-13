package com.enviyo.staj.team;

public class Member {

	private String name;
	
	private String surname;
	
	public Member(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	
	public void printMember() {
		System.out.println("AD: " + this.name);
		System.out.println("SOYAD: " + this.surname);
	}
	
}
