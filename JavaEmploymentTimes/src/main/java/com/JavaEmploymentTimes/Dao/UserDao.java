package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;


import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Users;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class UserDao implements IUsersDao {
	
	private Connection con;
	public UserDao() {
		this.con=DBConnection.GetConnection();
	}

	@Override
	public String AddUser(Users users) {
		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement("insert into Users (userId,userFirstName,userLastName,userEmail,userPassword,userContact,userMob,userImagePath,userAddress,userArea,userCity,userState,userCountry,userDob,rolId,ipAddress,isActive,delInd,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pre.setInt(1, users.getUserId());
			pre.setString(2, users.getUserFirstName());
			pre.setString(3, users.getUserLastName());
			pre.setString(4, users.getUserEmail());
			pre.setString(5, users.getUserPassword());
			pre.setString(6, users.getUserContact());
			pre.setString(7, users.getUserMob());
			pre.setString(8, users.getUserImagePath());
			pre.setString(9, users.getUserAddress());
			pre.setString(10, users.getUserArea());
			pre.setString(11, users.getUserCity());
			pre.setString(12, users.getUserState());
			pre.setString(13, users.getUserCountry());
			pre.setDate(14,users.getUserDob());
			pre.setInt(15, users.getRolId());
			pre.setString(16, users.getIpAddress());
			pre.setString(17, users.getIsActive());
			pre.setString(18, users.getDelInd());
			pre.setString(19, users.getUpdateUser());
			pre.setDate(20,users.getUpdateDate());
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			output = "Data not inserted .";
			e.printStackTrace();
		}

		return output;
	}

	@Override
	public String UpdateUser(Users roles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
