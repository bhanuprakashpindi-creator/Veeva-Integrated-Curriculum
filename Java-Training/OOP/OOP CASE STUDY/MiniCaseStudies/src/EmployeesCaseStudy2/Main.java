package EmployeesCaseStudy2;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static TreeMap<Integer,Employee> employeeTreeMap=new TreeMap<>();
    public static void main(String[] args) {
        addMockData();
        int choice;
        do
        {
            System.out.println("Enter The Choice :");
            System.out.println("1.Add Employee " +
                    "\n2.Find Total Employees" +
                    "\n3.Display First Employee" +
                    "\n4.Display Last Employee" +
                    "\n5.EXIT");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    findEmplyeeCount();
                    break;
                case 3:
                    findFirstEmployee();
                    break;
                case 4:
                    findLastEmployee();
                    break;
                case  5:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.out.println("Enter Correct Option!!");
            }
        }
        while (choice!=5);

    }

    //   1. Find total number of employees at any stage.
    public static void findEmplyeeCount()
    {
        System.out.println("Employees Count: "+employeeTreeMap.size());
    }
    //2. Details of first employee
    public static void findFirstEmployee()
    {
        System.out.println(employeeTreeMap.firstEntry().getValue());
    }

    // 3. Details of last employee
    public static void findLastEmployee()
    {
        System.out.println(employeeTreeMap.lastEntry().getValue());
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
        employeeTreeMap.put(employee.getEmployeeId(),employee);
    }
    public static void addMockData() {
        employeeTreeMap.put(105, new Employee(105, "Ravi", 45000));
        employeeTreeMap.put(102, new Employee(102, "Bhanu", 65000));
        employeeTreeMap.put(110, new Employee(110, "Suresh", 35000));
        employeeTreeMap.put(101, new Employee(101, "Kumar", 85000));
        employeeTreeMap.put(108, new Employee(108, "Prakash", 55000));
        employeeTreeMap.put(104, new Employee(104, "Arjun", 75000));
        employeeTreeMap.put(107, new Employee(107, "Krishna", 45000));
        employeeTreeMap.put(103, new Employee(103, "Manoj", 95000));
        employeeTreeMap.put(109, new Employee(109, "Sai", 60000));
        employeeTreeMap.put(106, new Employee(106, "Teja", 40000));
    }


}


