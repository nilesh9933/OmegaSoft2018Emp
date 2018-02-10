package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	
    @CrossOrigin(origins = "*")
	@RequestMapping("/GetMethod")
	public String GetMyName()
	{
		return "Hello ! Good Morning.";
	}

}
