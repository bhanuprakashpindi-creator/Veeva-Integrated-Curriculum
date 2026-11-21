import Exceptions.StudentNotFound;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static HashMap<Integer,Student> studentHashMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        // Load mock data
        main.loadMockData();
        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student By Name");
            System.out.println("3. Get Student By ID");
            System.out.println("4. Remove Student By ID");
            System.out.println("5. Check Student Exists");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");

            System.out.println("Enter Your Choice:");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        main.addStudent();
                        break;
                    case 2:
                        main.getByName();
                        break;
                    case 3:
                        main.getById();
                        break;
                    case 4:
                        main.removeById();
                        break;
                    case 5:
                        main.studentExists();
                        break;
                    case 6:
                        studentHashMap.forEach((id, student) ->
                                System.out.println(student));
                        break;
                    case 7:
                        System.out.println("Thank You!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid Choice! Try Again.");
                }

            } catch (StudentNotFound e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public void addStudent()
    {
        System.out.println("Enter The Student ID:");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter The Student Name:");
        String name=scanner.nextLine();
        if (name==null||name.trim().isEmpty())
        {
            System.out.println("Student Name Should Not Be Empty!!");
            return;
        }
        System.out.println("Enter The Marks:");
        int marks=scanner.nextInt();
        scanner.nextLine();
        if (marks<1 && marks >100)
        {
            System.out.println("Marks Should Be In the Range Of 1-100");
            return;
        }
        if (studentHashMap.containsKey(id))
        {
            Student student=studentHashMap.get(id);
            student.setMarks(marks);
            char grade=marks>=90?'A':marks >=80?'B':marks>=70?'C':marks>=60?'D':'F';
            student.setGrade(grade);
            studentHashMap.put(id,student);
            System.out.println("Student Updated Successfully!!!!");
            return;
        }
        Student student=new Student(id,name,marks);
        System.out.println("Student Addded Successfully!!!");
    }
    public void  getByName()
    {
        System.out.println("Enter The Name Of The Student:");
        String name=scanner.next();
        Map<Integer,Student> studentHashMap1 = studentHashMap.entrySet().stream().filter(entry-> entry.getValue().getStudentName().equalsIgnoreCase(name)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        if (studentHashMap1.isEmpty()) {
            throw new StudentNotFound("No Student Found With Name " + name);
        }
        studentHashMap1.entrySet().forEach(entry-> System.out.println(entry.getValue()));
    }
    public void  getById()
    {
        System.out.println("Enter The ID Of The Student:");
        int id=scanner.nextInt();
        scanner.nextLine();
        if (!studentHashMap.containsKey(id))
        {
            throw new StudentNotFound("No Student Record With Student ID "+id);
        }
        System.out.println("Student ID:"+id+"and Marks: "+studentHashMap.get(id).getMarks());
    }
    public void removeById() {
        System.out.println("Enter The ID Of The Student:");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (!studentHashMap.containsKey(id)) {
            throw new StudentNotFound("No Student Record With Student ID " + id);
        }
    studentHashMap.remove(id);
        System.out.println("Student Removed Successfully!!!");
    }
    public void studentExists()
    {
        System.out.println("Enter The ID Of The Student:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Student Exists in the Collection : "+studentHashMap.containsKey(id));
    }
    public void loadMockData() {
        studentHashMap.put(101, new Student(101, "Bhanu", 95));
        studentHashMap.put(102, new Student(102, "Ravi", 85));
        studentHashMap.put(103, new Student(103, "Kiran", 75));
        studentHashMap.put(104, new Student(104, "Sai", 65));
        studentHashMap.put(105, new Student(105, "Ram", 55));
        System.out.println("Mock Student Data Loaded Successfully!");
    }


}
