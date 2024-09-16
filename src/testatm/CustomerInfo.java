package testatm;
public class CustomerInfo {
    private String FullName;
    private String ContactNo;
    private String CityName;
    public CustomerInfo(String FullName, String ContactNo, String CityName) {
        this.FullName = FullName;
        this.ContactNo = ContactNo;
        this.CityName = CityName;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
    public String getContactNo() {
        return ContactNo;
    }
    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    public String getCityName() {
        return CityName;
    }
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    public String toString()
    {
        return String.format("Full Name: %s\tContact No: %s\t CityName:%s",this.FullName,this.ContactNo,this.CityName);
    }
}
