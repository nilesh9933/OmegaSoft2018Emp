package com.JavaMaharashtraAutoService.Util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.JavaMaharashtraAutoService.Model.Log;

public class Logger {

	static Connection con;

	public Logger() {
		con = MySQLConnection.GetConnection();
	}

	public static void WriteLog(Log log) {
		try {

			PreparedStatement pre = con.prepareStatement("insert into log (eventName,eventDate,errorMessage,eventType,updateUser,updateDate) values(?,?,?,?,?,?)");
			Date curDate = new Date(0);
			String user="Abhishek";
			pre.setString(1, log.getEventName());
			pre.setDate(2, curDate);
			pre.setString(3, log.getEventMessage());
			pre.setString(4, log.getEventType());
			pre.setString(5, user);
			pre.setDate(6, curDate);
			pre.executeQuery();
		} catch (Exception e) {

		}
	}

}
