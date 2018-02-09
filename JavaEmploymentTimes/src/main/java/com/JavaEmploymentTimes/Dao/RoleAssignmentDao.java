package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Utils.DBConnection;

public class RoleAssignmentDao implements IRoleAssignment {

	private Connection con;

	public RoleAssignmentDao() {
		con = DBConnection.GetConnection();
	}

	@Override
	public String AddRoleAssignment(com.JavaEmploymentTimes.Model.RoleAssignment rolAss) {
		String output = "";
		try {
			PreparedStatement pre = con
					.prepareStatement("insert into Rolleassigment (rolId,userEmail,delInd) values(?,?,?)");
			pre.setInt(1, rolAss.getRolId());
			pre.setString(2, rolAss.getUserEmail());
			pre.setString(3, rolAss.getDelInd());
			pre.executeUpdate();
			output = "Data enterd successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

}
