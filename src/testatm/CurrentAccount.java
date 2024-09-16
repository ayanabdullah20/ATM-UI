package testatm;
import DataBase.Data;
import java.sql.*;
import java.util.ArrayList;
public class CurrentAccount extends AccountInfo{
    public CurrentAccount(String Banktitle, String AccountNumber, double AccountBalance, String FullName, String ContactNo,String CityName,int AtmPin) {
        super(Banktitle, AccountNumber, AccountBalance, FullName, ContactNo, CityName,AtmPin);}
    public void StoreCurrentAccount(CurrentAccount e)
    {
        String addquery = "INSERT INTO `currentaccount`(AtmPin,`Banktitle`, `AccountNumber`, `AccountBalance`, `FullName`, `ContactNo`, `CityName`) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Data.getConnection().prepareStatement(addquery);
            ps.setInt(1,e.getAtmPin());
            ps.setString(2, e.getBanktitle());
            ps.setString(3, e.getAccountNumber());
            ps.setDouble(4, e.getAccountBalance());
            ps.setString(5, c.getFullName());
            ps.setString(6, c.getContactNo());
            ps.setString(7, c.getCityName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
    }
    }
    public static ArrayList<CurrentAccount> ReadCurrentAccount()
    {
        ArrayList<CurrentAccount> list = new ArrayList<CurrentAccount>();
        CurrentAccount ca = null;
        String readquery = "SELECT * FROM `currentaccount` WHERE 1";
        try {
            PreparedStatement stmt = Data.getConnection().prepareStatement(readquery);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                ca=new CurrentAccount(rs.getString("Banktitle"),rs.getString("AccountNumber"),rs.getInt("AccountBalance"),rs.getString("FullName"),rs.getString("ContactNo"),rs.getString("CityName"),rs.getInt("AtmPin"));
                list.add(ca);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return list;
    }
    public static CurrentAccount findCurrentAccount(String an)
    {
        String findQuery = "SELECT * FROM `currentaccount` WHERE `AccountNumber` = ?";
        CurrentAccount currentAccount = null;
        try 
        {
            Connection connection = Data.getConnection();
            PreparedStatement ps = connection.prepareStatement(findQuery);
            ps.setString(1, an);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {
                currentAccount = new CurrentAccount(rs.getString("Banktitle"),rs.getString("AccountNumber"),rs.getInt("AccountBalance"),rs.getString("FullName"),rs.getString("ContactNo"),rs.getString("CityName"),rs.getInt("AtmPin"));
                currentAccount.setAtmPin(rs.getInt("AtmPin"));
            }
        }
         catch (SQLException ex) {
            return null;
        }
        return currentAccount;
    }
    public static void UpdateAtmPin(String AccountNumber, int atmpin)
    {
        String updatequery="UPDATE `currentaccount` SET `AtmPin` = ? WHERE `AccountNumber`= ?";
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
    public static void DeleteCurrentAccount(String an)
    {
        String deletequery="DELETE FROM `currentaccount` WHERE `AccountNumber` = ?";
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
        String updatequery="UPDATE `currentaccount` SET `AccountBalance` = ? WHERE `AccountNumber`= ?";
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
    public String toString()
    {
        return String.format("%s",super.toString());
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
}
