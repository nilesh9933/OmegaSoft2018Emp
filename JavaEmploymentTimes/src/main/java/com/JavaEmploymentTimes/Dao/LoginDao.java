package com.JavaEmploymentTimes.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.JavaEmploymentTimes.Model.Login;
import com.JavaEmploymentTimes.Utils.DBConnection;

public class LoginDao implements ILoginDao{
	private Connection con;
	public LoginDao () {
		this.con=DBConnection.GetConnection();
	}

	@Override
	public String AddLogin(Login login) {
		// TODO Auto-generated method stub
		//String username, password;

		String output = "";
		try {
			
			/*username = request.getParameter("UserFirstName");
			password = request.getParameter("getUserPassword");
*/
			PreparedStatement pre = con.prepareStatement("SELECT UserFirstName,getUserPassword FROM Users WHERE UserFirstName=? and getUserPassword=?");
					
			pre.setString(1,login.getUserFirstName());;
			pre.setString(2, login.getUserPassword());
			pre.executeUpdate();
		
			/*if(pre.next()) {
				output = "Data has been login successfully.";
	
				
				
			}*/
			}
		
		
	
		 catch (Exception e) {
				output = "sorry";
				e.printStackTrace();
			}	
		return output;
}
	}
