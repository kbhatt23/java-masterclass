package wronghashcodeandequals;

public class PlanetUSage {
public static void main(String[] args) {
	Planet planet = new Planet("moon");
	Moon moon = new Moon("moon");
	
	System.out.println(planet.equals(moon));
	//bad 
	System.out.println(moon.equals(planet));
}
}
