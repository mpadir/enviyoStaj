package com.enviyo.staj.team;

import java.util.ArrayList;

public class TeamManager extends Member  {
	
	private Integer startYear;
	
	public ArrayList<Team> previousTeams;
	
	public TeamManager(String name, String surname,Integer startYear, ArrayList<Team> previousTeams) {
		super(name,surname);
		this.startYear = startYear;
		this.previousTeams = previousTeams;
		
	}
	
	public void printTeamManager (){
		
		System.out.println("------------------Team Manager----------------");
		this.printMember();
		System.out.println("Start Year: " + this.startYear);
		System.out.println("Previseous Teams: " + this.previousTeams);
		
	}
	

}
