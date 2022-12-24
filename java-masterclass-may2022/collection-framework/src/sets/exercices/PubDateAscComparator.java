package sets.exercices;
import java.util.Comparator;

public class PubDateAscComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		int yearComparison = Integer.valueOf(o1.getYear()).compareTo(Integer.valueOf(o2.getYear()));
		
		if(yearComparison == 0) {
			return o1.getTitle().compareTo(o2.getTitle());
		}else {
			return yearComparison;
		}
		
	}
    
    
}