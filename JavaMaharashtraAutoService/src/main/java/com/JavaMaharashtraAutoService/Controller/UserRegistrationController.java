package com.JavaMaharashtraAutoService.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaMaharashtraAutoService.Dao.UserRegistration;
import com.JavaMaharashtraAutoService.Model.Users;

@RestController
public class UserRegistrationController {
	
	@RequestMapping(value="/AddUser" ,method=RequestMethod.POST)
	
	@ResponseBody
	String AddUsers(@ModelAttribute ("Users") Users user)
	{		
		UserRegistration regdao=new UserRegistration();		
		return regdao.AddUser(user);		
	}

}
