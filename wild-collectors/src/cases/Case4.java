package cases;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import util.Movie;
import util.MovieDB;

public class Case4 {

	public static void main(String[] args) {
		 Collector<String, ?, Map<String, Long>> groupingBy = Collectors.groupingBy(Function.identity(), Collectors.counting());
		 
		 Collector<String, ?, Entry<String, Long>> collectingAndThen = Collectors.collectingAndThen(groupingBy, a -> {
			 return a.entrySet()
						.stream()
						.max(Entry.comparingByValue()
								).get();
		 });
		Map.Entry<String, Long> result = MovieDB.findAllMovies()
		.stream()
		.map(Movie::getActors)//list of list
		.flatMap(List::stream)//all added to same list -> duplicates allowed and hence no issues
		.collect(collectingAndThen); // name as key and value as count
		
		System.out.println("Actor with max movies is "+result.getKey()+" with movie count "+result.getValue());
	}

}
