package learning.map.adventurechallenge;

import java.util.HashMap;
import java.util.Map;

public class Location {

	private final int id;
	private final String name;
	//key will direction
	//value will be location
	private final Map<Character, Location> exitPaths;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Map<Character, Location> getExitPaths() {
		//location is not immutable so it can cause issue
		//on read person can modify the exitpaths
		return new HashMap<Character, Location>(exitPaths);
	}
	public Location(int id, String name) {
		this.id = id;
		this.name = name;
		this.exitPaths = new HashMap<Character, Location>();
		//all of them have Q as for 0the location to quit to lear java
	}
	
	public void addExitPath(Character direction , Location location) {
		this.exitPaths.put(direction , location);
	}
}
