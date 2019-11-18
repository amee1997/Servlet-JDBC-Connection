package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegisterDAO {
	public static void save(Connection connection,RegisterBO regbo) throws SQLException {
		Statement st = connection.createStatement();
		String query="INSERT INTO reg VALUES('"+regbo.getFname()+"','"+regbo.getLname()+"','"+regbo.getName()+"','"+regbo.getPwd()+"','"+regbo.getEmail()+"','"+regbo.getNumber()+"')";
	    int result=st.executeUpdate(query);
	    if(result==1) {
	    	System.out.println("Data inserted Successfully");
	    }
	    else {
	    	System.out.println("Please check");
	    }

   }
}