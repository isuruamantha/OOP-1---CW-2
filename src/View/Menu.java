package View;

import java.util.Scanner;

import Model.FootballClub;
import Model.PremierLeagueManager;

public class Menu {

	//This is the initial display of the the program. It print the Football PremierLeague Logo
	public void intialDisplay() {
		System.out.println("");
		System.out
				.println("	 (                                 (                               (                              ");
		System.out
				.println("	 )\\ )           )   )      (  (    )\\ )                            )\\ )                           ");
		System.out
				.println("	(()/(        ( /(( /(    ) )\\ )\\  (()/((     (    )    (    (  (  (()/(   (    ) (  (    (    (   ");
		System.out
				.println("	 /(_))(   (  )\\())\\())( /(((_)(_)  /(_))(   ))\\  (     )\\  ))\\ )(  /(_)) ))\\( /( )\\))(  ))\\  ))\\  ");
		System.out
				.println("	(_))_|)\\  )\\(_))((_)\\ )(_))_  _   (_))(()\\ /((_) )\\  '((_)/((_)()\\(_))  /((_)(_))(_))\\ /((_)/((_) ");
		System.out
				.println("	| |_ ((_)((_) |_| |(_)(_)_| || |  | _ \\((_)_)) _((_))  (_)_))  ((_) |  (_))((_)_ (()(_)_))((_))   ");
		System.out
				.println("	| __/ _ \\ _ \\  _| '_ \\ _` | || |  |  _/ '_/ -_) '  \\() | / -_)| '_| |__/ -_) _` / _` || || / -_)  ");
		System.out
				.println("	|_| \\___\\___/\\__|_.__\\__,_|_||_|  |_| |_| \\___|_|_|_|  |_\\___||_| |____\\___\\__,_\\__, | \\_,_\\___|  ");
		System.out
				.println("	                                                                                |___/             ");
		System.out.println("");
		start();
	}

