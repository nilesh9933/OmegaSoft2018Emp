package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.JavaEmploymentTimes.Model.Offers;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class OffersDao implements IOffersDao
{
	Connection con;
	
	public OffersDao()
	{
		con = DBConnection.GetConnection();
	}
	
	public String AddOffers(Offers off)
	{
		String output = "";
		try
		{
			PreparedStatement pre = con.prepareStatement("insert into offer(couCode,couAmount,couStartDate,couEndDate,delInd,updateUser,updateDate,ipAddress)values(?,?,?,?,?,?,?,?)");
			pre.setString(1,off.getCouCode());
			pre.setFloat(2, off.getCouAmount());
			pre.setDate(3, off.getCouStartDate());
			pre.setDate(4, off.getCouEndDate());
			pre.setString(5, ("N"));
			pre.setString(6, off.getUpdateUser());
			pre.setDate(7, off.getUpdateDate());
			pre.setString(8, off.getIpAddress());
			
		
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return output;

	}
	
	@Override
	public String UpdateOffers(Offers off) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String DeleteOffers() {
		// TODO Auto-generated method stub
		return "";
	}

}
