package Model;


import Database.DatabaseManager;
import View.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

/*
 * Implement a class PremierLeagueManager which extends interface LeagueManager. The
 PremierLeagueManager class maintains a number of football clubs which play in the pre-
 mier league. The class should create a menu based on text input and give the user the
 choice of:
 *
 */

public class PremierLeagueManager implements LeagueManager {

	static List<FootballClub> football = new ArrayList<FootballClub>();

	public void addTheClub(FootballClub club, String name, String location, int wins, int draws, int defeats,
			int goalsReceived, int defeatsScored, int points, int mathces) {
		club = new FootballClub(name, location, wins, draws, defeats, goalsReceived, defeatsScored, points, mathces);
		football.add(club);
	}

	public void addTheClub(FootballClub club, String name, String location) {
		club = new FootballClub(name, location);
		football.add(club);
		Serialize sendData = new Serialize();
		sendData.serialize(football);

	}


	public boolean deleteClub(String name) {
		for (int idx = 0; idx < football.size(); idx++) {
			if (football.get(idx).getNameOfTheClub().equals(name)) {
				football.remove(idx);
				return true;
			}
		}
		return false;
	}

	public void showTheClubs() {
		for (int idx = 0; idx < football.size(); idx++) {
			System.out.print(football.get(idx).getNameOfTheClub() + " | ");
		}
		System.out.println("");
	}

	public void showTheClubs(String name) {
		for (int idx = 0; idx < football.size(); idx++) {
			if (football.get(idx).getNameOfTheClub().equals(name)) {
				FootballClub index = football.get(idx);
				DisplayDetails send = new DisplayDetails();
				send.displayDetails(index);
			} else {
				System.out.println("Club not found!");
			}
		}

	}

	public void displayPremierLeague() {
		DisplayDetails send = new DisplayDetails();
		send.displayPremierLeagueTable(football);

	}

	public void updateScore(String name, int score) {
		for (int idx = 0; idx < football.size(); idx++) {
			if (football.get(idx).getNameOfTheClub().equals(name)) {
				FootballClub index = football.get(idx);
				//System.out.println(index.getGoalsScored());
				int currentGoals = index.getGoalsScored();
				index.setGoalsScored(currentGoals += score);
				//System.out.println( index.getGoalsScored());

			}
		}
	}
}
