package edu.albany.csi405;

import java.util.ArrayList;
import java.util.List;

public class QualifyingRound extends Stage implements Winner{
	
	ArrayList<Team> wiinerofRound16 = new ArrayList<>();
	
	public QualifyingRound(ArrayList<Team> teams, int NumberOfTeam) {
		super(teams, NumberOfTeam);
		// TODO Auto-generated constructor stub
	}
	
	
	public void createGroups(int numberOfTeam){
		super.showGroups(numberOfTeam);
	}
	
	public void playQualifyingMatch(){
		int from = 0;
		int to = 2;
		for(int i = 1; i<9; i++){
			super.playGroupMatch(getTeams().subList(from, to));
			getWinnerofTheGroup(super.doSelectionSort(getTeams().subList(from, to)));
			from +=2 ;
			to += 2; 
		}
}
	private void getWinnerofTheGroup(List<Team> playGroupMatch) {
		// TODO Auto-generated method stub
		wiinerofRound16.add(playGroupMatch.get(1));
		for(Team t:playGroupMatch)
			System.out.println(t.toString());;
		
	}

	public ArrayList<Team> getWinner(){
		// TODO Auto-generated method stub
		return wiinerofRound16;
		
	}
	
}