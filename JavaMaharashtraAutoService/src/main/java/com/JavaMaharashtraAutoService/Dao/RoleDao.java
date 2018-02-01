package com.JavaMaharashtraAutoService.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaMaharashtraAutoService.Model.Roles;
import com.JavaMaharashtraAutoService.Util.MySQLConnection;

public class RoleDao implements IRoleDao {

	Connection con;

	public RoleDao() {
		con = MySQLConnection.GetConnection();
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
		return "";
	}

	@Override
	public String DeleteRole() {
		// TODO Auto-generated method stub
		return "";
	}

}
