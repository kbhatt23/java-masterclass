package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieGenreTest {

	public static void main(String[] args) {
		//can not call constructor using new keyword for enum as the constructor is private
		//MovieGenre fake = new MovieGenre();
		
		//java.lang.Enum class is super class for all Enum created
		//it implements serialzable and comaprable interface and hence is sortable
		
		List<MovieGenre> movieGenres = new ArrayList<>();
		//arraylist is ordered with indices
		//but since movieGenre is sortable with ordinal int value we can sort it
		
		movieGenres.add(MovieGenre.COMEDY);
		movieGenres.add(MovieGenre.ROMANTIC);
		movieGenres.add(MovieGenre.ACTION);
		movieGenres.add(MovieGenre.THRILLER);
		
		System.out.println("before sort "+movieGenres);
		movieGenres.sort(null);
		
		System.out.println("after sort "+movieGenres);
		
		//custom sort is needed
		movieGenres.sort(Comparator.comparing(MovieGenre::name)); //do not sort by ordinal but sort by string name
		
		System.out.println("after custom sort "+movieGenres);
		
		//not present and hence throws illegalargumentexception
		//System.out.println(MovieGenre.valueOf("fake"));
		
		System.out.println(MovieGenre.valueOf("COMEDY").ordinal());
		
		movieGenres.sort(Comparator.comparing(MovieGenre::cost));
		System.out.println("after cost sort "+movieGenres);
		
	}
}
