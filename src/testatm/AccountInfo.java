package testatm;
public class AccountInfo {
    private String Banktitle;
    private String AccountNumber;
    private double AccountBalance;
    private int AtmPin;
    CustomerInfo c;
    public AccountInfo(String Banktitle, String AccountNumber, double AccountBalance, String FullName, String ContactNo,String CityName,int AtmPin) {
        c=new CustomerInfo(FullName, ContactNo, CityName);
        this.Banktitle = Banktitle;
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
    }

    public CustomerInfo getC() {
        return c;
    }
    public void setC(CustomerInfo c) {
        this.c = c;
    }
    public String getBanktitle() {
        return Banktitle;
    }
    public void setBanktitle(String Banktitle) {
        this.Banktitle = Banktitle;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    public double getAccountBalance() {
        return AccountBalance;
    }
    public void setAccountBalance(int AccountBalance) {
        this.AccountBalance = AccountBalance;
    }
    public void setAtmPin(int atmpin)
    {
        this.AtmPin=atmpin;
    }
    public int getAtmPin()
    {
        return this.AtmPin;
    }
    @Override
    public String toString()
    {
        return String.format("AtmPin: %d \nBankTitle: %s\tAccount Number: %s\tAccount Balance: %s\t%s",this.getAtmPin(),this.getBanktitle(),this.getAccountNumber(),this.getAccountBalance(),c.toString());
    }
}
