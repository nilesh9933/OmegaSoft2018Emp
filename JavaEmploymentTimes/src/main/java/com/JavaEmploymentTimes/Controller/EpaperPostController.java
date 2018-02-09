package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.EpaperPostDao;
import com.JavaEmploymentTimes.Dao.UserDao;
import com.JavaEmploymentTimes.Model.Epaperpost;
import com.JavaEmploymentTimes.Model.Users;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EpaperPostController {

	@RequestMapping(value="/AddEpaperPost",method=RequestMethod.POST)
	@ResponseBody

public String AddEpaperPost(@ModelAttribute ("Epaperpost") Epaperpost epaper)
{
		EpaperPostDao obj= new EpaperPostDao();
		return obj.AddEpaperPost(epaper);
}


	
}

