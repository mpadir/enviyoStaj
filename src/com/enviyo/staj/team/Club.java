package com.enviyo.staj.team;

import java.util.ArrayList;

public class Club extends Object {
	
	private String clubName;
	
	private ClubManager clubManager;
	
	private ArrayList<Team> teams;
 
    private HealthAsistant healthAsistant;

	
	public Club (String clubName) {
		this.clubName = clubName;
		this.teams = new ArrayList<Team>();
	}
	
	public void setClubManager(ClubManager clubManager) {
		this.clubManager = clubManager;
	}
	
	public ClubManager getClubManager() {
		return this.clubManager;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	

	public HealthAsistant getHealthAsistant() {
		return healthAsistant;
	}

	public void setHealthAsistant(HealthAsistant healthAsistant) {
		this.healthAsistant = healthAsistant;
	}

	
	public void printClub() {
		System.out.println("---------------- CLUP -------------------");
		System.out.println("CLUP NAME: " + this.clubName);
		this.clubManager.printManager();
		this.healthAsistant.printHealthAsistant();
		for (Team team : this.teams) {
			team.printTeam();
		}		
	}

	
	public void addTeam(Team team) {
		this.teams.add(team);
	}

}
