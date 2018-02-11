package com.JavaMaharashtraAutoService.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.JavaMaharashtraAutoService.Model.Log;
import com.JavaMaharashtraAutoService.Model.LoginDetails;
import com.JavaMaharashtraAutoService.Model.ProductType;
import com.JavaMaharashtraAutoService.Model.Users;
import com.JavaMaharashtraAutoService.Util.Logger;
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
	
	
	public LoginDetails Login(String userName, String password)
	{
		
		LoginDetails output = new LoginDetails();
		try
		{
			String sql="select userFirstName ,userLastName,userEmail,B.rolName \r\n" + 
					"from users as A join roles as B on A.rolId=B.rolId where userEmail='"+userName+"' and password='"+password+"'";
		
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {				
				output.setFirstName(rs.getString("userFirstName"));
				output.setLastName(rs.getString("userLastName"));
				output.setEmail(rs.getString("userEmail"));
				output.setRole(rs.getString("rolName"));
			}
		}
		catch(Exception e)
		{
			Log obj = new Log();
			obj.setEventName("UserRegistration");
			obj.setEventMessage(e.getMessage());
			obj.setEventType("Exception");
			Logger.WriteLog(obj);
		}
		
		return output;
	}
}
