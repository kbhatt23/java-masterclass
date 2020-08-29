package encapsulation;

public class BadPlayerUsage {
public static void main(String[] args) {
	BadPlayer badPlayer = new BadPlayer();
	//bad approiach
	badPlayer.health=100;
	badPlayer.name="kapela";
	badPlayer.hit(20);
	//coruption option
	badPlayer.health=100;
	badPlayer.hit(90);
	System.out.println(badPlayer.getHealthStatus());
}

}
