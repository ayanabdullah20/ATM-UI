package testatm;
import DataBase.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class SavingAccount extends AccountInfo{
    private double interestrate;
    public double getInterestrate() {
        return interestrate;
    }
    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }
    public SavingAccount(String Banktitle, String AccountNumber, double AccountBalance, String FullName, String ContactNo,String CityName,double interestrate,int atmpin) {
        super(Banktitle, AccountNumber, AccountBalance, FullName, ContactNo,CityName,atmpin);
        this.interestrate = interestrate;
    }
        public void StoreSavingAccount(SavingAccount e)
    {
        String addquery = "INSERT INTO `savingaccount`(AtmPin,`Banktitle`, `AccountNumber`, `AccountBalance`, `FullName`, `ContactNo`, `CityName`, `interestrate`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Data.getConnection().prepareStatement(addquery);
            ps.setInt(1, e.getAtmPin());
            ps.setString(2, e.getBanktitle());
            ps.setString(3, e.getAccountNumber());
            ps.setDouble(4, e.getAccountBalance());
            ps.setString(5, c.getFullName());
            ps.setString(6, c.getContactNo());
            ps.setString(7, c.getCityName());
            ps.setDouble(8, e.getInterestrate());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
    }
    }
       public static ArrayList<SavingAccount> ReadSavingAccount()
    {
        ArrayList<SavingAccount> list = new ArrayList<SavingAccount>();
        SavingAccount ca = null;
        String readquery = "SELECT * FROM `savingaccount` WHERE 1";
        try {
            PreparedStatement stmt = Data.getConnection().prepareStatement(readquery);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                ca=new SavingAccount(rs.getString("Banktitle"),rs.getString("AccountNumber"),rs.getDouble("AccountBalance"),rs.getString("FullName"),rs.getString("ContactNo"),rs.getString("CityName"),rs.getDouble("interestrate"),rs.getInt("AtmPin"));
                list.add(ca);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return list;
    }
        public static SavingAccount findSavingAccount(String an)
    {
        String findQuery = "SELECT * FROM `savingaccount` WHERE `AccountNumber` = ?";
        SavingAccount savingAccount = null;
        try {
            Connection connection = Data.getConnection();
            PreparedStatement ps = connection.prepareStatement(findQuery);
            ps.setString(1, an);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                savingAccount = new SavingAccount(rs.getString("Banktitle"),rs.getString("AccountNumber"),rs.getInt("AccountBalance"),rs.getString("FullName"),rs.getString("ContactNo"),rs.getString("CityName"),rs.getDouble("interestrate"),rs.getInt("AtmPin"));
                savingAccount.setAtmPin(rs.getInt("AtmPin"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return savingAccount;
    }
        public static void UpdateAtmPin(String AccountNumber, int atmpin)
    {
        String updatequery="UPDATE `savingaccount` SET `AtmPin` = ? WHERE `AccountNumber`= ?";
        try{
            Connection connection = Data.getConnection();
            PreparedStatement ps = connection.prepareStatement(updatequery);
            ps.setInt(1, atmpin);
            ps.setString(2, AccountNumber);
            ps.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
        public static void DeleteSavingAccount(String an)
        {
            String deletequery="DELETE FROM `savingaccount` WHERE `AccountNumber`=?";
            try 
            {
                Connection connection = Data.getConnection();
                PreparedStatement ps = connection.prepareStatement(deletequery);
                ps.setString(1, an);
                ps.executeUpdate();
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
}
            public static void Updatebalance(String an,Double b)
    {
        String updatequery="UPDATE `savingaccount` SET `AccountBalance` = ? WHERE `AccountNumber`= ?";
        try{
            Connection connection = Data.getConnection();
            PreparedStatement ps = connection.prepareStatement(updatequery);
            ps.setDouble(1, b);
            ps.setString(2, an);
            ps.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public String getfullname()
    {
        return c.getFullName();
    }
    public String getcontactnumber()
    {
        return c.getContactNo();
    }
    public String getcityname()
    {
        return c.getCityName();
    }
    public double getir()
    {
        return this.interestrate;
    }
}
