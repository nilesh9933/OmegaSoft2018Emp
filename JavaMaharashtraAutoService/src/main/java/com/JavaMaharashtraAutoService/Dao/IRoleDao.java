package com.JavaMaharashtraAutoService.Dao;

import com.JavaMaharashtraAutoService.Model.Roles;

public interface IRoleDao {

	String AddRole(Roles roles);
	String UpdateRole(Roles roles);
	String DeleteRole();
}
