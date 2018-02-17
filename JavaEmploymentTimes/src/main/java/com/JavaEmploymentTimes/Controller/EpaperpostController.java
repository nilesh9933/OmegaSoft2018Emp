package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.EpaperPostDao;
import com.JavaEmploymentTimes.Model.Epaperpost;

@RestController
public class EpaperpostController {
	@CrossOrigin("*")

	@RequestMapping(value="/AddEpaperPost")
	@ResponseBody
	public String AddEpaperPost(@ModelAttribute ("Epaperpost") Epaperpost ePaperPost){
		
		EpaperPostDao obj= new EpaperPostDao();
		return obj.AddEpaperPost(ePaperPost);
		
	}
}
