package com.JavaEmploymentTimes.Model;

import java.sql.Date;

public class Subscriptions {
	private int subId;
	private String subName;
	private String subDes;
	private String subStartDate;
	private String subEndDate;
	private String subAmount;
	private String subValidFor;
	private String subTimeDuration;
private String ipAddress;
	
	private String delInd;
	private String updateUser;
	private Date updateDate;
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubDes() {
		return subDes;
	}
	public void setSubDes(String subDes) {
		this.subDes = subDes;
	}
	public String getSubStartDate() {
		return subStartDate;
	}
	public void setSubStartDate(String subStartDate) {
		this.subStartDate = subStartDate;
	}
	public String getSubEndDate() {
		return subEndDate;
	}
	public void setSubEndDate(String subEndDate) {
		this.subEndDate = subEndDate;
	}
	public String getSubAmount() {
		return subAmount;
	}
	public void setSubAmount(String subAmount) {
		this.subAmount = subAmount;
	}
	public String getSubTimeDuration() {
		return subTimeDuration;
	}
	public void setSubTimeDuration(String subTimeDuration) {
		this.subTimeDuration = subTimeDuration;
	}
	public String getSubValidFor() {
		return subValidFor;
	}
	public void setSubValidFor(String subValidFor) {
		this.subValidFor = subValidFor;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
