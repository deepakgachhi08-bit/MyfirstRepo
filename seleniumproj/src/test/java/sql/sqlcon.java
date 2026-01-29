package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlcon {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/","sql12815176","fmpTe3K2kg");
		Statement st = con.createStatement();
		String query = "create database demo";
		st.executeUpdate(query);
		System.out.println("Table is created");
		st.close();
		con.close();
	}

}
