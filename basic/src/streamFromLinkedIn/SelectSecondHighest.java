package streamFromLinkedIn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
    Double salary;
    String name;

    public Employee(String name, Double salary){
        this.name=name;
        this.salary=salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name:"+name+" Salary:"+salary;
    }
}

public class SelectSecondHighest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aditi", 23400.45),
                new Employee("Shyamal", 4300.50),
                new Employee("Bhavan", 27400.34),
                new Employee("Mira", 22400.49),
                new Employee("Radha", 25400.56),
                new Employee("Shweta", 23420.21),
                new Employee("Purushottam", 83400.55)
        );

        Optional<Employee> secondHighest = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        if (secondHighest.isPresent()){
            System.out.println(secondHighest.get().toString());
        }

    }
}
