package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.RoleDao;
import com.JavaEmploymentTimes.Model.Roles;

@RestController
public class RolesController {

	@RequestMapping(value="/AddRole",method=RequestMethod.POST)
	@ResponseBody
	public String AddRoles(@ModelAttribute ("Roles") Roles role)
	{
		RoleDao obj=new RoleDao();			
		return obj.AddRole(role);
	}
}
