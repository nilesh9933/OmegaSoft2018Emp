package com.JavaEmploymentTimes.Dao;

import java.util.List;

import com.JavaEmploymentTimes.Model.RoleAssignment;
import com.JavaEmploymentTimes.Model.Roles;

public interface IRoleAssignment {
	
	List<Roles> GetRoles();

	String AddRoleAssignment(RoleAssignment rolAss);

}
