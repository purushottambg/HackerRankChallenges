package Tavant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String role;
    String fname;
    String lname;

    public Employee(String role, String fname, String lname) {
        this.role = role;
        this.fname = fname;
        this.lname = lname;
    }

    public String getName() {
        return fname;
    }

    public String getRole() {
        return role;
    }
}

public class Test {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Admin", "Rahul", "Gedam"),
                new Employee("Admin", "Purushottam", "Gutthe"),
                new Employee("Reader", "Pranav", "Pathare"),
                new Employee("Reader", "Abhishek", "Patil")
        );

        List<String> adminNames = employeeList.stream()
                .filter(n->n.getRole().equals("Admin"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        for (String name: adminNames){
            System.out.print(name+" ");
        }

    }
}
