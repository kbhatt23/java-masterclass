package streamsenhancements;

import recordsindepth.Employee;
import recordsindepth.EmployeeMinMaxRunner;

import java.util.List;
import java.util.stream.Collectors;

public class MapMultiUsage {
    public static void main(String[] args) {
        List<Employee> allEmployees = EmployeeMinMaxRunner.findAllEmployees();

        findAllHobbiesUsingFlatMap(allEmployees);
        findAllHobbiesUsingMultiMap(allEmployees);

    }

    private static void findAllHobbiesUsingFlatMap(List<Employee> allEmployees) {
        List<String> allHobbies = allEmployees.stream()
                .flatMap(employee -> employee.hobbies().stream())
                .collect(Collectors.toList());

        System.out.println("findAllHobbiesUsingFlatMap.allHobbies: "+allHobbies);
    }

    private static void findAllHobbiesUsingMultiMap(List<Employee> allEmployees) {
        List<String> allHobbies = allEmployees.stream()
                        .<String>mapMulti((employee,consumer)->{
                            for(String hobby : employee.hobbies()){
                                consumer.accept(hobby);
                            }
                        }).collect(Collectors.toList());


        System.out.println("findAllHobbiesUsingMultiMap.allHobbies: "+allHobbies);
    }
}
