package stream.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        System.out.println("We have the following list of the employees");
        for (Employee employee : Employee.employees){
            System.out.println(employee.toString());
        }


        System.out.println("Highest Paid");
         String highestPaid = Employee.employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                 .map(employee -> employee.getName()).orElse("Not any");

         System.out.println(highestPaid);



        System.out.println("Highest Paid in Every department");
        Map<String, String> highestInEveryDept = Employee.employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,                                         // Group by department
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),// Find max salary
                                empOpt -> empOpt.map(Employee::getName).orElse("N/A")       // Extract name
                        )
                ));
        for (Map.Entry<String, String> employee : highestInEveryDept.entrySet()){
            System.out.println(employee.toString());
        }

    }

}
