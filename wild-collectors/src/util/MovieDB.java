package util;

import java.util.Arrays;
import java.util.List;

public class MovieDB {

	public static List<Movie> findAllMovies(){
		List<String> m1Actors = Arrays.asList("ramchandra" , "sita", "lakshman","hanuman");
		Movie m1 = new Movie("ramayan 1", m1Actors, "narayan");
		
		List<String> m2Actors = Arrays.asList("ramchandra" , "sita", "bharat","hanuman");
		Movie m2 = new Movie("ramayan 2", m2Actors, "narayan");
		
		List<String> m3Actors = Arrays.asList("ramchandra" , "sita", "ravan","hanuman");
		Movie m3 = new Movie("ramayan 3", m3Actors, "narayan");
		
		List<String> m4Actors = Arrays.asList("amitabh" , "jaya", "veeru", "gabbar");
		Movie m4 = new Movie("sholay", m4Actors, "director 1");
		
		List<String> m5Actors = Arrays.asList("amitabh" , "rekha");
		Movie m5 = new Movie("saudagar", m5Actors, "director 2");
		
		List<String> m6Actors = Arrays.asList("thakur" , "comedy");
		Movie m6 = new Movie("angoor", m6Actors, "director 1");
		
		List<String> m7Actors = Arrays.asList("dheeraj" , "rakho" , "jaya", "veeru");
		Movie m7 = new Movie("king in the ring", m7Actors, "director 2");
		
		//List<String> m8Actors = Arrays.asList("ramchandra" );
		//Movie m8 = new Movie("rama", m8Actors, "narayan");
		
		return Arrays.asList(m1, m2, m3, m4, m5, m6, m7/* ,m8 */);
	}
}
