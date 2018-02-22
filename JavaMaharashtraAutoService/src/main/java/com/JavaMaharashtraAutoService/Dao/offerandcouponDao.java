package com.JavaMaharashtraAutoService.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaMaharashtraAutoService.Model.offerandcoupon;
import com.JavaMaharashtraAutoService.Util.ConstantsClass;
import com.JavaMaharashtraAutoService.Util.MySQLConnection;

public class offerandcouponDao implements IofferandcouponDao
{
	Connection con;

	public offerandcouponDao() 
	{
		con = MySQLConnection.GetConnection();
	}

	public String Addofferandcoupon(offerandcoupon offcou) 
	{
		String output = "";
		try 
		{
			PreparedStatement pre = con.prepareStatement(ConstantsClass.OfferInsertSQL);
		
			pre.setString(1, offcou.getOffCode());
			pre.setString(2, offcou.getOffStartDate());
			pre.setString(3, offcou.getOffEndDate());
			pre.setString(4, offcou.getOffDes());
			pre.setString(5, offcou.getOffType());
			pre.setFloat(6, offcou.getOffAmt());
			pre.setString(7, ("N"));
			pre.setString(8, offcou.getUpdateUser());
			pre.setDate(9, offcou.getUpdateDate());
			
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
	public String Updateofferandcoupon(offerandcoupon offcou) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String Deleteofferandcoupon() {
		// TODO Auto-generated method stub
		return "";
	}
}