package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;

public class LoginDAO {
	public static boolean insert(Connection connection,LoginBO lbo,RegisterBO rgbo) throws SQLException {
		LoginDAO ldao = new LoginDAO();
		
		boolean status = false;
		Statement st = connection.createStatement();
		String name=lbo.getUname();
		String password=lbo.getPwd();
		ResultSet result = st.executeQuery("select * from reg where uname='"+name+"' AND password='"+password+"'");
		{
		if(result.next()) {
			 
			 status = true;
			 
			 rgbo.setFname(result.getString("fname"));
			 rgbo.setLname(result.getString("lname"));
			 rgbo.setName(result.getString("uname"));
			 rgbo.setEmail(result.getString("email"));
			 rgbo.setNumber(result.getString("number"));
			 }
		  else {
			  
			  status = false;
			}
		return status;
		} 
}
}
