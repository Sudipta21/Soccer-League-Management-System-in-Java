package edu.albany.csi405;
import java.util.*;
//import java.util.comparator;
/**
 * This classs helps to create a stage
 * add teams to the stage
 * return all information about the team
 * @author Sudipta
 *
 */

public class Stage extends MatchDriver {
	
	private ArrayList<Team> teams;    //ArrayList of the teams on a stage
	int numberOfTeam;
	MatchDriver play = new MatchDriver();
	
	String[] teamsName = {" FC_Barcelona ","FC Bayern München","Chelsea FC","SL Benfica",
			"Paris Saint-Germain","Juventus","FC Zenit","PSV Eindhoven","Real Madrid CF",
			"Atlético de Madrid","FC Porto","Arsenal FC","Manchester United FC",
			"Valencia CF","Bayer 04 Leverkusen","Manchester City FC","FC Shakhtar Donetsk",
			"Sevilla FC","Olympique Lyonnais", "FC Dynamo Kyiv","Olympiacos FC","PFC CSKA Moskva",
			"Galatasaray AŞ","AS Roma","FC BATE Borisov","B Mönchengladbach",
			"VfL Wolfsburg","GNK Dinamo Zagreb","Maccabi Tel-Aviv FC","KAA Gent","Malmö FF", 
			"FC Astana" };
	
	public Stage(int numberOfTeam){
		this.numberOfTeam = numberOfTeam;
		this.setTeams(new ArrayList<Team>(numberOfTeam));
	}
	
	public Stage(ArrayList<Team> teams, int numberOfTeam){
		this.numberOfTeam = numberOfTeam;
		this.setTeams(teams);
	}
	
	/**
	 * @return the teams
	 */
	public ArrayList<Team> getTeams() {
		return teams;
	}

	/**
	 * @param teams the teams to set
	 */
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	/**
	 * Adding a team to the arrayList
	 * @param team
	 */
	
	public void addTeam(Team team){
		this.teams.add(team);
	}
	
	/**
	 * 
	 * @param index
	 * @return the Team at the specific Index
	 */
	
	public Team getTeam(int index){
		return teams.get(index);
	}
	
	/**
	 * 
	 * @return the String of the team ArrayList
	 */
	
	public String getTeamsName() {
		return teams.toString();
	}
	
	public void showTeams(){
		for(String t:teamsName)
			System.out.printf("%5s%n",t);
	}
	
	/**
	 * Assigning team informations for the current stage of the league
	 * @param current Stage
	 * based on the team on current stage putting the information in the arraylist
	 * if this is not the 1st stage or group stage then 
	 * calling the reset team function of the Team class to assign all the variables 
	 * of the teams to 0
	 * 
	 */
	public void assignedTeamsName(Stage currentStage) {
		// TODO Auto-generated method stub
		if(currentStage.numberOfTeam==32){
			for(int i=0;i<numberOfTeam;i++){
				currentStage.addTeam(new Team(teamsName[i], 0,0,0,0,0,0,0,0));
			
			}
		}else{
			for(int i=0;i<currentStage.numberOfTeam;i++){
				currentStage.getTeam(i).resetTeam(currentStage.getTeam(i).getName());
				}
		}
		
	}
	
	/**
	 * 
	 * @param numberOfTeam
	 * @return
	 */
	public void showGroups(int numberOfTeam){
		if(numberOfTeam == 32){
			int k = 0;
			for(int i = 1; i<9; i++){
				System.out.println("Teams In Group:"+i);
				System.out.println("-----------------------");
				for(int j = 0;j<4;j++){
				System.out.printf("%5s%n",teams.get(k).getName());
				k++;
				}
			}
		}else{
			int k = 0;
			for(int i = 1; i<numberOfTeam/2; i++){
				System.out.println("Teams In Group:"+i);
				System.out.println("-----------------------");
				for(int j = 0;j<2;j++){
				System.out.printf("%5s%n",teams.get(k).getName());
				k++;
				}
		}
	}
	}
	
	public void playGroupMatch(List<Team> g){
		if(g.size()==4){
			System.out.println(g.size());
			for(int i = 0; i<g.size()-1; i++){
				for(int j = i;j<g.size()-1;j++){
					play.playMatch(g.get(i), g.get(j+1));
	
				}
			}
		}else{
				play.playMatch(g.get(0), g.get(1));
				play.playMatch(g.get(1), g.get(0));
		}
	
	}
	
	
	/**
	 * Using Selection Sort algorithm to get the winner of the group
	 * based on the points 
	 */
	public List<Team> doSelectionSort(List<Team> g){
		for(int i =0; i<g.size()-1;i++){
			int index = i;
			for(int j = i+1; j<g.size();j++){
				if(g.get(j).getPoints()<g.get(index).getPoints())
					index = j;
			}
			double smallerNumber = g.get(index).getPoints();
			g.get(index).setPoints(g.get(i).getPoints());
			g.get(i).setPoints(smallerNumber);
			
		}
		return g;
	}
	
	public void showWinner(ArrayList<Team> t){
		System.out.printf("       Name         Match Played   Match Win    Match Loses  "
				+ " Match Draw    Goal Scored    Goal Agains    Points%n"
				+ "*-----------------*-------------*------------*--------------*--------------*-------------*"
				+ "------------*-------------*%n");
		System.out.println(t.toString());
	}


	
	
	
	
}
