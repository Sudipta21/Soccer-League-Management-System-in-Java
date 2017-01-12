package edu.albany.csi405;

import java.util.ArrayList;
import java.util.*;

//import java.util.ArrayList;

public class GroupStage extends Stage implements Winner{
	

	
	
	//ArrayList<ArrayList<Team>> group;
	ArrayList<Team> winnerOfGroupStage = new ArrayList<>();
	
	public GroupStage(int numberOfTeam) {
		super(numberOfTeam);
		// TODO Auto-generated constructor stub
	}
	
		
	public void createGroups(int numberOfTeam){
		super.showGroups(numberOfTeam);
	}
	
	public void playGroupMatch(){
		int from = 0;
		int to = 4;
		for(int i = 1; i<9; i++){
			super.playGroupMatch(getTeams().subList(from, to));
			getWinnerofTheGroup(super.doSelectionSort(getTeams().subList(from, to)));
			from += 4;
			to += 4; 
		}
		
		
	}

	private void getWinnerofTheGroup(List<Team> playGroupMatch) {
		// TODO Auto-generated method stub
		winnerOfGroupStage.add(playGroupMatch.get(2));
		winnerOfGroupStage.add(playGroupMatch.get(3));
		for(Team t:playGroupMatch)
			System.out.println(t.toString());;
		
	}

	public ArrayList<Team> getWinner(){
		// TODO Auto-generated method stub
		return winnerOfGroupStage;
		
	}

	
	
	
	
}

