package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.UserDao;
import com.JavaEmploymentTimes.Model.Users;

@RestController

public class UsersController {

		@RequestMapping(value="/AddUser",method=RequestMethod.POST)
		@ResponseBody
		public String AddUser(@ModelAttribute ("Users") Users user)
		{
			UserDao obj=new UserDao();			
			return obj.AddUser(user);
		}
	
}
