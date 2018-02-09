package com.JavaMaharashtraAutoService.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaMaharashtraAutoService.Model.Users;
import com.JavaMaharashtraAutoService.Util.MySQLConnection;

public class UserRegistration implements IUserRegistration {
	Connection con;
	
	public UserRegistration() {
		con=MySQLConnection.GetConnection();
	}

	@Override
	public String AddUser(Users user) {
		
		try {
			PreparedStatement pre=con.prepareStatement("insert into users(userFirstName, userLastName, userEmail, userMob, password) values(?,?,?,?,?)");
			pre.setString(1,user.getUserFirstName());
			pre.setString(2,user.getUserLastName());
			pre.setString(3, user.getUserEmail());
			pre.setString(4,user.getUserMob());
			pre.setString(5,user.getPassword());
			pre.executeUpdate();
			
			String message="Data Stored";
			return message;
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
			String message="Data Not Inserted";
			return message;
			
		}
		
	
	}

	@Override
	public String UpdateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
