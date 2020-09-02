package footballexample;
//one league can be one one type of player
//-> eg one league cna be only of football tema -> meaning a team comprises of football players only 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Player> {

	//T -> represe type of player in the team
	//teams array can hold team of only single type of player , like footbal player or cricketer etc
	private List<Team<T>> teams;
	private String name;

	public League(String name) {
		this.teams = new ArrayList<Team<T>>();
		this.name=name;
	}
	
	public void addTeam(Team<T> team) {
		if(teams.contains(team)) {
			System.err.println(team+" already contains in the league "+name);
		}else {
			System.out.println(team+" added to the league "+name);
			teams.add(team);
		}
	}
	
	public void printTeamCaptains() {
		for(Team<T> t : teams) {
				System.out.println("Captain of team "+t.getName()+" : "+t.captainName());
		}
	}
	
	public void showTable() {
		//we should not modify the existing teams list
		ArrayList<Team<T>> list = new ArrayList<Team<T>>(teams);
		Collections.sort(list);
		for(Team<T> t : list) {
			System.out.println("* "+t.getName());
		}
	}
	public void showTeams() {
		for(Team<T> t : teams) {
			System.out.println("* "+t.getName());
		}
	}
	
}
