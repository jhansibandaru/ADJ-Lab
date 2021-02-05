package JDBC;
import java.util.*;
import java.sql.*;
import java.lang.*;

public class QueryExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null; 
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exp(4)", "root", "");
			 System.out.println("Connected database successfully...");
			 System.out.println("Creating table in given database...");
			 stmt = conn.createStatement();
			 String sql = "CREATE TABLE Student " +
			 "(id INTEGER not NULL, " +
			 " name VARCHAR(255))";
			 
			 stmt.executeUpdate(sql);
			 System.out.println("Created table in given database..."); 
			 
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
