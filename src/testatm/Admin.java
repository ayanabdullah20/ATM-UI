
package testatm;
import DataBase.Data;
import java.sql.*;
public class Admin {
    private String name;
    private String pass;

    public Admin(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pass;
    }

    public void setPin(String pass) {
        this.pass = pass;
    }
    public void addadmin()
    {
        String addquery="INSERT INTO `admin`(`Name`, `Pass`) VALUES (?,?)";
        try
        {
            PreparedStatement ps = Data.getConnection().prepareStatement(addquery);
            ps.setString(1,this.name);
            ps.setString(2, this.pass);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }
    public static Admin findadmininfo(String username)
    {
        String findquery="SELECT * FROM `admin` WHERE `Name` = ?";
        Admin b=null; 
        try
        {
          Connection connection = Data.getConnection();
          PreparedStatement ps = connection.prepareStatement(findquery);
          ps.setString(1, username);
          ResultSet rs = ps.executeQuery();
          if(rs.next())
          {
              b = new Admin(rs.getString("Name"),rs.getString("Pass"));
          }
        }
        catch(SQLException ex)
        {
          return null;
        }
        return b;
    }
    public static void Deleteadmininfo(String username)
    {
        String deletequery="DELETE FROM `admin` WHERE `Name` = ?";
        try
        {
            Connection connection = Data.getConnection();
            PreparedStatement ps = connection.prepareStatement(deletequery);
            ps.setString(1, username);
            ps.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    }
    
