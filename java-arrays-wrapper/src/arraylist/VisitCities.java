package arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class VisitCities {
	// not using linked list as we do not have to eiter remove/insert
	// for iteration best is arraylist
	private static List<String> cities = Arrays.asList("delhi", "mathura", "agra", "lucknow", "bhopal", "jabalpur",
			"mumbai", "goa", "chennai", "malainagar");

	public static void main(String[] args) {
		visitCitiesRoute("mathura", "chennai");
	}
	
	private static void visitCitiesRoute(String startCity, String endCity) {
		ListIterator<String> listIterator = cities.listIterator();
		boolean startCityfound= false;
		boolean tripComplete = false;
		while(listIterator.hasNext()) {
			if(tripComplete) {
				break;
			}
			String currentCity = listIterator.next();
			if(startCityfound) {
				System.out.println("Visiting city "+currentCity);
				if(endCity.equals(currentCity)) {
					listIterator.previous();
					while(listIterator.hasPrevious()) {
						String previous = listIterator.previous();
						System.out.println("Visiting city "+previous);
						if(previous.equals(startCity)) {
							tripComplete = true;
							break;
						}
					}
				}
			}
			if(currentCity.equals(startCity)) {
				System.out.println("visiting City "+ currentCity);
				startCityfound = true;
			}
		}
	}

}
