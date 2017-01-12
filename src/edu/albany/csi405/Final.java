package edu.albany.csi405;

import java.util.ArrayList;
import java.util.List;

public class Final extends Stage implements Winner{
ArrayList<Team> wiinerofFinal = new ArrayList<>();
	
	public Final(ArrayList<Team> teams, int NumberOfTeam) {
		super(teams, NumberOfTeam);
		// TODO Auto-generated constructor stub
	}
	
	
	public void createGroups(int numberOfTeam){
		super.showGroups(numberOfTeam);
	}
	/**
	 * dividing the arraylist to short list which is a group
	 * sending the list of the group to the playGroupMatch mehtod 
	 * and the sorting the list using the selection sort method 
	 */
	
	public void playFinal(){
		int from = 0;
		int to = 2;
		for(int i = 1; i<2; i++){
			super.playGroupMatch(getTeams().subList(from, to));
			getWinnerofTheGroup(super.doSelectionSort(getTeams().subList(from, to)));
			from +=2 ;
			to += 2; 
		}
}
	/**
	 * getting the winner of the this stage
	 * if the points are same it compare the goal socred in the match
	 * and whoever scored highest goal win the final
	 * @param playGroupMatch
	 */
	private void getWinnerofTheGroup(List<Team> playGroupMatch) {
		// TODO Auto-generated method stub
		if(playGroupMatch.get(0).getPoints()==playGroupMatch.get(1).getPoints()){
			if(playGroupMatch.get(0).getGoalScored()>playGroupMatch.get(1).getGoalScored()){
				wiinerofFinal.add(playGroupMatch.get(0));
			}else
				wiinerofFinal.add(playGroupMatch.get(1));
		}else
			wiinerofFinal.add(playGroupMatch.get(1));
		for(Team t:playGroupMatch)
			System.out.println(t.toString());;
		
	}

	public ArrayList<Team> getWinner(){
		// TODO Auto-generated method stub
		System.out.printf("The Winner of the Champions League 15-16 Season is %n %25s", wiinerofFinal.get(0));
		return wiinerofFinal;
		
	}
}
