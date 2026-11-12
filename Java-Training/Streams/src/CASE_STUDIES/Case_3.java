package CASE_STUDIES;

//1.
//construct a list of employees where each employee represents following attributes.
//id,name,job,qualification,data_of_joining,salary,department
//now,
//	. find the top earning employees in each department . department wise

import javax.swing.plaf.TableHeaderUI;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public  class Case_3 {
    public static void main(String[] args) {
        List<Employee3> employee3List=fetchData();
        System.out.println("the top earning employees in each department . department wise");
      Map<String,List<Employee3>> groupedEmployee=employee3List
              .stream()
              .collect(Collectors.groupingBy(Employee3::getDepartment));

      groupedEmployee.entrySet()
              .stream()
              .forEach(entry->{
          Employee3 toEmployee=entry
                                .getValue().stream()
                                .max(Comparator.comparingDouble(Employee3::getSalary)).orElse(null);
                                 System.out.println(entry.getKey()+"->"+toEmployee);
              }
      );
      //Second Highest Salary in each department
        Map<String,List<Employee3>> emplist=employee3List
                .stream()
                .collect(Collectors.groupingBy(Employee3::getDepartment));
        emplist.entrySet().stream()
                .forEach(stringListEntry ->
        {
            Employee3 secHigh= (Employee3) stringListEntry.getValue()
                                                            .stream()
                                                            .sorted(Comparator.comparingDouble(Employee3::getSalary).reversed()).skip(1)
                                                            .findFirst().orElse(null);
                                                            System.out.println(stringListEntry.getKey()+"->"+secHigh);
        });
    }
    public static ArrayList<Employee3> fetchData()
    {
        ArrayList<Employee3> employees = new ArrayList<>();

                employees.add(new Employee3(101, "Rahul", "Software Engineer", "B.Tech", LocalDate.of(2021, 3, 15), 65000, "IT"));
                employees.add(new Employee3(102, "Priya", "Data Analyst", "M.Tech", LocalDate.of(2020, 7, 10), 75000, "Analytics"));
                employees.add(new Employee3(103, "Kiran", "HR Manager", "MBA", LocalDate.of(2018, 5, 20), 85000, "HR"));
                employees.add(new Employee3(104, "Sneha", "Java Developer", "B.Tech", LocalDate.of(2022, 1, 12), 55000, "IT"));
                employees.add(new Employee3(105, "Arjun", "Project Manager", "MBA", LocalDate.of(2017, 9, 5), 95000, "Management"));
                employees.add(new Employee3(106, "Divya", "QA Engineer", "B.Sc", LocalDate.of(2023, 4, 18), 45000, "Testing"));
                employees.add(new Employee3(107, "Vikram", "Senior Developer", "M.Tech", LocalDate.of(2016, 2, 25), 110000, "IT"));
                employees.add(new Employee3(108, "Anjali", "Business Analyst", "MBA", LocalDate.of(2019, 11, 8), 70000, "Analytics"));
                employees.add(new Employee3(109, "Suresh", "Accountant", "M.Com", LocalDate.of(2021, 6, 14), 50000, "Finance"));
                employees.add(new Employee3(110, "Meena", "Team Lead", "B.Tech", LocalDate.of(2015, 8, 22), 120000, "IT"));
                employees.add(new Employee3(111, "Ravi", "System Administrator", "BCA", LocalDate.of(2020, 3, 11), 60000, "IT"));
                employees.add(new Employee3(112, "Pooja", "Recruiter", "MBA", LocalDate.of(2022, 12, 1), 42000, "HR"));
                employees.add(new Employee3(113, "Ajay", "Data Scientist", "M.Tech", LocalDate.of(2018, 10, 17), 105000, "Analytics"));
                employees.add(new Employee3(114, "Keerthi", "UI Developer", "B.Tech", LocalDate.of(2023, 7, 3), 48000, "Development"));
                employees.add(new Employee3(115, "Manoj", "Finance Manager", "CA", LocalDate.of(2014, 4, 9), 130000, "Finance"));

                return employees;
            }
}

 class Employee3{
     private int id;
     private String name;
     private String job;
     private String qualification;
     private LocalDate data_of_joining;
     private double  salary;
     private String department;

     Employee3(int id,String name,String job,String qualification,LocalDate date_of_joining,double salary,String department)
     {
         this.id=id;
         this.data_of_joining=date_of_joining;
         this.department=department;
         this.job=job;
         this.name=name;
         this.qualification=qualification;
         this.salary=salary;

     }

     public void setName(String name)
     {
         this.name=name;
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

     public String getJob() {
         return job;
     }

     public void setJob(String job) {
         this.job = job;
     }

     public String getQualification() {
         return qualification;
     }

     public void setQualification(String qualification) {
         this.qualification = qualification;
     }

     public LocalDate getData_of_joining() {
         return data_of_joining;
     }

     public void setData_of_joining(LocalDate data_of_joining) {
         this.data_of_joining = data_of_joining;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public String getDepartment() {
         return department;
     }

     public void setDepartment(String department) {
         this.department = department;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", job='" + job + '\'' +
                 ", qualification='" + qualification + '\'' +
                 ", data_of_joining=" + data_of_joining +
                 ", salary=" + salary +
                 ", department='" + department + '\'' +
                 '}';
     }
 }
