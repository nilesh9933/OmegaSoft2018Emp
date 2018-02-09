package com.JavaEmploymentTimes.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con = null;

	public static Connection GetConnection() {
		try {

			if (con == null) {
				String driver = "com.mysql.jdbc.Driver";
				String URL = "jdbc:mysql://localhost:3306/EMPDB";
				String user = "root";
				String password = "dhanu123";

				Class.forName(driver);
				
				con = DriverManager.getConnection(URL, user, password);
			}
		} 
		
		catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}
}
