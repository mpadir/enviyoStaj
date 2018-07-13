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

		Club club = new Club("BEÞÝKTAÞ");
		
		ClubManager clubManager = new ClubManager("Fikret", "Orman",2016, "ÝÞ ADAMI" );
		
		club.setClubManager(clubManager);
		
		ArrayList<Team> previousTeams = new ArrayList<Team>();
		previousTeams.add(new Team("Trabzon Spor Takýmý"));
		
        TeamManager teamManager = new TeamManager("Þenol", "Güneþ", 2015, previousTeams );
		
		
		HealthAsistant healthAsistant = new HealthAsistant("Mehmet", "Öz", "Stanford");
		club.setHealthAsistant(healthAsistant);
		
		GoalKeeper goalKeeper = new GoalKeeper("Tolga", "Zengin", 29, "Kaleci", 15, 25);
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		
		playerList.add(Player.createPlayer("Domagoj ", "Vida", 24, "Stoper"));
		playerList.add(Player.createPlayer("Matej ", "Mitrovic", 2, "Stoper" ));
		playerList.add(Player.createPlayer("Pepe ", "Pepe", 5, "Stoper" ));
		playerList.add(Player.createPlayer("Fatih ", "Aksoy", 14, "Stoper" ));
		playerList.add(Player.createPlayer("Adriano ", "Cuanca", 3, "Sol Bek" ));
		playerList.add(Player.createPlayer("Gökhan ", "Gönül", 77, "Sað Bek" ));
		playerList.add(Player.createPlayer("Gary ", "Medel", 12, "Önlibero" ));
		playerList.add(Player.createPlayer("Oguzhan ", "Özyakup", 10, "Merkez Orta Saha" ));
		playerList.add(Player.createPlayer("Ryan", "Babel", 8, "Sol Kanat" ));
		playerList.add(Player.createPlayer("Ricardo" , "Quaresma", 7, "Sað Kanat" ));
		playerList.add(Player.createPlayer("Álvaro " , "Negredo", 9, "Santrafor" ));
		playerList.add(Player.createPlayer("Jeremain " ,"Lens", 17, "Sað Kanat" ));
		playerList.add(Player.createPlayer("Mustafa ", "Pektemek", 11, "Santrafor" ));
		
		Team team = new Team("Beþiktaþ Futbol Takýmý", 1903, teamManager, playerList, goalKeeper); 
		
		club.addTeam(team);
		
		club.printClub();

	}

}
