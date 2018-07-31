# Object Oriented Programming - Course Work 2

Your task is to create a Java program (NOT graphical but based on text input and text output)
which simulates the manipulation of a football championship.
Implement a class PremierLeagueManager which extends interface LeagueManager. The
PremierLeagueManager class maintains a number of football clubs which play in the premier
league.

The details for the implementation of the system are given in the steps below:
1. Design and implement classes SportsClub (abstract class), FootballClub. The classes
should include appropriate methods and hold information about the name of the club,
its location and various statistics about the club. FootballClub should include statistics
such as how many wins, draws and defeats an instance of it has achieved in the season,
and the number of goals received and scored. The number of points that a club currently
has, and the number of matches played should also be included.

2. Implement a class PremierLeagueManager which extends interface LeagueManager. The PremierLeagueManager class maintains a number of football clubs which play in the pre-
mier league. The class should create a menu based on text input and give the user the

choice of:

* Create a new football club and add it in the premier league.
* Delete (relegate) an existing football club from the premier league.
* Display the various statistics for a selected club.
* Display the Premier League Table, i.e. display all the teams playing in the premier
league and some of their statistics, in descending order, according to the points they
have. 

Thus, the club which has the maximum number of points should be displayed
first, the club being second in the league should be displayed next, etc. In the case
which two clubs have the same number of points the club with the best goal difference
should appear first.
• Add a played match with its score, so that the statistics of the two clubs involved
and the premier league table are updated automatically.
