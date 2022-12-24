package sets.exercices;
import java.util.Comparator;

public class PubDateDescComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int yearComparison = Integer.valueOf(o2.getYear()).compareTo(Integer.valueOf(o1.getYear()));
		
		if(yearComparison == 0) {
			return o2.getTitle().compareTo(o1.getTitle());
		}else {
			return yearComparison;
		}
		
	
	}
    
    
}