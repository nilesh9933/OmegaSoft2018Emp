package com.MVCExample.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@CrossOrigin("*")
	@RequestMapping(value = "/GiveName", method = RequestMethod.GET)
	public String GetName() {
		return "Hello World !";
	}

}
