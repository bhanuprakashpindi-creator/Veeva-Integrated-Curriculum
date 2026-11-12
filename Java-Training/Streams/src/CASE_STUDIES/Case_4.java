package CASE_STUDIES;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//2.you have a list of company objects and each company contains list of Employee objects ,
// the attributes of company are id,name,location,type(fi,soft) and the attributes of employee are id,name,job,salary.
//now
//	. find a flat list of all employee names across the companies.
public class Case_4 {

    public static void main(String[] args) {
        List<Company> companyList=fetchMock();

        List<String> names = companyList.stream().
                flatMap(company -> company.getEmployeeList().stream())
                .map(employees -> employees.getName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        //Q2. Find all employees whose salary is greater than ₹80,000 across all companies.

        System.out.println("Q2. Finding all employees whose salary is greater than ₹80,000 across all companies.");
        List<Employees> employees=companyList.stream().flatMap(company -> company.getEmployeeList().stream()).filter(employee -> employee.getSalary() >80000).toList();
        for (Employees employee : employees) {
            System.out.println(employee);
        }

        //Find all unique job roles across all companies
        System.out.println("Finding all unique job roles across all companies using");
        companyList.stream().flatMap(company -> company.getEmployeeList().stream()).map(employees1 -> employees1.getJob()).distinct().forEach(job->System.out.print(job+','));
        //find total count of employee in across all companies
        System.out.println();
        System.out.println("Total Employees in All Companies ->"+ companyList.stream().flatMap(company -> company.getEmployeeList().stream()).count());
        //Find employees whose names start with 'A' or 'S' across all companies.
        System.out.println("Find employees whose names start with 'A' or 'S' across all companies.");
        companyList.stream().flatMap(com-> com.getEmployeeList().stream()).filter(employees1 -> employees1.getName().startsWith("A") || employees1.getName().startsWith("S")).forEach(System.out::println);

    }




    public static List<Company> fetchMock() {

        return List.of(

                new Company(1, "Google", "Hyderabad", "Software",
                        List.of(
                                new Employees(101, "Rahul", "Java Developer", 75000),
                                new Employees(102, "Priya", "Software Engineer", 85000),
                                new Employees(103, "Kiran", "Data Analyst", 65000)
                        )
                ),

                new Company(2, "Microsoft", "Bangalore", "Software",
                        List.of(
                                new Employees(104, "Arjun", "Cloud Engineer", 90000),
                                new Employees(105, "Sneha", "UI Developer", 70000),
                                new Employees(106, "Vikram", "Team Lead", 110000)
                        )
                ),

                new Company(3, "Deloitte", "Chennai", "Finance",
                        List.of(
                                new Employees(107, "Anjali", "Accountant", 55000),
                                new Employees(108, "Manoj", "Financial Analyst", 80000),
                                new Employees(109, "Divya", "Auditor", 60000)
                        )
                ),

                new Company(4, "Amazon", "Hyderabad", "Software",
                        List.of(
                                new Employees(110, "Ravi", "Backend Developer", 95000),
                                new Employees(111, "Pooja", "QA Engineer", 65000),
                                new Employees(112, "Ajay", "DevOps Engineer", 88000)
                        )
                )
        );
    }

}









class Company
{
    private int id;
 private String  name;
 private String location;
 private String type;
 private  List<Employees> employeeList;

    public Company(int id, String name, String location, String type,List<Employees> employees) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.type = type;
        this.employeeList=employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Employees> getEmployeeList() {
        return employeeList;
    }
}
class Employees
{
    private  int id;
    private String name;
    private String job;
    private double salary;

    public Employees(int id, String name, String job, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
