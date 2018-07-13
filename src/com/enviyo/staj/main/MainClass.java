package com.enviyo.staj.main;
import java.util.ArrayList;

import com.enviyo.staj.team.Club;
import com.enviyo.staj.team.ClubManager;
import com.enviyo.staj.team.GoalKeeper;
import com.enviyo.staj.team.HealthAsistant;
import com.enviyo.staj.team.Player;
import com.enviyo.staj.team.Team;
import com.enviyo.staj.team.TeamManager;

public class MainClass {
	
	// huseyincakmak6@gmail.com
	
	// Garbage Collector

	public static void main(String[] args) {

		Club club = new Club("BE��KTA�");
		
		ClubManager clubManager = new ClubManager("Fikret", "Orman",2016, "�� ADAMI" );
		
		club.setClubManager(clubManager);
		
		ArrayList<Team> previousTeams = new ArrayList<Team>();
		previousTeams.add(new Team("Trabzon Spor Tak�m�"));
		
        TeamManager teamManager = new TeamManager("�enol", "G�ne�", 2015, previousTeams );
		
		
		HealthAsistant healthAsistant = new HealthAsistant("Mehmet", "�z", "Stanford");
		club.setHealthAsistant(healthAsistant);
		
		GoalKeeper goalKeeper = new GoalKeeper("Tolga", "Zengin", 29, "Kaleci", 15, 25);
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		
		playerList.add(Player.createPlayer("Domagoj ", "Vida", 24, "Stoper"));
		playerList.add(Player.createPlayer("Matej ", "Mitrovic", 2, "Stoper" ));
		playerList.add(Player.createPlayer("Pepe ", "Pepe", 5, "Stoper" ));
		playerList.add(Player.createPlayer("Fatih ", "Aksoy", 14, "Stoper" ));
		playerList.add(Player.createPlayer("Adriano ", "Cuanca", 3, "Sol Bek" ));
		playerList.add(Player.createPlayer("G�khan ", "G�n�l", 77, "Sa� Bek" ));
		playerList.add(Player.createPlayer("Gary ", "Medel", 12, "�nlibero" ));
		playerList.add(Player.createPlayer("Oguzhan ", "�zyakup", 10, "Merkez Orta Saha" ));
		playerList.add(Player.createPlayer("Ryan", "Babel", 8, "Sol Kanat" ));
		playerList.add(Player.createPlayer("Ricardo" , "Quaresma", 7, "Sa� Kanat" ));
		playerList.add(Player.createPlayer("�lvaro " , "Negredo", 9, "Santrafor" ));
		playerList.add(Player.createPlayer("Jeremain " ,"Lens", 17, "Sa� Kanat" ));
		playerList.add(Player.createPlayer("Mustafa ", "Pektemek", 11, "Santrafor" ));
		
		Team team = new Team("Be�ikta� Futbol Tak�m�", 1903, teamManager, playerList, goalKeeper); 
		
		club.addTeam(team);
		
		club.printClub();

	}

}
