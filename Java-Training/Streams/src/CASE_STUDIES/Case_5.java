package CASE_STUDIES;

//3.consider collection of patient objects data with the following attributes
// patient_id,name,deptartment,doct_name,diagonisis,treatment given,patient_type(out,in,icu),heart_rate,bp,suger_value.
//now
//	. find all the icu patents
//	. find all active icu patient with elevated heart rate(rate more that 100).
//	. sort the patients by serious.

import java.util.Comparator;
import java.util.List;

public class Case_5 {

    public static void main(String[] args) {

        List<Patient> patientList= fetchMock();

        System.out.println("find all the icu patents");
        patientList.stream().filter(patient -> patient.getPatientType().equalsIgnoreCase("ICU")).forEach(System.out::println);
        System.out.println("find all active icu patient with elevated heart rate(rate more that 100).");
        patientList.stream().filter(patient -> patient.getPatientType().equalsIgnoreCase("ICU") && patient.getHeartRate() > 100).forEach(System.out::println);
        System.out.println("sort the patients by serious.");
        patientList.stream().sorted(Comparator.comparingInt(Patient::getCondition).reversed()).forEach(System.out::println);


    }



        public static List<Patient> fetchMock() {

            return List.of(
                    new Patient(101, "Rahul", "Cardiology", "Dr. Sharma", "Heart Attack", "Angioplasty", "ICU", 125, 160, 180, 9),
                    new Patient(102, "Priya", "Neurology", "Dr. Ramesh", "Migraine", "Medication", "OUT", 82, 120, 95, 2),
                    new Patient(103, "Kiran", "Orthopedics", "Dr. Kumar", "Fracture", "Surgery", "IN", 95, 130, 110, 5),
                    new Patient(104, "Sneha", "Cardiology", "Dr. Sharma", "Cardiac Arrest", "Emergency Treatment", "ICU", 145, 180, 210, 10),
                    new Patient(105, "Arjun", "Diabetology", "Dr. Meena", "Diabetes", "Insulin Therapy", "IN", 88, 140, 250, 6),
                    new Patient(106, "Divya", "Pulmonology", "Dr. Raj", "Asthma", "Oxygen Therapy", "ICU", 118, 150, 130, 7),
                    new Patient(107, "Vikram", "Neurology", "Dr. Ramesh", "Stroke", "Emergency Surgery", "ICU", 135, 190, 160, 9),
                    new Patient(108, "Anjali", "Dermatology", "Dr. Priya", "Skin Allergy", "Medication", "OUT", 76, 110, 90, 1),
                    new Patient(109, "Suresh", "Cardiology", "Dr. Sharma", "High BP", "BP Medication", "IN", 105, 170, 140, 6),
                    new Patient(110, "Pooja", "Diabetology", "Dr. Meena", "Type 2 Diabetes", "Insulin Therapy", "OUT", 90, 135, 280, 5),
                    new Patient(111, "Manoj", "Pulmonology", "Dr. Raj", "Pneumonia", "Ventilator Support", "ICU", 155, 185, 175, 10),
                    new Patient(112, "Keerthi", "Orthopedics", "Dr. Kumar", "Knee Injury", "Physiotherapy", "OUT", 78, 115, 100, 3),
                    new Patient(113, "Ravi", "Cardiology", "Dr. Sharma", "Heart Failure", "Cardiac Monitoring", "ICU", 130, 175, 190, 8),
                    new Patient(114, "Meena", "Neurology", "Dr. Ramesh", "Epilepsy", "Medication", "IN", 92, 125, 105, 4),
                    new Patient(115, "Ajay", "Diabetology", "Dr. Meena", "Diabetes", "Insulin Therapy", "ICU", 112, 165, 320, 8),
                    new Patient(116, "Swathi", "Cardiology", "Dr. Sharma", "Arrhythmia", "Heart Monitoring", "IN", 115, 155, 145, 7),
                    new Patient(117, "Naveen", "Pulmonology", "Dr. Raj", "Respiratory Failure", "Ventilator Support", "ICU", 160, 200, 200, 10),
                    new Patient(118, "Lakshmi", "Dermatology", "Dr. Priya", "Eczema", "Medication", "OUT", 80, 118, 98, 2),
                    new Patient(119, "Charan", "Orthopedics", "Dr. Kumar", "Spinal Injury", "Surgery", "ICU", 108, 160, 150, 7),
                    new Patient(120, "Sanjana", "Diabetology", "Dr. Meena", "Diabetes", "Diet Control", "IN", 85, 130, 220, 4)
            );
    }

}
class Patient
{
    private int patient_id;
    private String name;
    private String department;
    private  String doctName;
    private String diagnosis;
    private String treatment_given;
    private String patientType;
    private int heartRate;
    private int bp;
    private int sugarValue;
    private int condition;

    public Patient(int patient_id, String name, String department, String doctName, String diagnosis, String treatment_given, String patientType, int heartRate, int bp, int sugarValue,int condition) {
        this.patient_id = patient_id;
        this.name = name;
        this.department = department;
        this.doctName = doctName;
        this.diagnosis = diagnosis;
        this.treatment_given = treatment_given;
        this.patientType = patientType;
        this.heartRate = heartRate;
        this.bp = bp;
        this.sugarValue = sugarValue;
        this.condition=condition;

    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment_given() {
        return treatment_given;
    }

    public void setTreatment_given(String treatment_given) {
        this.treatment_given = treatment_given;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public int getSugarValue() {
        return sugarValue;
    }

    public void setSugarValue(int sugarValue) {
        this.sugarValue = sugarValue;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id=" + patient_id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", doctName='" + doctName + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", treatment_given='" + treatment_given + '\'' +
                ", patientType='" + patientType + '\'' +
                ", heartRate=" + heartRate +
                ", bp=" + bp +
                ", sugarValue=" + sugarValue +
                ", condition=" + condition +
                '}';
    }
}
