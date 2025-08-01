package stream.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryOfEachDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employees;

        Map<String, Double> averageSalaryData = employeeList.stream()
                .collect(
                        Collectors.groupingBy(n->n.getDepartment(), Collectors.averagingDouble(Employee::getSalary))
                );

        for (Map.Entry<String, Double> averages : averageSalaryData.entrySet()){
            System.out.println(averages.getKey()+" ->"+averages.getValue());
        }

    }
}
