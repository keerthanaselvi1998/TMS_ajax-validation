package org.tms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tms.dao.UserDao;
import org.tms.dao.UserDaoImpl;

/**
 * Servlet implementation class DbCheck
 */
@WebServlet("/DbCheck")
public class DbCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  	
    UserDao dao=new UserDaoImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String msg="";
		int uid=Integer.parseInt(request.getParameter("userId"));
		if(dao.registrationValidation(uid))
		{
			msg=msg+" user allready existed with id "+uid;
			
		}
		out.println(msg);
		
		
		
	}

}
