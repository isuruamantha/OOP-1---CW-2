package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Football class extends from the abstract sports club therefore you have to implement the all 
 * abstract methods inside the sports club 
 */

public class FootballClub extends SportsClub implements Serializable {

	@Override
	public String toString() {
		return "FootballClub [wins=" + wins + ", draws=" + draws + ", defeats=" + defeats + ", goalsReceived="
				+ goalsReceived + ", goalsScored=" + goalsScored + ", numberOfPoints=" + numberOfPoints
				+ ", numberOfPlayed=" + numberOfPlayed + ", nameOfTheClub=" + nameOfTheClub + ", location=" + location
				+ "]";
	}

	private int wins;
	private int draws;
	private int defeats;
	private int goalsReceived;
	private int goalsScored;
	private int numberOfPoints;
	private int numberOfPlayed;
	
	public FootballClub(){
		
	}

	public FootballClub(String nameOfTheClub, String location, int wins2, int draws2, int defeats2, int goalsReceived2,
			int defeatsScored, int points, int mathces) {
		this.nameOfTheClub = nameOfTheClub;
		this.location = location;
		this.wins = wins2;
		this.draws = draws2;
		this.defeats = goalsReceived2;
		this.goalsReceived = goalsReceived2;
		this.goalsScored = defeatsScored;
		this.numberOfPoints = points;
		this.numberOfPlayed = mathces;
	}

	public FootballClub(String name, String location) {
		this.nameOfTheClub = name;
		this.location = location;
	}
	
	@Override
	public int getWins() {
		return wins;
	}
	
	@Override
	public void setWins(int wins) {
		this.wins = wins;
	}
	
	@Override
	public int getDraws() {
		return draws;
	}

	@Override
	public void setDraws(int draws) {
		this.draws = draws;
	}

	@Override
	public int getDefeats() {
		return defeats;
	}

	@Override
	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	@Override
	public int getGoalsReceived() {
		return goalsReceived;
	}

	@Override
	public void setGoalsReceived(int goalsReceived) {
		this.goalsReceived = goalsReceived;
	}

	@Override
	public int getGoalsScored() {
		return goalsScored;
	}

	@Override
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	@Override
	public int getNumberOfPoints() {
		return numberOfPoints;
	}
	
	@Override
	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}
	
	@Override
	public int getNumberOfPlayed() {
		return numberOfPlayed;
	}

	@Override
	public void setNumberOfPlayed(int numberOfPlayed) {
		this.numberOfPlayed = numberOfPlayed;
	}

	@Override
	public String getNameOfTheClub() {
		return nameOfTheClub;
	}

	@Override
	public void setNameOfTheClub(String nameOfTheClub) {
		this.nameOfTheClub = nameOfTheClub;

	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;

	}
	
//this is for the compare purposes
	public class ClubComparator implements Comparator<FootballClub> {

		@Override
		public int compare(FootballClub obj1, FootballClub obj2) {
			return Integer.valueOf(obj1.numberOfPoints).compareTo(Integer.valueOf(obj2.numberOfPoints))  ;
		}
	}
	
	 void setArray(ArrayList<FootballClub> football){
		 for (FootballClub person : football) {
		        System.out.println(person.getNameOfTheClub());
		    }
		 Collections.sort(football,new ClubComparator());
		 for (FootballClub person : football) {
		        System.out.println(person.getNameOfTheClub());
		    }
	 }
}
