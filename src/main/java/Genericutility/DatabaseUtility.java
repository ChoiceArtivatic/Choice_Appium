package Genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains Dbconnection method,Executequery method,Updatequery method,close db method
 * @author Artivatic
 *
 */
public class DatabaseUtility 
{
	     Connection conn;
        public void connectToDB() throws Throwable
        {
        	Driver driver=new Driver();
        	DriverManager.registerDriver(driver);
            conn=DriverManager.getConnection(IConstants.DB_URL,IConstants.DB_USERNAME,IConstants.DB_PASSWORD);
           	
        }
        public ResultSet executeQuery(String query) throws Throwable
        {
        	Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            return result;
        }
     
        public int updateQuery(String query) throws Throwable
        {
        	Statement stat = conn.createStatement();
        	int count=stat.executeUpdate(query);
        	return count;
        }
        
        public void closeDb() throws SQLException
        {
        	try {
        	conn.close();
        	}
        	catch (Exception e)
        	{
				// TODO: handle exception
			}
        }
 
        }
