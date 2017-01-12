package edu.albany.csi405;


/**
 * This program focused on the front side of the league
 * it calculates how many teams play in each group
 * get the winner
 * take the winner of one group to the next stage
 * and finish at the final
 * as it is not possible to play a game here we used Math.random to select who is winning a match
 * 
 * @author Sudipta
 *
 */

public class LeagueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // creating an array of Teams Name, Including all teams of Champions League 2016
		 
		
		System.out.println("Welcome TO Champions League 2015-2016");
		System.out.println("Here are the Teams Of this Seasons");

		System.out.println("As a User here all one can do is predict who will win the match and check the result"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		
		GroupStage stage1 = new GroupStage(32);
		
		stage1.showTeams();
		
		System.out.println("HERE BEGINS THE GROUP ROUND");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		stage1.assignedTeamsName(stage1);
		ShowGroupTable(stage1);
		stage1.createGroups(stage1.numberOfTeam);
		stage1.playGroupMatch();
		
		ShowGroupTable(stage1);
		System.out.println("THE WINNER OF THE GROUP STAGE");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		stage1.showWinner(stage1.getWinner());
	
		
		System.out.println("HERE BEGINS THE ROUND of 16");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		QualifyingRound stage2 = new QualifyingRound(stage1.getWinner(), stage1.numberOfTeam/2);
		stage2.assignedTeamsName(stage2);
		stage2.createGroups(stage2.numberOfTeam);
		stage2.playQualifyingMatch();
		
		ShowGroupTable(stage2);
		
		System.out.println("THE WINNER OF THE ROUND OF 16");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		stage2.showWinner(stage2.getWinner());
		
		
		System.out.println("HERE BEGINS THE QuarterFinals");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		QuarterFinals stage3 = new QuarterFinals(stage2.getWinner(), stage2.numberOfTeam/2);
		stage3.assignedTeamsName(stage3);
		stage3.createGroups(stage3.numberOfTeam);
		stage3.playQuarterFinalMatch();
		
		ShowGroupTable(stage3);
		System.out.println("THE RESULTS OF THE QUARTER FINAL");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		stage3.showWinner(stage3.getWinner());
		
		System.out.println("HERE BEGINS THE SEMI FINAL");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		
		SemiFinal stage4 = new SemiFinal(stage3.getWinner(), stage3.numberOfTeam/2);
		stage4.assignedTeamsName(stage4);
		stage4.createGroups(stage4.numberOfTeam);
		stage4.playSemiFinal();
		
		ShowGroupTable(stage4);
		System.out.println("THE WINNER OF THE SEMI FINAL");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		stage4.showWinner(stage4.getWinner());
		
		System.out.println("HERE BEGINS THE FINAL");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		
		Final stage5 = new Final(stage4.getWinner(), stage4.numberOfTeam/2);
		stage5.assignedTeamsName(stage5);
		stage3.createGroups(stage5.numberOfTeam);
		stage5.playFinal();
		
		ShowGroupTable(stage5);
		System.out.println("THE CHAMPION THE FINAL");
		System.out.println("---------------------------------------------------------------------------"
				+ "\n-                                                                                -"
				+ "\n*                                                                                *"
				+ "\n-                                                                                -"
				+ "\n___________________________________________________________________________________");
		
		stage5.showWinner(stage5.getWinner());
		
	}

	
		
	
	
	public static void ShowGroupTable(Stage stageName){
		
		System.out.printf("       Name         Match Played   Match Win    Match Loses  "
				+ " Match Draw    Goal Scored    Goal Agains    Points%n"
				+ "*-----------------*-------------*------------*--------------*--------------*-------------*"
				+ "------------*-------------*%n");
		System.out.println(stageName.getTeamsName());
	}

}
