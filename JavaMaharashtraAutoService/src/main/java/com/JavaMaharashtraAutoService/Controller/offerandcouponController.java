package com.JavaMaharashtraAutoService.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaMaharashtraAutoService.Dao.offerandcouponDao;
import com.JavaMaharashtraAutoService.Model.offerandcoupon;

	
	@RestController
	public class offerandcouponController {

		@RequestMapping(value="/Addofferandcoupon",method=RequestMethod.POST)
		@ResponseBody
		public String Addofferandcoupon(@ModelAttribute ("offerandcoupon") offerandcoupon offcou)
		{
			offerandcouponDao obj=new offerandcouponDao();			
			return obj.Addofferandcoupon(offcou);
		}
	

}
