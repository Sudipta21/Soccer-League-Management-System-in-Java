package edu.albany.csi405;

import java.util.ArrayList;
import java.util.List;

public class QuarterFinals extends Stage implements Winner{
ArrayList<Team> wiinerofQuarterFinals = new ArrayList<>();
	
	public QuarterFinals(ArrayList<Team> teams, int NumberOfTeam) {
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
	public void playQuarterFinalMatch(){
		int from = 0;
		int to = 2;
		for(int i = 1; i<5; i++){
			super.playGroupMatch(getTeams().subList(from, to));
			getWinnerofTheGroup(super.doSelectionSort(getTeams().subList(from, to)));
			from +=2 ;
			to += 2; 
		}
}
	private void getWinnerofTheGroup(List<Team> playGroupMatch) {
		// TODO Auto-generated method stub
		wiinerofQuarterFinals.add(playGroupMatch.get(1));
		for(Team t:playGroupMatch)
			System.out.println(t.toString());;
		
	}

	public ArrayList<Team> getWinner(){
		// TODO Auto-generated method stub
		return wiinerofQuarterFinals;
		
	}
}
