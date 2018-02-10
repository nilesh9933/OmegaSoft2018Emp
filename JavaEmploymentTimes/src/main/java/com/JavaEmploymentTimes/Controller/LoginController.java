package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.JavaEmploymentTimes.Dao.LoginDao;
import com.JavaEmploymentTimes.Model.Login;

public class LoginController {
	@RequestMapping(value="/AddLogin",method=RequestMethod.POST)
	@ResponseBody
	public String AddLogin(@ModelAttribute ("Login") Login login)
	{
		LoginDao obj=new LoginDao();			
		return obj.AddLogin(login);
		
		
		
		
		
	}
}
