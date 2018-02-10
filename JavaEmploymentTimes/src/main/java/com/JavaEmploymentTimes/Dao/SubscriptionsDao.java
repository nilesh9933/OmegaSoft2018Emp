package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Subscriptions;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class SubscriptionsDao implements ISubscriptionsDao{

	
	private Connection con;
	public SubscriptionsDao() {
		this.con=DBConnection.GetConnection();
	}

	
	
	@Override
	public String AddSubscription(Subscriptions subscriptions) {
		// TODO Auto-generated method stub
		
		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement("insert into Subscriptions (subId,subName,subDes ,subStartDate, subEndDate, subAmount, subValidFor,subTimeDuration,delInd,updateUser,updateDate,ipAddress) values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
			pre.setInt(1, subscriptions.getSubId());
			pre.setString(2, subscriptions.getSubName());
			pre.setString(3, subscriptions.getSubDes());
			pre.setString(4, subscriptions.getSubStartDate());
			pre.setString(5, subscriptions.getSubEndDate());
			pre.setString(6,subscriptions.getSubAmount());
			pre.setString(7, subscriptions.getSubValidFor());
			pre.setString(8, subscriptions.getSubTimeDuration());
			pre.setString(9,"N");
			pre.setString(10, subscriptions.getUpdateUser());
			pre.setDate(11, subscriptions.getUpdateDate());
			pre.setString(12, subscriptions.getIpAddress());
		
		
			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			output = "Data not inserted .";
			e.printStackTrace();
		}

		return output;
	}

	@Override
	public String UpdateSubscription(Subscriptions subscriptions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteSubscription() {
		// TODO Auto-generated method stub
		return null;
	}

}
