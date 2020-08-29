package encapsulation;

public class GoodPlayer {
	//if we change the varioble name all teh other users of this class will get compilation isues
	//public String playerName;
	private String name;
	private String weapon;
	private int health;
	
	//constructor forces to put andaory things
	//hence we can check if data is not presented as wrong conetne -> data corruption can be saved
	public GoodPlayer(String name, String weapon, int health) {
		//basic validation -> saves data courruption
		if(weapon  == null || weapon.length() == 0 || name == null || name.length() == 0 || health <=0) {
			throw new RuntimeException("Can not pass wrong data for player");
		}
		this.name = name;
		this.weapon = weapon;
		if(health > 100 ) {
			health = 100;
		}
		this.health = health;
	}
	
	public String getHealthStatus() {
		return name + " have current status "+this.health;
	}
	
	public void hit(int damage) {
		this.health -= damage;
		if(health <= 0) {
			System.out.println(name+" got knocked out");
		}
		
	}
}
