package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JavaEmploymentTimes.Model.Subscriptions;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class SubscriptionsDao implements ISubscriptionsDao {

	private Connection con;

	public SubscriptionsDao() {
		this.con = DBConnection.GetConnection();
	}

	@Override
	public String AddSubscription(Subscriptions subscriptions) {
		// TODO Auto-generated method stub

		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement(
					"insert into Subscriptions (subId,subName,subDes ,subStartDate, subEndDate, subAmount, subValidFor,subTimeDuration,delInd,updateUser,updateDate,ipAddress) values(?,?,?,?,?,?,?,?,?,?,?,?)");

			pre.setInt(1, subscriptions.getSubId());
			pre.setString(2, subscriptions.getSubName());
			pre.setString(3, subscriptions.getSubDes());
			pre.setString(4, subscriptions.getSubStartDate());
			pre.setString(5, subscriptions.getSubEndDate());
			pre.setInt(6, subscriptions.getSubAmount());
			pre.setString(7, subscriptions.getSubValidFor());
			pre.setString(8, subscriptions.getSubTimeDuration());
			pre.setString(9, "N");
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

	public List<Subscriptions> GetSubscriptions() {
		List<Subscriptions> subList = new ArrayList<Subscriptions>();

		try {
			String sql = "SELECT subId, subName, subDes,subAmount,subValidFor,subTimeDuration \r\n"
					+ ", subStartDate, subEndDate FROM empdb.subscriptions where delInd='N'";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				Subscriptions obj = new Subscriptions();
				obj.setSubId(Integer.parseInt(rs.getString("subId")));
				obj.setSubName(rs.getString("subName"));
				obj.setSubDes(rs.getString("subDes"));
				obj.setSubAmount(Integer.parseInt(rs.getString("subAmount")));
				obj.setSubValidFor(rs.getString("subValidFor"));
				obj.setSubTimeDuration(rs.getString("subTimeDuration"));
				obj.setSubStartDate(rs.getString("subStartDate"));
				obj.setSubEndDate(rs.getString("subEndDate"));
				subList.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return subList;

	}

	public Subscriptions GetSubscriptionDetails(String subId) {
		Subscriptions obj = new Subscriptions();

		try {
			String sql = "SELECT subId, subName, subDes,subAmount,subValidFor,subTimeDuration \r\n"
					+ ", subStartDate, subEndDate FROM empdb.subscriptions where delInd='N' and subId=" + subId + "";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				obj.setSubId(Integer.parseInt(rs.getString("subId")));
				obj.setSubName(rs.getString("subName"));
				obj.setSubDes(rs.getString("subDes"));
				obj.setSubAmount(Integer.parseInt(rs.getString("subAmount")));
				obj.setSubValidFor(rs.getString("subValidFor"));
				obj.setSubTimeDuration(rs.getString("subTimeDuration"));
				obj.setSubStartDate(rs.getString("subStartDate"));
				obj.setSubEndDate(rs.getString("subEndDate"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj;

	}

}
