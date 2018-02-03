package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Roles;
import com.JavaEmploymentTimes.Util.MySQLConnection;


public class RoleDao implements IRolesDao {
	private Connection con;
	public RoleDao() {
		this.con=MySQLConnection.GetConnection();
	}
	@Override
	public String AddRole(Roles roles) {
		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement(
					"insert into Roles (rolName,rolDes,delInd,updateUser,updateDate) values(?,?,?,?,?)");
			pre.setString(1, roles.getRolName());
			pre.setString(2, roles.getRolDes());
			pre.setString(3, "N");
			pre.setString(4, roles.getUpdateUser());
			pre.setDate(5, roles.getUpdateDate());
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output;
	}

	@Override
	public String UpdateRole(Roles roles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
