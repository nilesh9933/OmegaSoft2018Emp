package com.SpringPostMethod.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.SpringPostMethod.Model.Employee;
import com.SpringPostMethod.Util.MySQLConnection;

public class EmployeeDao implements IEmployee {

	private Connection con;

	public EmployeeDao() {
		con = MySQLConnection.GetConnection();
	}

	@Override
	public String AddEmployee(Employee emp) {
		
		String message = "";

		try {

			PreparedStatement pre = con.prepareStatement(
					"insert into users (username,password,firstname,lastname,email,address,dob,del_ind) values (?,?,?,?,?,?,?,?)");
			pre.setString(1, emp.getEmail());
			pre.setString(2, emp.getPassword());
			pre.setString(3, emp.getFirstName());
			pre.setString(4, emp.getLastName());
			pre.setString(5, emp.getEmail());
			pre.setString(6, emp.getAddress());
			pre.setString(7, emp.getDob());
			pre.setString(8, "N");
			pre.executeUpdate();
			
			message = "Data has been inserted successfully.";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return message;
	}

}
