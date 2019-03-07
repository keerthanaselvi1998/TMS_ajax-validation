package org.tms;

import java.io.IOException;



import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tms.beans.Register;
import org.tms.dao.UserDao;
import org.tms.dao.UserDaoImpl;
import org.tms.services.Registerservice;
import org.tms.services.Serviceimpl;

@WebServlet("/Regservlet")
public class Regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Registerservice service=new Serviceimpl();
	 UserDao dao=new UserDaoImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		int uid=Integer.parseInt(request.getParameter("userId"));
		String pass=request.getParameter("password");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String date=request.getParameter("date");
		String vertical=request.getParameter("vertical");
		String Designation=request.getParameter("Designation");
		String Location=request.getParameter("Location");
		String phone=request.getParameter("phone");
		String role=request.getParameter("role");
		boolean res=service.register(new Register(uid,pass,fname,lname,date,vertical,Designation,Location,phone,role));
		System.out.println(res);
		request.setAttribute("registration", res);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		
		
		out.close();
		
		
		
	}
	
}
