package interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

	private String name;
	public void setHealth(int health) {
		this.health = health;
	}

	private String weapon;
	private int health;
	public Player(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", weapon=" + weapon + ", health=" + health + "]";
	}

	@Override
	public List<String> save() {
		List<String> savedObject = new ArrayList<String>();
		savedObject.add(name);
		savedObject.add(weapon);
		savedObject.add(""+health);
		return savedObject;
	}

	@Override
	public void load(List<String> savedObject) {
		this.name = savedObject.get(0);
		this.weapon = savedObject.get(1);
		this.health = Integer.parseInt(savedObject.get(2));
	}
}
