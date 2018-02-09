package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Epaperpost;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class EpaperPostDao implements IEpaperPost {

	private Connection con;
	public EpaperPostDao() {
		this.con = DBConnection.GetConnection();
	}

	@Override
	public String AddEpaperPost(Epaperpost epaper) {

		String output = "";
		try {
			PreparedStatement pre = con.prepareStatement(
					"insert into EpaperPost(pTitle,pDes,pPostDate, pStartDate,pEndDate, pSharePath,delInd,ipAddress,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?);");
			pre.setString(1, epaper.getpTitle());
			pre.setString(2, epaper.getpDes());
			pre.setDate(3, epaper.getpPostDate());
			pre.setDate(4, epaper.getpStartDate());
			pre.setDate(5, epaper.getpEndDate());
			pre.setString(6, epaper.getpSharePath());
			pre.setString(7, "N");
			pre.setString(8, epaper.getIpAddress());
			pre.setString(9, epaper.getUpdateUser());
			pre.setDate(10, epaper.getUpdateDate());

			pre.executeUpdate();
			output = "Data has been inserted successfully.";

		} catch (Exception e) {
			output = "Data not inserted .";
			e.printStackTrace();
		}

		return output;

	}


	@Override
	public String UpdateEpaperPost(Epaperpost epaper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteEpaperPost() {
		// TODO Auto-generated method stub
		return null;
	}

}
