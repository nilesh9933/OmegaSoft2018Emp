package com.SpringJDBC.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJDBC.Dao.EmployeeDao;
import com.SpringJDBC.Model.Employee;


@RestController
public class MySpringController {

	//@CrossOrigin(origins = "*")
	@RequestMapping(value="/AddEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Employee AddEmployee(@ModelAttribute("Employee") Employee emp)
	{
		EmployeeDao obj=new EmployeeDao();
		obj.AddEmployee(emp);
		return emp;	 
	}
}
