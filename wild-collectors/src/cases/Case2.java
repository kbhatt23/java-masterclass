package cases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.Movie;
import util.MovieDB;
import java.lang.StringBuilder;;

public class Case2 {
	public static void main(String[] args) {
		List<Movie> filtereDMovie =  MovieDB.findAllMovies()
		.stream()
		.filter(a -> a.getActors().contains("hanuman"))
		.collect(ArrayList::new, List::add, List::addAll);
		
		filtereDMovie.forEach(System.out::println);
		
		//concat using custoim collectors
		System.out.println("============");
		 Set<String> uniqueActors = MovieDB.findAllMovies()
		.stream()
		.map(Movie::getActors)
		.flatMap(List::stream)
		.distinct()
		.collect(HashSet::new , Collection::add, Collection::addAll);
		System.out.println(uniqueActors);
		
		System.out.println("============");
		
		//joining using custom collector
		
		StringBuilder strBuilderJoined = MovieDB.findAllMovies()
					.stream()
					.map(Movie::getActors)
					.flatMap(List::stream)
					.distinct()
					.collect(StringBuilder::new, (str,a) -> str.append(",").append(a), StringBuilder::append)
					;
		System.out.println(strBuilderJoined.toString());
	}

}
