package recordsindepth;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMinMaxRunner {
    public static final Comparator<Employee> COMPARING_BY_AGE = Comparator.comparing(Employee::age);


    public static void main(String[] args) {

        List<Employee> allEmployees = findAllEmployees();

        usingCustomClass(allEmployees);
        usingRecord(allEmployees);
    }

    private static void usingCustomClass(List<Employee> allEmployees) {
        SelfMinMax<Employee> employeeSelfMinMax =  allEmployees.stream()
                 .collect(Collectors.teeing(
                         Collectors.minBy(COMPARING_BY_AGE),
                         Collectors.maxBy(COMPARING_BY_AGE),
                                 (minOptional , maxOptional) -> new SelfMinMax<>(minOptional.orElse(null), maxOptional.orElse(null))
                                          )
                         );

        System.out.println(employeeSelfMinMax);
    }
    private static void usingRecord(List<Employee> allEmployees) {
        System.out.println("===========================================");
        MinMaxRecord<Employee> employeeSelfMinMax =  allEmployees.stream()
                .collect(Collectors.teeing(
                                Collectors.minBy(COMPARING_BY_AGE),
                                Collectors.maxBy(COMPARING_BY_AGE),
                                (minOptional , maxOptional) -> new MinMaxRecord<>(minOptional.orElse(null), maxOptional.orElse(null))
                        )
                );

        System.out.println(employeeSelfMinMax);
    }

    public static List<Employee> findAllEmployees(){
        return List.of(new Employee("kanishk", 32, List.of("football", "java")),
                new Employee("kaka", 42, List.of("football", "travelling")),
                new Employee("zidane", 50, List.of("football", "coaching", "fighting")),
                new Employee("jamal", 16, List.of("football", "music", "hairstyle")));

    }
}
