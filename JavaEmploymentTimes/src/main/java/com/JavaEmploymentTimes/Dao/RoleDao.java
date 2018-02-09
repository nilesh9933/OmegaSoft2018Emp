package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaEmploymentTimes.Model.Roles;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class RoleDao implements IRolesDao {
	private Connection con;

	public RoleDao() {
		this.con = DBConnection.GetConnection();
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
	public List<Roles> GetRoles() {
		try {
			Statement st = con.createStatement();
			String sql = "SELECT rolId, rolName FROM roles where delInd='N'";
			ResultSet rs = st.executeQuery(sql);
			List<Roles> rols = null;

			rols = new ArrayList<Roles>();

			while (rs.next()) {
				Roles rol = new Roles();
				rol.setRolId(rs.getInt("rolId"));
				rol.setRolName(rs.getString("rolName"));

				rols.add(rol);
			}

			return rols;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
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
