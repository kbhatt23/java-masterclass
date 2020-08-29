package encapsulation;

public class BadPlayer {
	//if we change the varioble name all teh other users of this class will get compilation isues
	//public String playerName;
	public String name;
	public String weapon;
	public int health;
	
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
