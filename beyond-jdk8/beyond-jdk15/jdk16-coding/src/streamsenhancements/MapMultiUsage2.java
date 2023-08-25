package streamsenhancements;

import recordsindepth.Employee;
import recordsindepth.EmployeeMinMaxRunner;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapMultiUsage2 {
    public static final Predicate<String> STARTS_WITH_C = s -> s.startsWith("c");
    public static void main(String[] args) {
        List<Employee> allEmployees = EmployeeMinMaxRunner.findAllEmployees();

        //find hobbies starting with c
        findASpecificHobbiesUsingFlatMap(allEmployees);
        findASpecificHobbiesUsingMapMulti(allEmployees);

    }

    //not possible to do using flatmap
    //as filter will be on employee and not hobbie
    private static void findASpecificHobbiesUsingFlatMap(List<Employee> allEmployees) {
        List<String> specificHobbies = allEmployees.stream()
                .flatMap(employee -> employee.hobbies().stream())
                //not possible
               // .filter(employee -> employee)
                .collect(Collectors.toList());

        System.out.println("findASpecificHobbiesUsingFlatMap.specificHobbies: "+specificHobbies);
    }

    private static void findASpecificHobbiesUsingMapMulti(List<Employee> allEmployees) {
        List<String> specificHobbies = allEmployees.stream()
                        .mapMulti(MapMultiUsage2 :: acceptSpecificHobbies)
                        .collect(Collectors.toList());


        System.out.println("findASpecificHobbiesUsingMapMulti.specificHobbies: "+specificHobbies);
    }

    private static void acceptSpecificHobbies(Employee employee , Consumer<String> consumer){
        for(String hobby : employee.hobbies()){
            if(STARTS_WITH_C.test(hobby))
                consumer.accept(hobby);
        }
    }
}


