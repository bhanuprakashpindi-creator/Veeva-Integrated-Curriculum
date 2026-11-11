import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return List.of(
                new Employee(101, "Bhanu", "IT", 22, 45000, 2, 4.5),
                new Employee(102, "Rahul", "HR", 25, 35000, 3, 3.8),
                new Employee(103, "Priya", "IT", 24, 65000, 4, 4.8),
                new Employee(104, "Arjun", "Finance", 28, 55000, 6, 4.2),
                new Employee(105, "Sneha", "IT", 23, 40000, 2, 4.0),
                new Employee(106, "Kiran", "HR", 30, 70000, 8, 4.7),
                new Employee(107, "Ravi", "Finance", 26, 50000, 5, 3.9),
                new Employee(108, "Anjali", "IT", 27, 80000, 7, 4.9),
                new Employee(109, "Vijay", "Marketing", 29, 60000, 6, 4.1),
                new Employee(110, "Meena", "Marketing", 24, 38000, 2, 3.7),
                new Employee(111, "Raj", "IT", 31, 90000, 9, 4.6),
                new Employee(112, "Divya", "Finance", 25, 48000, 3, 4.3)
        );
    }
}