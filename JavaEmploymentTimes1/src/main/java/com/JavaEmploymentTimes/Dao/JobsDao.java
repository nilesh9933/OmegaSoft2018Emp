package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Jobs;
import com.JavaEmploymentTimes.Util.MySQLConnection;

public class JobsDao implements IJobsDao{
	private Connection con;
	public JobsDao() {
		this.con=MySQLConnection.GetConnection();
	}
	@Override
	public String AddJobs(Jobs jobs) {
		// TODO Auto-generated method stub
		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement("insert into Jobs (jobId,jobTitle,jobDes,jobType,jobStartDate,jobEndDate,jobLogoPath,delInd,ipAddress,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?,?)");
		
			pre.setInt(1,jobs.getJobId());
			pre.setString(2, jobs.getJobTitle());
			pre.setString(3, jobs.getJobDes());
			pre.setString(4, jobs.getJobType());
			pre.setString(5, jobs.getJobStartDate());
			pre.setString(6, jobs.getJobEndDate());
			pre.setString(7, jobs.getJobLogoPath());
			
			pre.setString(8, jobs.getDelInd());
			pre.setString(9,jobs.getIpAddress());
			pre.setString(10, jobs.getUpdateUser());
			pre.setDate(11, jobs.getUpdateDate());
		
		
		
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			output = "Data not inserted .";
			e.printStackTrace();
		}

		return output;
	}

	@Override
	public String UpdateJobs(Jobs jobs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteJobs() {
		// TODO Auto-generated method stub
		return null;
	}

}
