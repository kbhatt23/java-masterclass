package learning.map.adventurechallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameRunner {
	private static Scanner scanner = new Scanner(System.in);
	
	//same copy , never going to instansiate again
	//now convertintng to map for easy and fast acces -> otherwise to get any location it will o(N)
	
	//private static final List<Location> locations;
	private static final List<Location> locations;
	
	private static final Map<String, Character> vocabulary = new HashMap<String, Character>();
	static {
		locations= new ArrayList<Location>();
		Location home = new Location(0, "Home");
		//no need to add exit maps ->lets quit and just study
		locations.add(home);
		
		Location hill = new Location(2, "Hill");
		Location road = new Location(1, "Road");
		Location building = new Location(3, "Building");
		Location valley = new Location(4, "Valley");
		
		road.addExitPath('E', building);
		
		road.addExitPath('Q', home);
		hill.addExitPath('Q', home);
		building.addExitPath('Q', home);
		valley.addExitPath('Q', home);
		
		road.addExitPath('S', valley);
		building.addExitPath('E', road);
		
		valley.addExitPath('N', road);
		valley.addExitPath('E', hill);
		hill.addExitPath('W', road);
		locations.add(hill);locations.add(building);locations.add(road);locations.add(valley);
		
		vocabulary.put("NORTH", 'N');vocabulary.put("EAST", 'E');
		vocabulary.put("SOUTH", 'S');vocabulary.put("WEST", 'W');	
		vocabulary.put("QUIT", 'Q');
	}
	public static void main(String[] args) {
		
		//assuming default location is road
		boolean quit = false;
		Location location = locations.get(3);
		while(!quit) {
			//arraylist retains insertion order
			System.out.println("printing available options to travel:");
			Map<Character, Location> availableExitPaths = location.getExitPaths();
			for(Character direction: availableExitPaths.keySet()) {
				System.out.println("Enter "+direction+" to reach "+availableExitPaths.get(direction).getName());
			}
			String next = scanner.nextLine().toUpperCase();
			Character c =null;
			//more than one charachter
			if(next.length() > 1) {
				String[] words = next.split(" ");
				for(String word: words) {
					if(vocabulary.containsKey(word)) {
						c = vocabulary.get(word);
						break;
					}
				}
			}else {
				c = next.toCharArray()[0];
			}
			
			if(availableExitPaths.containsKey(c)) {
				location = availableExitPaths.get(c);
				if(location.getName().equals("Home")) {
					quit = true;
					System.out.println("Now Enjoy studying java");
				}
			}else {
				System.err.println("Please enter valid direction");
			}
			
		}
	}
	
	
	
	
}