	//This is the starting method. All the options are inside this method
	public void start() {

		Scanner sc = new Scanner(System.in);
		System.out.println("	 ____ ____ ____ ____ ");
		System.out.println("	||M |||E |||N |||U ||");
		System.out.println("	||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.println("• Press 1 : Create a new football club");
		System.out.println("• Press 2 : Delete a football club");
		System.out.println("• Press 3 : Display the various statistics");
		System.out.println("• Press 4 : Display the premier league Table");
		System.out.println("• Press 5 : Display the calendar and the events");
		System.out.println("• Press 6 : Update Score");
		System.out.println("• Press 7 : Set match dates");
		System.out.println("• Press 8 : Exit");

		//Here i have used switch case to get the inputs from the user and then send it to the relenvant methods
		System.out.print("Enter your choice : ");
		String choice;
		choice = sc.next();
		switch (choice) {
		case "1":
			addFootballClub();
			break;
		case "2":
			deleteFootballClub();
			break;
		case "3":
			DisplayTheVariousStatistics();
			break;
		case "4":
			DisplayTheTimeTable();
			break;
		case "5":
			calenderAndEvents();
			break;
		case "6":
			updateScore();
			break;
		case "7":
			setMatchScore();
			break;
		case "8":
			exit();
			break;
		default:
			System.out.println("Invalid input! Please input again!");
			start();
		}

	}

	//This method for the adding the football object to the database and the arraylist
	public void addFootballClub() {
		Scanner sc1 = new Scanner(System.in);
		FootballClub football = new FootballClub("", "", 0, 0, 0, 0, 0, 0, 0);
		System.out.println("	 ____ ____ ____ _________ ____ _________ ____ ____ ____ ____ ");
		System.out.println("	||A |||d |||d |||       |||A |||       |||C |||L |||U |||B ||");
		System.out.println("	||__|||__|||__|||_______|||__|||_______|||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/_______\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.print("¤ Enter the name of the football club : ");
		String name = (sc1.nextLine());
		System.out.print("¤ Enter the location of the football club :");
		String location = (sc1.nextLine());

		//System.out.println("before passing : " + football);
		//IF the user wants to add more details about the club this will implemented
		System.out.println("¤ Do you want to add more details to the club? (Y/N)");
		String choices = sc1.nextLine();
		PremierLeagueManager club = new PremierLeagueManager();
		if (choices.equalsIgnoreCase("Y")) {
			System.out.print("• How many wins in the season? : ");
			int wins = sc1.nextInt();
			System.out.print("• How many draws in the season? : ");
			int draws = sc1.nextInt();
			System.out.print("• How many defeats in the season? : ");
			int defeats = sc1.nextInt();
			System.out.print("• How many goals received in the season? : ");
			int goalsReceived = sc1.nextInt();
			System.out.print("• How many goals scored in the season? : ");
			int defeatsScored = sc1.nextInt();
			System.out.print("• How many number of points currently has? : ");
			int points = sc1.nextInt();
			System.out.print("• How many matches played in the season? : ");
			int mathces = sc1.nextInt();
			//send the object and other details to the football class
			club.addTheClub(football, name, location, wins, draws, defeats, goalsReceived, defeatsScored, points,
					mathces);
			System.out.println("¤ Do you want to add again? (Y/N)");
			String choice1 = sc1.nextLine();
			String choice = sc1.nextLine();

			if (choice.equalsIgnoreCase("Y")) {
				addFootballClub();
			} else if (choice.equalsIgnoreCase("N")) {
				start();
			} else {
				System.out.println("Please enter a valid input!");
				start();
			}

			start();

		} else if (choices.equalsIgnoreCase("N")) {
			club.addTheClub(football, name, location);
			start();
		} else {
			System.err.print("Please input a valid character!");
			start();
		}
	}

	//this is for the deleteing the football object from the database and the arraylist. 
	public void deleteFootballClub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("	 ____ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ");
		System.out.println("	||D |||E |||L |||E |||T |||E |||       |||C |||L |||U |||B ||");
		System.out.println("	||__|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.println("¤ Available clubs :");
		PremierLeagueManager football = new PremierLeagueManager();
		football.showTheClubs();
		System.out.println("¤ Enter the name of the football club you want to delete : ");
		String name = sc.nextLine();
		PremierLeagueManager club = new PremierLeagueManager();
		boolean result = club.deleteClub(name);
		if (result == true) {
			System.out.println("Club is deleted succesfully!");
		} else {
			System.out.println("Club not found! Please input again");
		}

		System.out.println("¤ Do you want to delete again? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			deleteFootballClub();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}

	}

	//this is the method to add the various statistics about the club
	public void DisplayTheVariousStatistics() {
		System.out.println("	 ____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ");
		System.out.println("	||S |||T |||A |||T |||I |||S |||T |||I |||C |||S ||");
		System.out.println("	||__|||__|||__|||__|||__|||__|||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("¤ Available clubs :");
		PremierLeagueManager football = new PremierLeagueManager();
		football.showTheClubs();
		System.out.println("¤ Select the club that you want to display the statistics :");
		String name = sc.nextLine();
		football.showTheClubs(name);
		System.out.println("¤ Do you want to go again? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			DisplayTheVariousStatistics();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}
		sc.close();
	}

	//this method for the display the timetable of the league. All the available clubs details are shown in here. 
	public void DisplayTheTimeTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("	 ____ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ____ ");
		System.out.println("	||L |||E |||A |||G |||U |||E |||       |||T |||A |||B |||L |||E ||");
		System.out.println("	||__|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.println("¤ Below table display all the details about "
				+ "the teams in decending order according to their points.");
		PremierLeagueManager football = new PremierLeagueManager();
		football.displayPremierLeague();

		System.out.println("¤ Do you want to go again? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			DisplayTheTimeTable();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}
		sc.close();
	}

	//this is for the display the calendar. It will ask for the year, month and the date
	public void calenderAndEvents() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("	 ____ ____ ____ ____ ____ ____ ____ ____ _________ ____ _________ ____ ____ ____ ____ ____ ____ ");
		System.out
				.println("	||C |||A |||L |||E |||N |||D |||A |||R |||       |||& |||       |||E |||V |||E |||N |||T |||S ||");
		System.out
				.println("	||__|||__|||__|||__|||__|||__|||__|||__|||_______|||__|||_______|||__|||__|||__|||__|||__|||__||");
		System.out
				.println("	|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.print("¤ Please input the Year : ");
		String year = sc.nextLine();
		System.out.print("¤ Pease input the Month : ");
		MyCalendar sendData = new MyCalendar();
		String month = sc.nextLine();
		sendData.Calendar(month, year);
		System.out.print("¤ Please choose a date : ");
		String date = sc.nextLine();
		sendData.displayEvents(date);
		System.out.println("¤ Do you want to go again? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			calenderAndEvents();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}
	}

	//Yhis is for the update the score 
	public void updateScore() {
		System.out.println("	 ____ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ____ ");
		System.out.println("	||U |||P |||D |||A |||T |||E |||       |||S |||C |||O |||R |||E ||");
		System.out.println("	||__|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		PremierLeagueManager club = new PremierLeagueManager();
		club.showTheClubs();
		System.out.println("==================");
		System.out.print("¤ Please choose the club : ");
		String name = sc.nextLine();
		System.out.print("¤ Enter the score : ");
		int score = sc.nextInt();
		club.updateScore(name, score);

		//Check this lines 
		System.out.print("¤ Do you want to update the score again? (Y/N)");
		System.out.println(sc.nextLine());
		String choice = sc.nextLine();

		if (choice.equalsIgnoreCase("Y")) {
			updateScore();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}

	}

	//this is for the termination of the program
	public void exit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("	 ____ ____ ____ ____ ");
		System.out.println("	||E |||X |||I |||T ||");
		System.out.println("	||__|||__|||__|||__||");
		System.out.println("	|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.println("¤ Do you want to Exit? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			System.out.println("Program terminated!");
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}

		System.exit(0);
	}

	//this is for the set the match dates. It will ask for the 3 inputs
	private void setMatchScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ____ ____ ____ _________ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ____ ");
		System.out.println("||S |||e |||t |||       |||M |||a |||t |||c |||h |||       |||D |||a |||t |||e |||s ||");
		System.out.println("||__|||__|||__|||_______|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__|||__||");
		System.out
				.println("|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		System.out.println("");
		System.out.println("Available Clubs");
		PremierLeagueManager club = new PremierLeagueManager();
		club.showTheClubs();
		System.out.println("==================");
		System.out.print("Select the first club :");
		String club1 = sc.nextLine();
		System.out.print("Select the second club :");
		String club2 = sc.nextLine();
		System.out.print("Choose the shedulded date :");
		String date = sc.nextLine();
		System.out.printf("Result : %s vs %s", club1, club2);
		System.out.println("");
		System.out.println("¤ Do you want set again? (Y/N)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			setMatchScore();
		} else if (choice.equalsIgnoreCase("N")) {
			start();
		} else {
			System.out.println("Please enter a valid input!");
		}

	}

}
