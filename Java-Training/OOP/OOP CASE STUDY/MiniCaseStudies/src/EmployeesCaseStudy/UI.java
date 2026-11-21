package EmployeesCaseStudy;


import java.util.*;
import java.util.stream.Collectors;

public class UI {
     static Scanner scanner = new Scanner(System.in);
    static Set<Employee> employeeSet=new TreeSet<>();
    public static void main(String[] args) {
        addMockData();
        int choice;
        do
        {
            System.out.println("Enter The Choice :");
            System.out.println("1.Add Employee " +
                    "\n2.Display Employees Based on Id Ascending" +
                    "\n3.Display Employees Based on Name Ascending" +
                    "\n4.Display Employees Based on Salary Ascending" +
                    "\n5.Display Employees Based on Salary Descending" +
                    "\n6.EXIT");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayIdASC();
                    break;
                case 3:
                    displayNameASC();
                    break;
                case 4:
                    displaySalaryASC();
                    break;
                case  5:
                    displaySalaryDSC();
                    break;
                case 6:
                    System.out.println("Thank You!!!");
                default:
                    System.out.println("Enter Correct Option!!");
            }
        }
        while (choice!=6);
    }

    public static void addEmployee()
    {
        System.out.println("Enter The Customer ID:");
        int id=scanner.nextInt();
        System.out.println("Enter the customer Name:");
        String name=scanner.nextLine();
        System.out.println("Enter The Salary:");
        double salary=scanner.nextDouble();
        Employee employee=new Employee(id,name,salary);
        employeeSet.add(employee);
    }
    public static void displayIdASC()
    {
        Set<Employee> idASC=employeeSet.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId)).collect(Collectors.toCollection(LinkedHashSet::new));
        idASC.forEach(System.out::println);
    }

    public static void displayNameASC()
    {
        Set<Employee> nameASC=employeeSet.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toCollection(LinkedHashSet::new));
        nameASC.forEach(System.out::println);
    }
    public static void displaySalaryASC()
    {
        employeeSet.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
    }

    public static void displaySalaryDSC()
    {
        employeeSet.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
    }
    public static void addMockData() {
        employeeSet.add(new Employee(101, "Ravi", 45000));
        employeeSet.add(new Employee(102, "Bhanu", 65000));
        employeeSet.add(new Employee(103, "Suresh", 35000));
        employeeSet.add(new Employee(104, "Kumar", 85000));
        employeeSet.add(new Employee(105, "Prakash", 55000));
        employeeSet.add(new Employee(106, "Arjun", 75000));
        employeeSet.add(new Employee(107, "Krishna", 45000));
        employeeSet.add(new Employee(108, "Manoj", 95000));
        employeeSet.add(new Employee(109, "Sai", 60000));
        employeeSet.add(new Employee(110, "Teja", 40000));
        employeeSet.add(new Employee(111, "Vijay", 85000));
        employeeSet.add(new Employee(112, "Surya", 70000));
        employeeSet.add(new Employee(113, "Ajay", 50000));
        employeeSet.add(new Employee(114, "Ramesh", 95000));
        employeeSet.add(new Employee(115, "Pavan", 30000));
    }
}
