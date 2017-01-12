package edu.albany.csi405;
/**
 * THE team class with all the variable of a team atributes
 * 
 * @author Sudipta
 *
 */
public class Team {
	private String name;          //team name
	private int matchPlayed;      //number of match played
	private int matchWin;         //number of match win
	private int matchDraw;        //number of match tied/draw
	private int matchLoses;       //number of match lose
	private int goalScored;       //number of goal scored in the tournament       
	private int goalAgainst;      //number of goal against in the tournament
	private double points;        //points of the team
	//private int possition;        //position in the tournament  
	
	/*
	 * the constructor with the argument
	 */
	public Team(String name, int matchPlayed, int matchWin, int matchDraw, int matchLoses,
			int goalScored, int goalAgainst, double points, int possition){
		this.name = name;
		this.matchPlayed = matchPlayed;
		this.matchWin = matchWin;
		this.matchDraw = matchDraw;
		this.matchLoses = matchLoses;
		this.goalScored = goalScored;
		this.goalAgainst = goalAgainst;
		this.points = points;
		//this.possition = possition;
				
		
	}
	
	//constructor without argument, with default value
	public Team(){
		this.name = "Team Unknown";
		this.matchPlayed = 0;
		this.matchWin = 0;
		this.matchDraw = 0;
		this.matchLoses = 0;
		this.goalScored = 0;
		this.goalAgainst = 0;
		this.points = 0;
		//this.possition = 0;
	}
	/**
	 * The method to reset a teams varialbes 
	 * @param name
	 */
	public void resetTeam(String name){
		this.name = name;
		this.matchPlayed = 0;
		this.matchWin = 0;
		this.matchDraw = 0;
		this.matchLoses = 0;
		this.goalScored = 0;
		this.goalAgainst = 0;
		this.points = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed += matchPlayed;
	}
	public int getMatchDraw() {
		return matchDraw;
	}
	public void setMatchDraw(int matchDraw) {
		this.matchDraw += matchDraw;
	}
	public int getMatchWin() {
		return matchWin;
	}
	public void setMatchWin(int matchWin) {
		this.matchWin += matchWin;
	}
	public int getMatchLoses() {
		return matchLoses;
	}
	public void setMatchLoses(int matchLoses) {
		this.matchLoses += matchLoses;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points += points;
	}
	public int getGoalScored() {
		return goalScored;
	}
	public void setGoalScored(int goalScored) {
		this.goalScored += goalScored;
	}
	public int getGoalAgainst() {
		return goalAgainst;
	}
	public void setGoalAgainst(int goalAgainst) {
		this.goalAgainst += goalAgainst;
	}
	/**
	 * @return returning a string of the Team class
	 * @override
	 */
	public String toString(){
		return String.format("%-20s %-15d %-15d %-13d %-12d %-12d %-12d %-12.2f %n", getName(), getMatchPlayed(),
				getMatchWin(), getMatchLoses(), getMatchDraw(), getGoalScored(), 
				getGoalAgainst(), getPoints());	

	}
}