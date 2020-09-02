package footballexample;

public class TeamExamplerunner {
	public static void main(String[] args) {

		Team barcelona = new Team("barcelona");
		Player messi = new Player("messi");
		Player pedri = new Player("pedri");
		barcelona.addPlayer(messi);
		// check for adding same player again by mistake
		// barcelona.addPlayer(messi);
		barcelona.addPlayer(pedri);

		// hockey team
		// how come hockey team gets added with football player
		// we can have enum proeprty and handle it using that
		// but that will be too much of coding
		// better we cna use generics
		Team chennaiSuperstars = new Team("chennaiSuperstars");
		chennaiSuperstars.addPlayer(messi);

		Team madrid = new Team("madrid");

	}
}
