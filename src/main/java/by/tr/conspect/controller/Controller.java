package by.tr.conspect.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public by.tr.conspect.bean.User user = new by.tr.conspect.bean.User();
	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET HERE!!!!!!");
		response.setContentType("text/html");
		
	//	by.tr.conspect.bean.User user = new by.tr.conspect.bean.User();
		user.setName(request.getParameter("name"));
		user.setLogin(request.getParameter("login"));
		user.setPass(request.getParameter("pass"));
		System.out.println(user.getName());
		System.out.println(user.getLogin());
		System.out.println(user.getPass());
		
		request.setAttribute("user", user);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");	
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
	//	by.tr.conspect.bean.User userX = (by.tr.conspect.bean.User) request.getAttribute("user");
		if (user == null){
				processRequest(request,response);
		}
		else {
			System.out.println(request.getParameter("login"));
			System.out.println(user.getLogin());
			System.out.println(request.getParameter("pass"));
			System.out.println(user.getPass());
			if (request.getParameter("login").equals(user.getLogin()) && request.getParameter("pass").equals(user.getPass()))
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/check.jsp");	
				requestDispatcher.forward(request, response);	
			}
			else
			{
				System.out.println("Chtoto wrong");
			}

		
		}

	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("<title>Title</title>");
		out.println("</head><body>");
		out.println("<h1> Вначале зарегистрируйся!!! </h1>");
		out.println("</body></html>");

	}
}
