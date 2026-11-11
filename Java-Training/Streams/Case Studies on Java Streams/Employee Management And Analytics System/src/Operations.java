import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        List<Employee> employeeList=EmployeeData.getEmployees();

        //1.Find employees whose salary is greater than ₹50,000	filter()
        System.out.println("1.Find employees whose salary is greater than ₹50,000\tfilter()");
        employeeList.stream().filter(employee -> employee.getSalary() > 50000).forEach(System.out::println);

        //	Get only employee names

        System.out.println("2.\tGet only employee names");
        List<String> names = employeeList.stream().map(employee -> employee.getName()).toList();
        names.forEach(System.out::println);

        // Convert employee names into uppercase
        System.out.println(" Convert employee names into uppercase");
        employeeList.stream().map(employee -> employee.getName().toUpperCase()).forEach(System.out::println);

        //	Find unique department names
        System.out.println("Find unique department names");
        employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);

        //Sort employees by salary
        System.out.println("Sort employees by salary");
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

        //	Sort employees by name
        System.out.println("\tSort employees by name");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        //	Display the first five employees
        System.out.println("\tDisplay the first five employees");

        employeeList.stream().limit(5).forEach(System.out::println);
        //	Skip the first three employees
        System.out.println("\tSkip the first three employees");
        employeeList.stream().skip(3).forEach(System.out::println);

        //	Display employee processing information
        System.out.println("\tDisplay employee processing information");
        employeeList.stream().peek().forEach(System.out::println);
    }

}
