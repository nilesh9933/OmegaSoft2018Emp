package com.JavaEmploymentTimes.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.JobsDao;
import com.JavaEmploymentTimes.Model.Jobs;
@RestController
public class JobsController {

	@RequestMapping(value="/AddJobs",method=RequestMethod.POST)
	@ResponseBody
	public String AddJobs(@ModelAttribute ("Jobs") Jobs jobs)
	{
		JobsDao obj=new JobsDao();			
		return obj.AddJobs(jobs);
	}
	
	@RequestMapping(value="/GetGovJobs",method=RequestMethod.GET)
	@ResponseBody
	public List<Jobs> GetGovJobList()
	{
		List<Jobs> jobList=null;
		
		JobsDao obj=new JobsDao();	
		jobList = obj.GetGovJobList();
		
		return jobList;
	}

}
