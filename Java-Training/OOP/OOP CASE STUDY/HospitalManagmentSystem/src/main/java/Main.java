import java.util.Scanner;

public class Main {
    static PatientRepository patientRepository=new PatientRepository();
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        do
        {
            System.out.println("Enter The Option:");
            System.out.println("1.Add Patient \n 2.Displays Patients");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    addPatient();
                    break;
                case 2:
                    patientRepository.displayPatient();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please Enter Correct Option");
                    break;
            }
        }
        while (choice!=0);
    }
    public static void addPatient()
    {
        System.out.println("Enter The Name Of The Patient");
        String name = scanner.nextLine();
        if(name==null||name.trim().isEmpty()) {
            System.out.println("Name Not Be Empty");
            return;
        }
        System.out.println("Enter The Severity (1-10)");
        int severity = scanner.nextInt();
        if (!(severity>=1 && severity<=10))
        {
            System.out.println("Please Enter Correct Severity (1-10)");
            return;
        }
        scanner.next();
        System.out.println("Enter The Arrival Time (1-23)");
        int arrivalTime=scanner.nextInt();
        if (!(arrivalTime>=1 && arrivalTime<=23))
        {
            System.out.println("Please Enter Correct Arrival Time (1-23)");
            return;
        }
        Patient patient=new Patient(name,severity,arrivalTime);
        patientRepository.addPatient(patient);
    }
}
