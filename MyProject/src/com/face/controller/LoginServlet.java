package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.utility.ConnectionManager;
import java.util.*;
/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("password");
		LoginBO lbo = new LoginBO();
		RegisterBO rgbo = new RegisterBO();
		LoginDAO ldao = new LoginDAO();
		lbo.setUname(uname);
		lbo.setPwd(pwd);
		boolean status = false;
		ConnectionManager con = new ConnectionManager();
		try {
		   status=LoginDAO.insert(con.getConnection(),lbo,rgbo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if(status==true) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Please Register");
		}*/
			
		boolean check = false;
		try {
			check = LoginDAO.insert(con.getConnection(),lbo,rgbo);
			
			List loglist = new ArrayList();
			loglist.add(rgbo.getFname());
			loglist.add(rgbo.getLname());
			loglist.add(rgbo.getName());
			loglist.add(rgbo.getEmail());
			loglist.add(rgbo.getNumber());
			request.setAttribute("user", check);
			request.setAttribute("li", loglist);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			if(dispatcher != null) {
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}


