package com.enviyo.staj.team;

import java.util.ArrayList;

public class Team {
	
	String teamName;
	
	Integer establishmentYear;
	
	TeamManager teamManager;
	
	ArrayList<Player> players;
	
	GoalKeeper goalKeeper;
	
	public Team(String teamName, Integer establishmentYear, TeamManager teamManager,ArrayList<Player> players, GoalKeeper goalKeeper) {
		this.teamName = teamName;
		this.establishmentYear = establishmentYear;
		this.teamManager = teamManager;
		this.players = players;
		this.goalKeeper = goalKeeper;
	}
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public void printTeam() {
		System.out.println("---------------- TEAM -------------------");
		System.out.println("Team Name" + this.teamName);
		this.teamManager.printTeamManager();
		this.goalKeeper.printGoalKeeper();
		for (Player player : this.players) {
			player.printPlayer();
		}
	}		
}
