package com.lov2code.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	

	public static void main(String args[])
	{
		 String user = "hbstudent";
	    	String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		
		 String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
