import javax.xml.namespace.QName;
import java.io.*;
import java.util.Scanner;

public class Case02 {
    static Scanner scanner = new Scanner(System.in);
    File file = new File("data/Student_Case02.txt");

    public static void main(String[] args) throws IOException {
        Case02 case02=new Case02();
        int choice;
        do
        {
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
            switch (choice)
            {
                case 1:
                    case02.addRecord();
                    break;
                    case 2:
                        case02.readAllRecords();
                        break;
                        case 3:
                            case02.readRecordOnRollNo();
                            break;
                            case 4:
                                case02.readRecordOnName();
                                break;
                                case 5:
                                    case02.updateRecordByRollNo();
                                    break;
                                    case 6:
                                        case02.deleteRecordOnRollNo();
                                        break;
                                        case 7:
                                        System.out.println("Thank You! Exiting Application...");
                                        break;
                                        default: System.out.println("Invalid Choice! Please Try Again.");
            } }
        while (choice != 7);
        scanner.close();
    }

    public void addRecord() throws IOException {
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

        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(
                "Student Name :- " + name +
                        ", RollNo :- " + rollNo +
                        ", Age :- " + age +
                        ", Telugu Marks :- " + teluguMarks +
                        ", Hindi Marks :- " + hindiMarks +
                        ", English Marks :- " + englishMarks +
                        ", Math Marks :- " + mathMarks +
                        ", Science Marks :- " + scienceMarks +
                        ", Total Marks :- " + total +
                        ", Grade :- " + grade
        );
        fileWriter.write(System.lineSeparator());
        System.out.println("Student Added Successfully");
        fileWriter.close();
    }

    public void readAllRecords() throws IOException {
        FileReader fileReader = new FileReader("data/Student_Case02.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }
        fileReader.close();
    }

    public void readRecordOnRollNo() {
        System.out.println("Enter The RollNo Of The Student Record");
        String rollNo = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Student_Case02.txt"))) {
            String line;
            boolean found = false;

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String roll = data[1].replace(" RollNo :- ", "").trim();
                if (rollNo.equals(roll)) {
                    System.out.println("Record Found!");
                    System.out.println(line);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No Record Found !");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readRecordOnName() {
        System.out.println("Enter The Name Of the Student");
        String name = scanner.next();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/Student_Case02.txt"))) {
            String line;
            int count = 1;
            while ((line = bufferedReader.readLine()) != null) {
                String data[] = line.split(",");
                String name2 = data[0].replace("Student Name :- ", "").trim();
                if (name.equals(name2)) {
                    System.out.println("Record " + count++ + " :");
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteRecordOnRollNo() {
        System.out.println("Enter The RollNo Of the Student to delete");
        String rollNo = scanner.next();
        File originalFile = new File("data/Student_Case02.txt");
        File tempFile = new File("Temp.txt");
        boolean found = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");

                String rollNo2 = data[1]
                        .replace(" RollNo :- ", "")
                        .trim();

                if (rollNo.equals(rollNo2)) {
                    found = true;
                    continue;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (found) {
            if (originalFile.delete()) {
                if (tempFile.renameTo(originalFile)) {
                    System.out.println("Record Deleted Successfully");
                } else {
                    System.out.println("Unable To Rename The Temporary File!");
                }
            } else {
                System.out.println("Unable to delete original file!");
            }
        } else {
            tempFile.delete();
            System.out.println("Student Record Not Found!");
        }
    }

    public void updateRecordByRollNo() {
        System.out.println("Enter The RollNo Of the Student to update ");
        String rollNo = scanner.next();
        File originalFile = new File("data/Student_Case02.txt");
        File tempFile = new File("Temp.txt");
        boolean found = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");

                String rollNo2 = data[1]
                        .replace(" RollNo :- ", "")
                        .trim();

                if (rollNo.equals(rollNo2)) {
                    found = true;
                    System.out.println("Student Record Found!");

                    System.out.println("Enter The New Name:");
                    String name = scanner.next();

                    System.out.println("Enter The New Age:");
                    String age = scanner.next();

                    System.out.println("Enter The Telugu Marks:");
                    String teluguMarks = scanner.next();

                    System.out.println("Enter The Hindi Marks:");
                    String hindiMarks = scanner.next();

                    System.out.println("Enter The English Marks:");
                    String englishMarks = scanner.next();

                    System.out.println("Enter The Math Marks:");
                    String mathMarks = scanner.next();

                    System.out.println("Enter The Science Marks:");
                    String scienceMarks = scanner.next();

                    int total = Integer.parseInt(teluguMarks) + Integer.parseInt(hindiMarks) + Integer.parseInt(englishMarks) + Integer.parseInt(mathMarks) + Integer.parseInt(scienceMarks);
                    String grade = total >= 450 ? "A" : total > 350 ? "B" : total > 300 ? "C" : total > 250 ? "D" : "F";
                    String updatedRecord =
                            "Student Name :- " + name +
                                    ", RollNo :- " + rollNo +
                                    ", Age :- " + age +
                                    ", Telugu Marks :- " + teluguMarks +
                                    ", Hindi Marks :- " + hindiMarks +
                                    ", English Marks :- " + englishMarks +
                                    ", Math Marks :- " + mathMarks +
                                    ", Science Marks :- " + scienceMarks+
                                    ", Total Marks :- " +
                                    total + ", " +
                                    "Grade :- " + grade;

                    bufferedWriter.write(updatedRecord);
                }
                else
                {
                    bufferedWriter.write(line);
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (found) {
            if (originalFile.delete()) {
                if (tempFile.renameTo(originalFile)) {
                    System.out.println("Student Record Updated Successfully!");
                } else {
                    System.out.println("Unable To Rename Temporary File!");
                }
            } else {
                System.out.println("Unable To Delete Original File!");
            }
        } else {
            tempFile.delete();
            System.out.println("Student Record Not Found!");
        }
    }
}
