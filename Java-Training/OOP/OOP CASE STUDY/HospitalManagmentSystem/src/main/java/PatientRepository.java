import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class PatientRepository {
    List<Patient> patientList=new ArrayList<>();

    public  PatientRepository ()
    {
        addMockData();
    }
    public void addPatient(Patient patient)
    {
        patientList.add(patient);
    }

    public void displayPatient() {
        List<Patient> sortedList = patientList.stream().sorted(Comparator.comparingInt(Patient::getSeverity).reversed().thenComparingInt(Patient::getArrivalTime)).toList();
        sortedList.forEach(System.out::println);
    }
    public void addMockData() {
        patientList.add(new Patient("Ravi", 8, 12));
        patientList.add(new Patient("Suresh", 10, 15));
        patientList.add(new Patient("Kumar", 7, 5));
        patientList.add(new Patient("Bhanu", 9, 20));
        patientList.add(new Patient("Prakash", 10, 3));
        patientList.add(new Patient("Krishna", 8, 6));
        patientList.add(new Patient("Arjun", 9, 8));
        patientList.add(new Patient("Manoj", 6, 2));
        patientList.add(new Patient("Sai", 10, 10));
        patientList.add(new Patient("Teja", 7, 18));
    }
}
