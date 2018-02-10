package com.JavaEmploymentTimes.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.RoleAssignment;
import com.JavaEmploymentTimes.Model.Roles;


@RestController
public class RolesController {

	@CrossOrigin("*")
	@RequestMapping(value="/GetUserRoles",method= RequestMethod.GET)
	public List<Roles> GetRoles()
	{
		RoleAssignment rolAss=new RoleAssignment();
		return rolAss.GetRoles();
	}
}
