package com.JavaEmploymentTimes.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.JobsDao;
import com.JavaEmploymentTimes.Model.Jobs;
@RestController
public class JobsController {
	@CrossOrigin(origins = "*")

	@RequestMapping(value="/AddJobs",method=RequestMethod.POST)
	@ResponseBody
	public String AddJobs(@ModelAttribute ("Jobs") Jobs jobs)
	{
		JobsDao obj=new JobsDao();			
		return obj.AddJobs(jobs);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/GetGovJobs",method=RequestMethod.GET)
	@ResponseBody
	public List<Jobs> GetGovJobList()
	{
		List<Jobs> jobList=null;
		
		JobsDao obj=new JobsDao();	
		jobList = obj.GetGovJobList();
		
		return jobList;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/GetPrivateJobs",method=RequestMethod.GET)
	@ResponseBody
	public List<Jobs> GetPrivateJobList()
	{
		List<Jobs> jobList=null;
		
		JobsDao obj=new JobsDao();	
		jobList = obj.GetPrivateJobList();
		
		return jobList;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/GetDefenceJobs",method=RequestMethod.GET)
	@ResponseBody
	public List<Jobs> GetDefenceJobList()
	{
		List<Jobs> jobList=null;
		
		JobsDao obj=new JobsDao();	
		jobList = obj.GetDefenceJobList();
		
		return jobList;
	}
	
	
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/GetBankJobs",method=RequestMethod.GET)
	@ResponseBody
	public List<Jobs> GetBankJobList()
	{
		List<Jobs> jobList=null;
		
		JobsDao obj=new JobsDao();	
		jobList = obj.GetBankJobList();
		
		return jobList;
	}
	
	
	
	
	
	
	
}
