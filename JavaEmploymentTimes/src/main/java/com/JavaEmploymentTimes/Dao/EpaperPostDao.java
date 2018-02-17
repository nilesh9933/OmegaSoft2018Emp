package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;

import com.JavaEmploymentTimes.Model.Epaperpost;
import com.JavaEmploymentTimes.Utils.DBConnection;
import java.sql.PreparedStatement;

public class EpaperPostDao implements IEpaperPostDao {
	private Connection con;
	public EpaperPostDao() {
		
		this.con=DBConnection.GetConnection();
	}
@Override
public String AddEpaperPost(Epaperpost ePaperPost) {
	String output="";
	try
	{
		PreparedStatement pre = con.prepareStatement("insert into epaperpost (pId,pTitle,pDes,pPostDate,pStartDate,pEndDate,pSharePath,delInd,ipAddress,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?,?)");
		
		pre.setInt(1, ePaperPost.getpId());
		pre.setString(2, ePaperPost.getpTitle());
		pre.setString(3,ePaperPost.getpDes());
		pre.setString(4, ePaperPost.getpPostDate());
		pre.setString(5, ePaperPost.getpStartDate());
		pre.setString(6, ePaperPost.getpEndDate());
		pre.setString(7, ePaperPost.getpSharePath());
		
		pre.setString(8,"N");
		pre.setString(9, ePaperPost.getIpAddress());
		pre.setString(10, ePaperPost.getUpdateUser());
		pre.setDate(11, ePaperPost.getUpdateDate());
		
		pre.executeUpdate();
		output = "Data has been inserted successfully.";
	}
	catch(Exception e)
	{
		output = "Data not inserted .";
		e.printStackTrace();
		
	}
	return output;
}
@Override
public String UpdateEpaperPost(Epaperpost ePaperPost) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String DeleteEpaperPost() {
	// TODO Auto-generated method stub
	return null;
}
}
