package com.JavaEmploymentTimes.Dao;

import java.util.List;

import com.JavaEmploymentTimes.Model.Roles;

public interface IRolesDao {

	String AddRole(Roles roles);
	String UpdateRole(Roles roles);
	String DeleteRole();
	
	
	List<Roles> GetRoles();
	
}
