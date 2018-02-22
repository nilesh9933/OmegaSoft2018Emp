package com.JavaEmploymentTimes.Dao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;

import com.JavaEmploymentTimes.Model.Epaperpost;
import com.JavaEmploymentTimes.Utils.ConstantsClass;
import com.JavaEmploymentTimes.Utils.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class EpaperPostDao implements IEpaperPostDao {
	private Connection con;

	public EpaperPostDao() {

		this.con = DBConnection.GetConnection();
	}

	@Override
	public String AddEpaperPost(Epaperpost ePaperPost) {
		String output = "";
		String sharePath = "F:\\JavaGit\\NewMaster\\OmegaSoft2018EMP\\JavaEmploymentTimes\\src\\main\\resources\\static\\upload\\";

		try {
			PreparedStatement pre = con.prepareStatement(ConstantsClass.ePaperPostSQL);

			pre.setInt(1, ePaperPost.getpId());
			pre.setString(2, ePaperPost.getpTitle());
			pre.setString(3, ePaperPost.getpDes());
			pre.setString(4, ePaperPost.getpPostDate());
			pre.setString(5, ePaperPost.getpStartDate());
			pre.setString(6, ePaperPost.getpEndDate());

			if (!ePaperPost.getUpload().isEmpty()) {
				pre.setString(7, "/upload/" + ePaperPost.getUpload().getOriginalFilename());
			}
			pre.setString(8, "N");
			pre.setString(9, ePaperPost.getIpAddress());
			pre.setString(10, ePaperPost.getUpdateUser());
			pre.setDate(11, ePaperPost.getUpdateDate());
			pre.executeUpdate();
			SaveDocumentsOnSharePath(ePaperPost.getUpload(),sharePath);
			output = "Data has been inserted successfully.";
		} catch (Exception e) {
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

	private void SaveDocumentsOnSharePath(MultipartFile file,String sharePath) {
		
		try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				Path path = Paths.get(sharePath + file.getOriginalFilename());
				Files.write(path, bytes);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Epaperpost> GetEPaperDetails() {
		List<Epaperpost> list = new ArrayList<Epaperpost>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(ConstantsClass.getePaperDetailsSQL);
			while (rs.next()) {
				Epaperpost obj=new Epaperpost();
				obj.setpId(rs.getInt("pId"));
				obj.setpTitle(rs.getString("pTitle"));
				obj.setpDes(rs.getString("pDes"));
				obj.setpPostDate(rs.getString("pPostDate"));
				obj.setpStartDate(rs.getString("pStartDate"));
				obj.setpEndDate(rs.getString("pEndDate"));
				obj.setpSharePath(rs.getString("pSharePath"));
			
				list.add(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
