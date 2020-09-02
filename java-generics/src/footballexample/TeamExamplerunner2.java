package footballexample;

public class TeamExamplerunner2 {
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
		
		barcelona.updateMatchFixtures(madrid, 3, 1);
		
		barcelona.printCurrentTotalPoints();
		madrid.printCurrentTotalPoints();

	}
}
