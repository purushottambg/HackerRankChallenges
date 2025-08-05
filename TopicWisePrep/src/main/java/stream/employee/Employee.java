package stream.employee;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private Long empId;
    private String name;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(Long empId, String name, Integer age, Double salary, String department){
        this.empId=empId;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }

    public Long getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return empId+ "  " + name + " " + age + " " + department + " " + salary;
    }

    public static List<Employee> employees = Arrays.asList(
            new Employee(101L, "Puru",      26, 85000.0, "Tech"),
            new Employee(102L, "Riya",      29, 72000.0, "HR"),
            new Employee(103L, "Aman",      24, 60000.0, "Tech"),
            new Employee(104L, "Sneha",     31, 98000.0, "Finance"),
            new Employee(105L, "Ravi",      28, 76000.0, "Tech"),
            new Employee(106L, "Neha",      23, 68000.0, "HR"),
            new Employee(107L, "Arjun",     30, 120000.0, "Tech"),
            new Employee(108L, "Kriti",     27, 83000.0, "Finance"),
            new Employee(109L, "Vikram",    33, 99000.0, "Tech"),
            new Employee(110L, "Divya",     25, 55000.0, "HR"),
            new Employee(111L, "Anuj",      26, 70000.0, "Marketing"),
            new Employee(112L, "Priya",     24, 59000.0, "Tech"),
            new Employee(113L, "Sarthak",   28, 75000.0, "Tech"),
            new Employee(114L, "Kavya",     29, 88000.0, "Finance"),
            new Employee(115L, "Rohit",     32, 91000.0, "Marketing"),
            new Employee(116L, "Meena",     27, 62000.0, "HR"),
            new Employee(117L, "Yash",      30, 99000.0, "Tech"),
            new Employee(118L, "Komal",     26, 64000.0, "Finance"),
            new Employee(119L, "Tarun",     31, 105000.0, "Tech"),
            new Employee(120L, "Swati",     22, 52000.0, "HR")
    );
}
