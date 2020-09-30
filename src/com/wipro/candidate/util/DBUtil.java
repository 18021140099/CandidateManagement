package com.wipro.candidate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDbConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidate","lucious","u*r*good1");
			System.out.println("Success");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null; 
	}
}
