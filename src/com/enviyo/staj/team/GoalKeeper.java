package com.enviyo.staj.team;

public class GoalKeeper extends Player {

	private Integer eatenGoals;
	private Integer savedGoals;
	
	public GoalKeeper(String name, String surname, Integer backNumber, String position, Integer eatenGoals, Integer savadGoals) {
		super(name,surname,backNumber,position);
		this.eatenGoals = eatenGoals;
		this.savedGoals = savadGoals;
	}
	
	public void printGoalKeeper() {
		System.out.println("---------------- Goal Keeper -------------------");
		this.printPlayer();
		System.out.println("Eaten Goals: " + eatenGoals);
		System.out.println("Saved Goals: " + savedGoals);
		
	}
	
}
