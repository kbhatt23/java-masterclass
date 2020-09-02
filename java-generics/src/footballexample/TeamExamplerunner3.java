package footballexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamExamplerunner3 {
	public static void main(String[] args) {

		Team<FootballPlayer> barcelona = new Team<>("barcelona");
		FootballPlayer messi = new FootballPlayer("messi");
		FootballPlayer pedri = new FootballPlayer("pedri");
		barcelona.addPlayer(messi);
		// check for adding same player again by mistake
		// barcelona.addPlayer(messi);
		barcelona.addPlayer(pedri);
		
		//we can have any type of team player, can be string as of now
		//somehow we need to enforce the type of football player a team can handle
		//now it can have only player or child of player clas type only
		
		//Team<String> stringTeam  =new Team<String>("string");
		//stringTeam.addPlayer("madhav");

		// hockey team
		// how come hockey team gets added with football player
		// we can have enum proeprty and handle it using that
		// but that will be too much of coding
		// better we cna use generics
		Team<HockeyPlayer> chennaiSuperstars = new Team<>("chennaiSuperstars");
		HockeyPlayer sardar = new HockeyPlayer("sardar");
		//now tyope check by compiler exists
		//chennaiSuperstars.addPlayer(messi);
		//chennaiSuperstars.addPlayer(new Player("sardar"));
		chennaiSuperstars.addPlayer(sardar);
		
		//another false case ot handle
		//how ocme we are comparing / updating fixture with hcoky team
		//barcelona.updateMatchFixtures(chennaiSuperstars, 3, 1);
		
		Team<FootballPlayer> madrid = new Team<>("madrid");
		madrid.addPlayer(new FootballPlayer("ramos"));
		
		Team<FootballPlayer> sevilla = new Team<>("sevilla");
		sevilla.addPlayer(new FootballPlayer("jesus"));
		
		Team<FootballPlayer> sociedad = new Team<>("sociedad");
		sociedad.addPlayer(new FootballPlayer("oyarzabal"));
		
		barcelona.updateMatchFixtures(madrid, 3, 1);
		barcelona.updateMatchFixtures(sevilla, 5, 1);
		barcelona.updateMatchFixtures(sociedad, 1, 1);
		
		madrid.updateMatchFixtures(sevilla, 1, 2);
		madrid.updateMatchFixtures(sociedad, 1, 3);
		System.out.println("point table===========");
		barcelona.printCurrentTotalPoints();
		madrid.printCurrentTotalPoints();
		sevilla.printCurrentTotalPoints();
		sociedad.printCurrentTotalPoints();
		System.out.println("point table===========");
		
		System.out.println("Table list sorted=========");
		
		List<Team<FootballPlayer>> footballTeams = new ArrayList<Team<FootballPlayer>>();
		footballTeams.add(barcelona);
		footballTeams.add(madrid);
		footballTeams.add(sevilla);
		footballTeams.add(sociedad);
		footballTeams.add(new Team<FootballPlayer>("inter"));
		Collections.sort(footballTeams);
		//footballTeams.stream().sorted().forEach(System.out::println);
		footballTeams.stream().forEach(System.out::println);
		
		System.out.println("Table list sorted=========");

	}
}
