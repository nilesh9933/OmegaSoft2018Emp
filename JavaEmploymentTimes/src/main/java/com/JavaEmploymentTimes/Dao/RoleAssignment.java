package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaEmploymentTimes.Model.Roles;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class RoleAssignment implements IRoleAssignment {

	private Connection con;

	public RoleAssignment() {
		con = DBConnection.GetConnection();
	}

	@Override
	public List<Roles> GetRoles() {
		try {
			Statement st = con.createStatement();
			String sql = "SELECT rolId, rolName FROM roles where delInd='N'";
			ResultSet rs = st.executeQuery(sql);
			List<Roles> rols = null;
			
			rols=new ArrayList<Roles>();
			
			while(rs.next())
			{
				Roles rol=new Roles();
				rol.setRolId(rs.getInt("rolId"));
				rol.setRolName(rs.getString("rolName"));
				
				rols.add(rol);
			}
			
			return rols;

		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public String AddRoleAssignment(com.JavaEmploymentTimes.Model.RoleAssignment rolAss) {
		// TODO Auto-generated method stub
		return null;
	}

}
