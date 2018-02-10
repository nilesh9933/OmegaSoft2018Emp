package com.JavaEmploymentTimes.Model;

import java.sql.Date;

public class Epaperpost {
	private int pId;
	private String pTitle;
	private String pDes;
	private String pPostDate;
	private String pStartDate;
	private String pEndDate;
	private String pSharePath;
	private String delInd;
	private String ipAddress;
	private String updateUser;
	private Date updateDate;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}
	public String getpPostDate() {
		return pPostDate;
	}
	public void setpPostDate(String pPostDate) {
		this.pPostDate = pPostDate;
	}
	public String getpStartDate() {
		return pStartDate;
	}
	public void setpStartDate(String pStartDate) {
		this.pStartDate = pStartDate;
	}
	public String getpEndDate() {
		return pEndDate;
	}
	public void setpEndDate(String pEndDate) {
		this.pEndDate = pEndDate;
	}
	public String getpSharePath() {
		return pSharePath;
	}
	public void setpSharePath(String pSharePath) {
		this.pSharePath = pSharePath;
	}
	public String getDelInd() {
		return delInd;
	}
	public void setDelInd(String delInd) {
		this.delInd = delInd;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
