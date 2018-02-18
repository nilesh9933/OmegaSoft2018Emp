package com.JavaEmploymentTimes.Model;

import java.sql.Date;

public class Offers {
	private int couId;
	private String couCode;
	private Float couAmount;
	public String getCouCode() {
		return couCode;
	}
	public void setCouCode(String couCode) {
		this.couCode = couCode;
	}
	public Float getCouAmount() {
		return couAmount;
	}
	public void setCouAmount(Float couAmount) {
		this.couAmount = couAmount;
	}
	public Date getCouStartDate() {
		return couStartDate;
	}
	public void setCouStartDate(Date couStartDate) {
		this.couStartDate = couStartDate;
	}
	public Date getCouEndDate() {
		return couEndDate;
	}
	public void setCouEndDate(Date couEndDate) {
		this.couEndDate = couEndDate;
	}
	public String getDelInd() {
		return delInd;
	}
	public void setDelInd(String delInd) {
		this.delInd = delInd;
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
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public void setCouId(int couId) {
		this.couId = couId;
	}
	private Date couStartDate;
	private Date couEndDate;
	private String delInd;
	private String updateUser;
	private Date updateDate;
	private String ipAddress;
	public int getCouId() {
		return couId;
	}
	
}
