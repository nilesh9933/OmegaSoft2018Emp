package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		@RequestMapping(value="/Login",method=RequestMethod.POST)
		@ResponseBody
		 public String Login(@RequestParam String userEmail,@RequestParam String userPassword)
	        {
	            boolean isAuthen1 = false;

	            String str = "";
	            UserDao obj=new UserDao();
	            isAuthen1= obj.LoginUser(userEmail,userPassword);

	           
	            if(isAuthen1==true)
	            {
	                str = "Go Ahead";
	            }
	            else
	            {
	                str = "Sorry";
	            }
	            return str;
	        }

	
}
