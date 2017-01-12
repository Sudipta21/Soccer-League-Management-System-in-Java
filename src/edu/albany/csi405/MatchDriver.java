package edu.albany.csi405;
import java.lang.Math;
import java.util.List;
/**
 * 
 * playMatch Method taking 2 teams as a input
 * creating two int variables that used random method to get random number between
 * 0 and 5, based on that we decide who is wining and who is losing the match
 * once we have that then we calculate the point based on the result of that match
 * 
 * @author Sudipta
 *
 */

public class MatchDriver {

public void playMatch(Team t1, Team t2){
		
		int t1Scored = (int)(Math.random()*5)+0;
		int t2Scored = (int)(Math.random()*5)+0;
		
		if(t1Scored > t2Scored){
			t1.setGoalScored(t1Scored);
			t1.setGoalAgainst(t2Scored);
			t1.setMatchPlayed(1);
			t1.setMatchDraw(0);
			t1.setMatchLoses(0);
			t1.setMatchWin(1);
			t1.setPoints(3);
			t2.setGoalScored(t2Scored);
			t2.setGoalAgainst(t1Scored);
			t2.setMatchPlayed(1);
			t2.setMatchDraw(0);
			t2.setMatchLoses(1);
			t2.setMatchWin(0);
			t2.setPoints(0);
			
		}
		else if(t1Scored < t2Scored){
			t2.setGoalScored(t2Scored);
			t2.setGoalAgainst(t1Scored);
			t2.setMatchPlayed(1);
			t2.setMatchDraw(0);
			t2.setMatchLoses(0);
			t2.setMatchWin(1);
			t2.setPoints(3);
			t1.setGoalScored(t1Scored);
			t1.setGoalAgainst(t2Scored);
			t1.setMatchPlayed(1);
			t1.setMatchDraw(0);
			t1.setMatchLoses(1);
			t1.setMatchWin(0);
			t1.setPoints(0);
		}
		else{
			t2.setGoalScored(t2Scored);
			t2.setGoalAgainst(t1Scored);
			t2.setMatchPlayed(1);
			t2.setMatchDraw(1);
			t2.setMatchLoses(0);
			t2.setMatchWin(0);
			t2.setPoints(1.5);
			t1.setGoalScored(t1Scored);
			t1.setGoalAgainst(t2Scored);
			t1.setMatchPlayed(1);
			t1.setMatchDraw(1);
			t1.setMatchLoses(0);
			t1.setMatchWin(0);
			t1.setPoints(1.5);
		}
			
		showResult(t1, t2,t1Scored, t2Scored);
	}
	
	
	
	private void showResult(Team t1, Team t2, int t1Scored, int t2Scored) {
		// TODO Auto-generated method stub
		System.out.printf("------------------------------------------%n"
				+ "The Match Played Between:%n %25s vs %-15s %n Goal Scored"
				+ ": %5d %15d %n Pts in the lg: %-10.2f %10.2f %n", t1.getName(), t2.getName(), t1Scored, 
				t2Scored, t1.getPoints(), t2.getPoints());
		
				
	}



	public int compareTo(List<Team> g) {
		// TODO Auto-generated method stub
		return 0;
	}
}
