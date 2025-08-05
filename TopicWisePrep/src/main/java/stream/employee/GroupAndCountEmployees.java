package stream.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCountEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees;

        Map<String, Long> countGrouped = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.counting()));

        System.out.println("Here's the count:");
        for (Map.Entry<String, Long> gc : countGrouped.entrySet()){
            System.out.println(gc.getKey()+" "+gc.getValue());
        }
    }
}
