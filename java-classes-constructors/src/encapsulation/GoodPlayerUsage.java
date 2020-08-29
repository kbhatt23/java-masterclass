package encapsulation;

public class GoodPlayerUsage {
public static void main(String[] args) {
	//GoodPlayer badPlayer = new GoodPlayer();
	//it forces to give mandaoty things , dev can not forget to set mandatory instance varibles
	
	//bad approach
	GoodPlayer badPlayer = new GoodPlayer("kapela","hockey", 120);
	//badPlayer.health=100;
	//badPlayer.name="kapela";
	badPlayer.hit(20);
	//coruption option -> not possible for us now  -> encaspuslation saves
	//badPlayer.health=100;
	badPlayer.hit(90);
	System.out.println(badPlayer.getHealthStatus());
}
}
