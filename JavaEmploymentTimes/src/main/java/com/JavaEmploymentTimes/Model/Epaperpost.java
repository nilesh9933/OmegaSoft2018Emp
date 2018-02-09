package com.JavaEmploymentTimes.Model;

import java.sql.Date;

public class Epaperpost {
	private int pId;
	private String pTitle;
	private String pDes;
	private Date pPostDate;
	private Date pStartDate;
	private Date pEndDate;
	private String pSharePath;
	private String delInd;
	private String ipAddress;
	private String updateUser;
	private Date updateDate;

	public int getpId() {
		return pId;
	}

	public String getpTitle() {
		return pTitle;
	}

	public String getpDes() {
		return pDes;
	}

	public Date getpPostDate() {
		return pPostDate;
	}

	public Date getpStartDate() {
		return pStartDate;
	}

	public Date getpEndDate() {
		return pEndDate;
	}

	public String getpSharePath() {
		return pSharePath;
	}

	public String getDelInd() {
		return delInd;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public void setpDes(String pDes) {
		this.pDes = pDes;
	}

	public void setpPostDate(Date pPostDate) {
		this.pPostDate = pPostDate;
	}

	public void setpStartDate(Date pStartDate) {
		this.pStartDate = pStartDate;
	}

	public void setpEndDate(Date pEndDate) {
		this.pEndDate = pEndDate;
	}

	public void setpSharePath(String pSharePath) {
		this.pSharePath = pSharePath;
	}

	public void setDelInd(String delInd) {
		this.delInd = delInd;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
