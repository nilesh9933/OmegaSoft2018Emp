package com.JavaEmploymentTimes.Utils;

public class ConstantsClass {
	public static String ePaperPostSQL = "insert into epaperpost (pId,pTitle,pDes,pPostDate,pStartDate,pEndDate,pSharePath,delInd,ipAddress,updateUser,updateDate) values(?,?,?,?,?,?,?,?,?,?,?)";
	public static String getePaperDetailsSQL = "select pId,pTitle,pDes,pPostDate,pStartDate,pEndDate,pSharePath from epaperpost where delInd='N'";
}
