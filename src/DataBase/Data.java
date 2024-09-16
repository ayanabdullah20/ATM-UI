package DataBase;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
public class Data {
    private static String serverName="localhost";
    private static String userID="root";
    private static String dbName="atmdata";
    private static String pass=null;
    private static int portnumber=3306;
    public static Connection getConnection()
    {
        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(serverName);
        datasource.setUser(userID);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(pass);
        try{
            con = datasource.getConnection();
        }
        catch(SQLException e)
        {
            System.out.println("shut up");
        }
        return con;
    }
}
