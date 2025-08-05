package stream.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalInDepts {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees;

        Map<String, Double> averageSalsOfDepartments = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary))
                );
        System.out.println("Departments and average salaries:");
        for (Map.Entry<String, Double> mappedVals : averageSalsOfDepartments.entrySet()){
            System.out.println(mappedVals.getKey()+" "+mappedVals.getValue());
        }
    }
}
