package footballexample;

public class LeagueSimulator {

	public static void main(String[] args) {
		Team<FootballPlayer> barcelona = new Team<FootballPlayer>("barcelona");
		FootballPlayer messi =new FootballPlayer("messi");
		//as of now just adding captain
		barcelona.addPlayer(messi);
		
		Team<FootballPlayer> madrid = new Team<FootballPlayer>("madrid");
		FootballPlayer ramos =new FootballPlayer("ramos");
		HockeyPlayer p = new HockeyPlayer("sardar");
		//as of now just adding captain
		//barcelona.addPlayer(p);
		madrid.addPlayer(ramos);
		
		Team<FootballPlayer> sevilla = new Team<FootballPlayer>("sevilla");
		FootballPlayer navas =new FootballPlayer("navas");
		//as of now just adding captain
		sevilla.addPlayer(navas);
		
		Team<FootballPlayer> sociedad = new Team<FootballPlayer>("sociedad");
		FootballPlayer illarmendi =new FootballPlayer("illarmendi");
		//as of now just adding captain
		sociedad.addPlayer(illarmendi);
		
		//league creations
		League<FootballPlayer> laLiga = new League<FootballPlayer>("la-liga");
		//below wont work, dorced type
		//laLiga.addTeam(new Team<HockeyPlayer>("chennai"));
		laLiga.addTeam(barcelona);
		laLiga.addTeam(madrid);
		laLiga.addTeam(sevilla);
		laLiga.addTeam(sociedad);
		
		System.out.println("==========team captain=============");
		laLiga.printTeamCaptains();
		
		System.out.println("Simulating games");
		barcelona.updateMatchFixtures(madrid, 4, 2);
		barcelona.updateMatchFixtures(sevilla, 2, 1);
		barcelona.updateMatchFixtures(sociedad, 3, 2);
		
		madrid.updateMatchFixtures(sevilla, 2, 2);
		madrid.updateMatchFixtures(sociedad, 1, 2);

		sevilla.updateMatchFixtures(sociedad, 2, 3);
		
		
		System.out.println("Table all teams===============");
		laLiga.showTeams();
		
		System.out.println("Table all teams===============");
		
		laLiga.showTable();
		System.out.println("=======================");
		laLiga.showTeams();
		
	}
	
		
}
