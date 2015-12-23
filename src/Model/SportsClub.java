package Model;

import java.io.Serializable;

/*
 * The child class of the abstract sports club is Football club. 
 */
public abstract class SportsClub implements Serializable{

	String nameOfTheClub;
	String location;

	public abstract String getNameOfTheClub();

	public abstract void setNameOfTheClub(String nameOfTheClub);

	public abstract String getLocation();

	public abstract void setLocation(String location);

	public abstract int getWins();

	public abstract void setWins(int wins);

	public abstract int getDraws();

	public abstract void setDraws(int draws);

	public abstract int getDefeats();

	public abstract void setDefeats(int defeats);

	public abstract int getGoalsReceived();

	public abstract void setGoalsReceived(int goalsReceived);

	public abstract int getGoalsScored();

	public abstract void setGoalsScored(int goalsScored);

	public abstract int getNumberOfPoints();

	public abstract void setNumberOfPoints(int numberOfPoints);

	public abstract int getNumberOfPlayed();

	public abstract void setNumberOfPlayed(int numberOfPlayed);

}
