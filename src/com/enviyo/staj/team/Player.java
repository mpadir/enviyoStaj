package com.enviyo.staj.team;

public class Player extends Member {
	
	private Integer backNumber;
	private String position;
	

	public Player(String name, String surname, Integer backNumber, String position) {
		super(name, surname);
		this.backNumber = backNumber;
		this.position = position;
	}
	
	public void printPlayer() {
		System.out.println("---------------- Player -------------------");
		this.printMember();
		System.out.println("Back Number: " + backNumber);
		System.out.println("Position: " + position);
	}
	
	public static Player createPlayer(String name, String surname, Integer backNumber, String position) {
		return new Player( name,  surname,  backNumber,  position);
				
	}
}
