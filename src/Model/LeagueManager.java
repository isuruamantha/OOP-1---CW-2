package Model;

/*
 * Interface only contains method name only. No method body. 
 * PremierLeagueManager class contains all the method body in the LeagueManager interface.
 */

public interface LeagueManager {
	public boolean deleteClub(String name);

	public void addTheClub(FootballClub club, String name, String location, int wins, int draws, int defeats,
			int goalsReceived, int defeatsScored, int points, int mathces);

	public void addTheClub(FootballClub club, String name, String location);

	public void showTheClubs();

	public void showTheClubs(String name);

	public void displayPremierLeague();

	public void updateScore(String name, int score);

}
