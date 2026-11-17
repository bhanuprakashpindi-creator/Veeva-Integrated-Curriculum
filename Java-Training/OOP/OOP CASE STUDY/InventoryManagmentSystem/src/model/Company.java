package model;

public class Company {
    static int count=1;
    private int companyId;
    private String companyName;
    private String phoneNumber;
    private String location;

    public Company( String companyName, String phoneNumber, String location) {
        this.companyId = count++;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Company(int companyId, String companyName, String phoneNumber, String location) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
