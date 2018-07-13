package com.enviyo.staj.team;

public class ClubManager extends Member {

	private Integer startYear;
	
	private String occupation;
	
	public ClubManager(String name, String surname, Integer startYear, String occupation) {
		super(name,surname);
		this.startYear = startYear;
		this.occupation = occupation;
	}
	
	public void printManager() {
		System.out.println("----------------Club MANAGER -------------------");
		this.printMember();
		System.out.println("START YEAR: " + this.startYear);
		System.out.println("OCCUPATION: " + this.occupation);
	}
}
