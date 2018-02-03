package com.JavaEmploymentTimes.Dao;

import com.JavaEmploymentTimes.Model.Jobs;

public interface IJobsDao {
	String AddJobs(Jobs  jobs);
	String UpdateJobs(Jobs jobs);
	String DeleteJobs();
}
