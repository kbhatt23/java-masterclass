package recordsindepth;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PersonLocationMapRunner {
    public static void main(String[] args) {

        Map<PersonLocation, LocalDate> personLocationDateMap = new HashMap<>();

        personLocationDateMap.put(new PersonLocation(new Person("kaka",38), new Location("sao paulo", "brazil"))
        , LocalDate.of(1991,3,23)
        );

        personLocationDateMap.put(new PersonLocation(new Person("messi",34), new Location("los angeles", "usa"))
                , LocalDate.now()
        );

        LocalDate localDate = personLocationDateMap.get(new PersonLocation(new Person("messi", 34), new Location("los angeles", "usa")));
        System.out.println(localDate);
    }


}
