package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.RoleAssignmentDao;
import com.JavaEmploymentTimes.Model.RoleAssignment;

@RestController
public class RoleAssignmentController {
	@RequestMapping(value = "/AddRolesAssignment", method = RequestMethod.POST)
	@ResponseBody
	public String AddRolesAssignment(@ModelAttribute("RoleAssignment") RoleAssignment rolAssi) {
		RoleAssignmentDao obj = new RoleAssignmentDao();
		return obj.AddRoleAssignment(rolAssi);
	}

}
