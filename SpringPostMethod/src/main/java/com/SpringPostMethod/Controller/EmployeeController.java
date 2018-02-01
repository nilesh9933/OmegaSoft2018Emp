<<<<<<< HEAD
package com.SpringPostMethod.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringPostMethod.Dao.EmployeeDao;
import com.SpringPostMethod.Model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value="/AddEmployee",method= org.springframework.web.bind.annotation.RequestMethod.POST)
	@ResponseBody
	public String AddEmployee(@ModelAttribute("Employee") Employee emp)
	{
		String output;
		EmployeeDao obj=new EmployeeDao();
		output=obj.AddEmployee(emp);
		
		return output;
	}
}
=======
package com.SpringPostMethod.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringPostMethod.Dao.EmployeeDao;
import com.SpringPostMethod.Model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value="/AddEmployee",method= org.springframework.web.bind.annotation.RequestMethod.POST)
	@ResponseBody
	public String AddEmployee(@ModelAttribute("Employee") Employee emp)
	{
		String output;
		EmployeeDao obj=new EmployeeDao();
		output=obj.AddEmployee(emp);
		
		return output;
	}
}
<<<<<<< HEAD
>>>>>>> f893c83a20d2de002da0ef187bd8e25badb041cc
=======
>>>>>>> bd4d9c5047a925f002ab8acf4685c1840b5f096f
>>>>>>> e610427c64be5b726a8e986c9f0c7ea80e496d47
