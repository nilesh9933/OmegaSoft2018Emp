package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaEmploymentTimes.Model.Jobs;
import com.JavaEmploymentTimes.Utils.DBConnection;


public class JobsDao implements IJobsDao{
	private Connection con;
	public JobsDao() {
		this.con=DBConnection.GetConnection();
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
			
			pre.setString(8,"N");
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
	
	public List<Jobs> GetGovJobList()
	{
		List<Jobs> jobList=new ArrayList<Jobs>();
		
		try
		{
			String sql="SELECT jobId, jobTitle, jobType,jobLogoPath \r\n" + 
					   "FROM empdb.jobs where delInd='N' and jobType='Government'";
		
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {	
				
				Jobs obj=new Jobs();				
				obj.setJobId(Integer.parseInt( rs.getString("jobId")));
				obj.setJobTitle(rs.getString("jobTitle"));
				obj.setJobType(rs.getString("jobType"));
				obj.setJobLogoPath(rs.getString("jobLogoPath"));
				
				jobList.add(obj);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return jobList;
		
	}

	public List<Jobs> GetPrivateJobList()
	{
		List<Jobs> jobList=new ArrayList<Jobs>();
		
		try
		{
			String sql="SELECT jobId, jobTitle, jobType,jobLogoPath \r\n" + 
					   "FROM empdb.jobs where delInd='N' and jobType='Private'";
		
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {	
				
				Jobs obj=new Jobs();				
				obj.setJobId(Integer.parseInt( rs.getString("jobId")));
				obj.setJobTitle(rs.getString("jobTitle"));
				obj.setJobType(rs.getString("jobType"));
				obj.setJobLogoPath(rs.getString("jobLogoPath"));
				
				jobList.add(obj);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return jobList;
		
	}

	
	public List<Jobs> GetDefenceJobList()
	{
		List<Jobs> jobList=new ArrayList<Jobs>();
		
		try
		{
			String sql="SELECT jobId, jobTitle, jobType,jobLogoPath \r\n" + 
					   "FROM empdb.jobs where delInd='N' and jobType='Defence'";
		
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {	
				
				Jobs obj=new Jobs();				
				obj.setJobId(Integer.parseInt( rs.getString("jobId")));
				obj.setJobTitle(rs.getString("jobTitle"));
				obj.setJobType(rs.getString("jobType"));
				obj.setJobLogoPath(rs.getString("jobLogoPath"));
				
				jobList.add(obj);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return jobList;
		
	}

		
	public List<Jobs> GetBankJobList()
	{
		List<Jobs> jobList=new ArrayList<Jobs>();
		
		try
		{
			String sql="SELECT jobId, jobTitle, jobType,jobLogoPath \r\n" + 
					   "FROM empdb.jobs where delInd='N' and jobType='Bank'";
		
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {	
				
				Jobs obj=new Jobs();				
				obj.setJobId(Integer.parseInt( rs.getString("jobId")));
				obj.setJobTitle(rs.getString("jobTitle"));
				obj.setJobType(rs.getString("jobType"));
				obj.setJobLogoPath(rs.getString("jobLogoPath"));
				
				jobList.add(obj);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return jobList;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
