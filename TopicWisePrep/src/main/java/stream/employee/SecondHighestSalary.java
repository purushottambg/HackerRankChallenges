package stream.employee;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees;

        Employee secondHighestEarner = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().get();

        System.out.println("2nd highest earner:"+secondHighestEarner.toString());
    }
}
