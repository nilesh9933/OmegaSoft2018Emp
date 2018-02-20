package com.JavaEmploymentTimes.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.EpaperPostDao;
import com.JavaEmploymentTimes.Model.Epaperpost;

@RestController
public class EpaperpostController {

	@CrossOrigin("*")
	@RequestMapping(value = "/AddEpaperPost",method=RequestMethod.POST, consumes="multipart/form-data")
	public @ResponseBody String AddEpaperPost(@ModelAttribute("Epaperpost") Epaperpost ePaperPost) {

		EpaperPostDao obj = new EpaperPostDao();
		return obj.AddEpaperPost(ePaperPost);

	}
	
	@RequestMapping(value = "/GetEpaperDetails",method=RequestMethod.GET)
	public List<Epaperpost> GetPaperDetails()
	{
		EpaperPostDao obj = new EpaperPostDao();
		return obj.GetEPaperDetails();
	}
}
