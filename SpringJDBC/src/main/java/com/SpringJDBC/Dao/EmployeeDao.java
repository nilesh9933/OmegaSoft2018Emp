package com.SpringJDBC.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.SpringJDBC.Model.Employee;
import com.SpringJDBC.Util.*;

public class EmployeeDao implements IEmployee {

	private Connection con;

	public EmployeeDao() {
		this.con = DbConnection.GetConnection();
	}

	@Override
	public String AddEmployee(Employee emp) {
		
		try {
			
			java.util.Date dob = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
			
			PreparedStatement pre = con.prepareStatement(
					"insert into users(username,firstname,lastname,dob,email) values (?, ?, ?, ?,? )");
			pre.setString(1, emp.getUserName());
			pre.setString(2, emp.getFirstName());
			pre.setString(3, emp.getLastName());
			pre.setDate(4, sqlDate);
			pre.setString(5, emp.getEmail());
			pre.executeUpdate();
			return "Data has been inserted successfully.";

		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

}
