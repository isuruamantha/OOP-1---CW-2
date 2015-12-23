package View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.FootballClub;
import Model.PremierLeagueManager;

public class DisplayDetails extends PremierLeagueManager{
	public void displayDetails(FootballClub index){
		System.out.println("+------+-------+---------+----------------+--------------+--------+----------------+");
		System.out.println("| Wins | Draws | Defeats | Goals Received | Goals Scored | Points | Matched Played |");
		System.out.println("+------+-------+---------+----------------+--------------+--------+----------------+");
		System.out.println("| "+index.getWins()+"    | "+index.getDraws()+"     | "+index.getDefeats()+"  "
				+ "     | "+index.getGoalsReceived()+"              | "+index.getGoalsReceived()+""
						+ "            | "+index.getNumberOfPoints()+"      | "+index.getNumberOfPlayed()+"              |");
		System.out.println("+------+-------+---------+----------------+--------------+--------+----------------+");
	}
	
	public void displayPremierLeagueTable(List<FootballClub> football){
		
			String leftAlignFormat = "| %-15s | %-4d |%n";

			System.out.format("+-----------------+------+%n");
			System.out.format("| Club Name       |Points|%n");
			System.out.format("+-----------------+------+%n");
			for (int idx = 0; idx < football.size(); idx++) {
			    System.out.format(leftAlignFormat,  football.get(idx).getNameOfTheClub(), football.get(idx).getNumberOfPoints());
			}
			System.out.format("+-----------------+------+%n");
		}
	
	}


