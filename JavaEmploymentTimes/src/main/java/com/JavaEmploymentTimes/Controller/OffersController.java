package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.OffersDao;
import com.JavaEmploymentTimes.Model.Offers;

@RestController
public class OffersController {
	@RequestMapping(value="/AddOffers",method=RequestMethod.POST)
	@ResponseBody
	public String AddOffers(@ModelAttribute("offer")Offers off)
	{
		OffersDao obj=new OffersDao();
		return obj.AddOffers(off);
	}

}
