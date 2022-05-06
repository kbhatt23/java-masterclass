package cases;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import util.Movie;
import util.MovieDB;

public class Case1 {

	public static void main(String[] args) {
		//find actor name with max movies and its count
		MovieDB.findAllMovies()
				.stream()
				.map(Movie::getActors)//list of list
				.flatMap(List::stream)//all added to same list -> duplicates allowed and hence no issues
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // name as key and value as count
				//Map<String,Long>
				.entrySet()
				.stream()
				.max(Entry.comparingByValue())
				.ifPresent(entry -> System.out.println("Actor with max movies is "+entry.getKey()+" with movie count "+entry.getValue()));
				;
				
	//better approach is that there could be collison:
		Map<String, Long> actorCountMap = MovieDB.findAllMovies()
				.stream()
				.map(Movie::getActors)//list of list
				.flatMap(List::stream)//all added to same list -> duplicates allowed and hence no issues
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // name as key and value as count
				;
				
		//Map<String,Long>
		long maxMoviecount = actorCountMap
		.entrySet()
		.stream()
		.max(Entry.comparingByValue())
		.get()
		.getValue();
		;
		
		List<Entry<String, Long>> resultList = actorCountMap.entrySet()
				.stream()
				.filter(e -> e.getValue() == maxMoviecount)
				.collect(Collectors.toList());
		
		resultList.forEach(e -> System.out.println("actor with max movies "+e.getKey()+" with movie count "+maxMoviecount));
		
	}

}
