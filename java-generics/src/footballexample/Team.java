package footballexample;

import java.util.ArrayList;
import java.util.List;

//ading sorting feature using comparable -> T is already defined as player or player subtype  only
public class Team<T extends Player> implements Comparable<Team<T>> {

	public String getName() {
		return name;
	}

	private List<T> players;
	// instance variable have default 0 value for int
	private int winCount;
	private int loseCount;
	private int drawCount;
	private String name;

	public Team(String name) {
		this.name = name;
		players = new ArrayList<T>();
	}

	public void addPlayer(T player) {
		if (players.contains(player)) {
			System.err.println("player " + player.getName() + " already exist in team " + name);
		} else {
			System.out.println("player " + player.getName() + " added to team " + name);
			// it will be object how come this work without casting

			// players.add(player);
			players.add(player);
		}
	}

	@Override
	public String toString() {
		return "Team [players=" + players + ", winCount=" + winCount + ", loseCount=" + loseCount + ", drawCount="
				+ drawCount + ", name=" + name + "]";
	}

	// goals scored is goals scored by currnet team and conceed is goalscored by
	// opponent
	// cna not add these properties in instance level as every amthc will have own
	// instances
	// footablal player team can only be compare with another football player team
	public void updateMatchFixtures(Team<T> opponent, int goalsScored, int goalsConceded) {
		String msg;
		if (goalsScored > goalsConceded) {
			winCount++;
			msg = " won";
		} else if (goalsScored < goalsConceded) {
			msg = " lost";
			loseCount++;
		} else {
			msg = " drew";
			drawCount++;
		}
		// we also need to update oppnine count also
		// lets paass null as opponent so that we can break infinite loop of recursion
		if (opponent != null) {
			opponent.updateMatchFixtures(null, goalsConceded, goalsScored);
			System.out.println("Team " + this.name + msg + " against " + opponent.name);
		}
	}

	public void printCurrentTotalPoints() {
		System.out.println(this.name + " have " + totalPoints() + " points in table");
	}

	private int totalPoints() {
		return winCount * 3 + drawCount * 1;
	}

	@Override
	public int compareTo(Team<T> o) {
		if(o != null) {
			int compare = Integer.valueOf(totalPoints()).compareTo(Integer.valueOf(o.totalPoints()));
			if(compare == 0) {
				//if both have equal points then sort by name of team
				return name.compareTo(o.name);
			}else {
				return compare;
			}
			
			//return Integer.valueOf(o.totalPoints()).compareTo(Integer.valueOf(totalPoints()));
			
		}
		//we will display null object first, if put in a list
		return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//each name shud be differnet in each team

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String captainName() {
		return this.players.get(0).getName();
	}
}
