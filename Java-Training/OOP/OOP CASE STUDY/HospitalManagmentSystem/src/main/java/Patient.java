public class Patient {
    private int patientId;
    private String patientName;
    private int severity;
    private int arrivalTime;
    private static int idGenerator=101;

    public Patient(String patientName, int severity, int arrivalTime) {
        this.patientId=idGenerator++;
        this.patientName = patientName;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", severity=" + severity +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
