package org.tms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tms.beans.User;
import org.tms.dao.UserDao;
import org.tms.dao.UserDaoImpl;


@WebServlet("/LoginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserDao dao=new UserDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId=Integer.parseInt(request.getParameter("userId"));
		String password=request.getParameter("password");
		User user=new User();
		user.setUserId(userId);
		user.setPassword(password);
		
		if(dao.validateUser(user))
		{
			HttpSession session=request.getSession();
			session.setAttribute("uname", user.getUserId());
			session.setAttribute("pass", user.getPassword());
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			response.sendRedirect("index.html");
		}
		
		
	}

}
