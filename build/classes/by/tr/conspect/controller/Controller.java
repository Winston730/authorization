package by.tr.conspect.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public by.tr.conspect.bean.User user = new by.tr.conspect.bean.User();
	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		by.tr.conspect.bean.User user = new by.tr.conspect.bean.User();
		
		user.setLogin(request.getParameter("login"));
		user.setPass(request.getParameter("password"));
		user.setSurname(request.getParameter("surname"));
		user.setName(request.getParameter("name"));
		
		session.setAttribute("user", user);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	}

}
