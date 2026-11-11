package CASE_STUDIES;

import java.util.*;
import java.util.stream.Collectors;

//question :-
/* Create a list of employees with fields like employee name, age, department . now
write a code snippet to group employees by using department name with the help of streams
Write a code snippet to group employees based on age
find eldest or oldest employee
find youngest employee */
public class Case_1 {
    static List<Employee> employees = List.of(
            new Employee("Bhanu", 22, "IT"),
            new Employee("Rahul", 25, "HR"),
            new Employee("Priya", 24, "Finance"),
            new Employee("Sneha", 28, "IT"),
            new Employee("Arjun", 30, "Marketing"),
            new Employee("Kiran", 26, "Finance"),
            new Employee("Divya", 23, "HR"),
            new Employee("Rohit", 32, "IT"),
            new Employee("Anjali", 27, "Marketing"),
            new Employee("Suresh", 35, "Sales"),
            new Employee("Pooja", 29, "IT"),
            new Employee("Vamsi", 21, "Sales"),
            new Employee("Naveen", 33, "Finance"),
            new Employee("Keerthi", 24, "Marketing"),
            new Employee("Manoj", 31, "HR")
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //write a code snippet to group employees by using department name with the help of streams
        System.out.println(" group employees by using department name with the help of streams");
       Map<String,List<Employee>> groupedList = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
       groupedList.forEach((department,list)->{
           System.out.println("\nDepartment :"+department);
           list.forEach(System.out::println);
       });
       //Write a code snippet to group employees based on age
        System.out.println(" group employees based on age");
        Map<Integer,List<Employee>> groupedByAgeList = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        groupedByAgeList.forEach((age,list)->
        {
            System.out.println("\nAge :"+age);
            list.forEach(System.out::println);
        });
        //find eldest or oldest employee
        System.out.println("eldest or oldest employee");
        Optional<Employee> older=employees.stream().max(Comparator.comparing(Employee::getAge));
        older.ifPresent(employee -> System.out.println("Oldest Employee:"+employee.toString()));

        //find youngest employee
        System.out.println("Youngest Employee");
        Optional<Employee> youngest=employees.stream().min(Comparator.comparing(Employee::getAge));
        youngest.ifPresent(employee -> System.out.println("Youngest Employee :"+employee));

    }
}

class Employee
{
    private String empName;
    private int age;
    private String department;

    public Employee(String empName, int age, String department) {
        this.empName = empName;
        this.age = age;
        this.department = department;
    };
    public Employee(){};
    public String getEmpName()
    {
        return this.empName;
    }
    public  int getAge()
    {
        return this.age;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public void setEmpName(String name)
    {
        this.empName=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public  void setDepartment(String department)
    {
        this.department=department;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}