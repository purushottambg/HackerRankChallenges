package stream.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees;

        Employee youngestEmp = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .findFirst().get();

        System.out.println("Youngest Employee is: \n"+youngestEmp.toString());

        Map<String, String>youngestInAllDepartments = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparing(Employee::getAge)),
                                e->e.map(Employee::getName).orElse("NA")
                        )
                ));

        System.out.println("Youngest in all departments is:");
        for (Map.Entry<String, String> employeeEntry : youngestInAllDepartments.entrySet()){
            System.out.println(employeeEntry.getKey()+" "+employeeEntry.getValue());
        }
    }
}
