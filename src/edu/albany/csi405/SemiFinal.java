package edu.albany.csi405;

import java.util.ArrayList;
import java.util.List;

public class SemiFinal extends Stage implements Winner{
ArrayList<Team> wiinerofSemiFinal = new ArrayList<>();
	
	public SemiFinal(ArrayList<Team> teams, int NumberOfTeam) {
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
	
	public void playSemiFinal(){
		int from = 0;
		int to = 2;
		for(int i = 1; i<3; i++){
			super.playGroupMatch(getTeams().subList(from, to));
			getWinnerofTheGroup(super.doSelectionSort(getTeams().subList(from, to)));
			from +=2 ;
			to += 2; 
		}
}
	private void getWinnerofTheGroup(List<Team> playGroupMatch) {
		// TODO Auto-generated method stub
		if(playGroupMatch.get(0).getPoints()==playGroupMatch.get(1).getPoints()){
			if(playGroupMatch.get(0).getGoalScored()>playGroupMatch.get(1).getGoalScored()){
				wiinerofSemiFinal.add(playGroupMatch.get(0));
			}else
				wiinerofSemiFinal.add(playGroupMatch.get(1));
		}else
			wiinerofSemiFinal.add(playGroupMatch.get(1));
		for(Team t:playGroupMatch)
			System.out.println(t.toString());
		
	}

	public ArrayList<Team> getWinner(){
		// TODO Auto-generated method stub
		return wiinerofSemiFinal;
		
	}
}