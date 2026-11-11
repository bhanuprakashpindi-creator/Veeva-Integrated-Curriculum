import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Case03 {
    static Scanner scanner = new Scanner(System.in);
    File file = new File("data/Student_Case03.txt");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Case03 case03=new Case03();
        int choice;
        do {
            System.out.println("\n======================================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Student Records");
            System.out.println("3. Search Student By RollNo");
            System.out.println("4. Search Student By Name");
            System.out.println("5. Update Student Record");
            System.out.println("6. Delete Student Record");
            System.out.println("7. Exit");
            System.out.println("======================================");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    case03.addRecord();
                    break;
                case 2:
                    case03.readAllRecords();
                    break;
                case 3:
                    case03.readRecordOnRollNo();
                    break;
                case 4:
                    case03.readRecordOnName();
                    break;
                case 5:
                    case03.updateStudent();
                    break;
                case 6:
                    case03.deleteStudent();
                    break;
                case 7:
                    System.out.println("Thank You! Exiting Application...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        while (choice != 7);
        scanner.close();
    }

    public void addRecord() throws IOException,ClassNotFoundException {

        System.out.println("Enter The RollNo Of The Student");
        String rollNo = scanner.next();
        System.out.println("Enter The Name Of The Student");
        String name = scanner.next();
        System.out.println("Enter The Age Of The Student");
        String age = scanner.next();
        System.out.println("Enter The Telugu Marks");
        String teluguMarks = scanner.next();
        System.out.println("Enter The Hindi Marks");
        String hindiMarks = scanner.next();
        System.out.println("Enter The English Marks");
        String englishMarks = scanner.next();
        System.out.println("Enter The Math Marks");
        String mathMarks = scanner.next();
        System.out.println("Enter The Science Marks");
        String scienceMarks = scanner.next();
        int total = Integer.parseInt(teluguMarks) + Integer.parseInt(hindiMarks) + Integer.parseInt(englishMarks) + Integer.parseInt(mathMarks) + Integer.parseInt(scienceMarks);
        String grade = total >= 450 ? "A" : total > 350 ? "B" : total > 300 ? "C" : total > 250 ? "D" : "F";
        Student student = new Student(name, rollNo, age, teluguMarks, hindiMarks, englishMarks, mathMarks, scienceMarks);
        if(!file.exists())
        {
            file.createNewFile();
        }
        if (file.length()==0) {
            file.createNewFile();
            ArrayList<Student> students=new ArrayList<>();
            students.add(student);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(students);
            System.out.println("Student Record Added SuccessFully!!");
            outputStream.close();
            return;
        }
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        ArrayList<Student> students=(ArrayList<Student>) objectInputStream.readObject();

        boolean exists=students.stream().anyMatch(student1 -> student1.rollNo.equalsIgnoreCase(rollNo));
        if (exists)
        {
            System.out.println("RollNo Already Exists!");
            return;
        }
        students.add(student);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(students);
        System.out.println("Student Record Added SuccessFully!!");
        outputStream.close();
        objectInputStream.close();

    }

    public void readAllRecords() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Student> students = (ArrayList<Student>) objectInputStream.readObject();
        for (Student student : students) {
            System.out.println(student.toString());
        }
        objectInputStream.close();
    }

    public void readRecordOnRollNo() throws IOException {
        System.out.println("Enter The RollNo Of The Student Record");
        String rollNo = scanner.next();
        boolean found=false;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<Student> students=(ArrayList<Student>) objectInputStream.readObject();
            for (Student student : students)
            {
                if(student.rollNo.equals(rollNo))
                {
                    System.out.println("Student Record Found!!");
                    System.out.println("");
                    System.out.println(student.toString());
                    found=true;
                    break;
                }
            }

            if(!found)
            {
                System.out.println("No Record Found!");
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void readRecordOnName() throws IOException{
        System.out.println("Enter The Name Of the Student");
        String name = scanner.next();
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<Student> students=(ArrayList<Student>) objectInputStream.readObject();
            students.stream().filter(student -> student.name.equalsIgnoreCase(name)).forEach(student -> {
                System.out.println(student.toString());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void deleteStudent()
    {
        System.out.println("Enter The RollNo Of The Student To  Delete");
        String rollNo=scanner.next();

        try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(file)))
        {
            ArrayList<Student> students=(ArrayList<Student>) objectInputStream.readObject();

           boolean deleted = students.removeIf(student -> student.rollNo.equalsIgnoreCase(rollNo));

           if (deleted)
           {
               System.out.println("Student Record Deleted SuccessFully!!");
           }
           else
           {
               System.out.println("No Student Record Found and Deleted!");
           }

           outputStream.writeObject(students);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public  void updateStudent()
    {
        System.out.println("Enter The RollNo Of The Student To  Update");
        String rollNo=scanner.next();
        System.out.println("Enter The Name Of The Student");
        String name = scanner.next();
        System.out.println("Enter The Age Of The Student");
        String age = scanner.next();
        System.out.println("Enter The Telugu Marks");
        String teluguMarks = scanner.next();
        System.out.println("Enter The Hindi Marks");
        String hindiMarks = scanner.next();
        System.out.println("Enter The English Marks");
        String englishMarks = scanner.next();
        System.out.println("Enter The Math Marks");
        String mathMarks = scanner.next();
        System.out.println("Enter The Science Marks");
        String scienceMarks = scanner.next();
        int total = Integer.parseInt(teluguMarks) + Integer.parseInt(hindiMarks) + Integer.parseInt(englishMarks) + Integer.parseInt(mathMarks) + Integer.parseInt(scienceMarks);
        String grade = total >= 450 ? "A" : total > 350 ? "B" : total > 300 ? "C" : total > 250 ? "D" : "F";
        Student updatedStudent = new Student(name, rollNo, age, teluguMarks, hindiMarks, englishMarks, mathMarks, scienceMarks);

        try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
            ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(file))) {
            ArrayList<Student> students = (ArrayList<Student>) objectInputStream.readObject();

            students.stream().filter(student -> student.rollNo.equalsIgnoreCase(rollNo)).forEach(student -> student=updatedStudent);
            outputStream.writeObject(students);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

 class Student implements Serializable
{
    String name;
    String rollNo;
    String age;
    String teluguMarks;
    String hindiMarks;
    String englishMarks;
    String mathMarks;
    String scienceMarks;
    int total;
    String grade;
    public Student()
    {

    }
    public Student(String name, String rollNo, String age, String teluguMarks, String hindiMarks, String englishMarks, String mathMarks, String scienceMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.teluguMarks = teluguMarks;
        this.hindiMarks = hindiMarks;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        int total = Integer.parseInt(teluguMarks) + Integer.parseInt(hindiMarks) + Integer.parseInt(englishMarks) + Integer.parseInt(mathMarks) + Integer.parseInt(scienceMarks);
        this.total=total;
        this.grade = total >= 450 ? "A" : total > 350 ? "B" : total > 300 ? "C" : total > 250 ? "D" : "F";
    }


    public void setName(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTeluguMarks() {
        return teluguMarks;
    }

    public void setTeluguMarks(String teluguMarks) {
        this.teluguMarks = teluguMarks;
    }

    public String getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(String hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public String getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(String englishMarks) {
        this.englishMarks = englishMarks;
    }

    public String getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(String mathMarks) {
        this.mathMarks = mathMarks;
    }

    public String getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(String scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getTotal() {
        return total;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age='" + age + '\'' +
                ", teluguMarks='" + teluguMarks + '\'' +
                ", hindiMarks='" + hindiMarks + '\'' +
                ", englishMarks='" + englishMarks + '\'' +
                ", mathMarks='" + mathMarks + '\'' +
                ", scienceMarks='" + scienceMarks + '\'' +
                ", total=" + total +
                ", grade='" + grade + '\'' +
                '}';
    }
}
