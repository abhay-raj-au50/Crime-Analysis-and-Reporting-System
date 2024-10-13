package entity;

public class LawEnforcementAgency {
    private int agencyID;
    private String agencyName;
    private String jurisdiction;
    private String address;
    private String phoneNumber;

    public LawEnforcementAgency() {}

    public LawEnforcementAgency(int agencyID, String agencyName, String jurisdiction, String address, String phoneNumber) {
        this.agencyID = agencyID;
        this.agencyName = agencyName;
        this.jurisdiction = jurisdiction;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "LawEnforcementAgency{" +
                "agencyID=" + agencyID +
                ", agencyName='" + agencyName + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
