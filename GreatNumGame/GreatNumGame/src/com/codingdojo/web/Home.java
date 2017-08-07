package com.codingdojo.web;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// when the client click on the botton keep tracking how many time he clicks and store the data
		HttpSession session = request.getSession();
		
		if (session.getAttribute("randomNumber") == null) {
			Random random = new Random();
			int randomNumber = random.nextInt(100) + 1;
			session.setAttribute("randomNumber", randomNumber);
			request.setAttribute("randomNumber", randomNumber);			
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if (request.getParameter("guess") != null) {
			int guess = Integer.parseInt(request.getParameter("guess"));
			session.setAttribute("guess", guess);
		}
		else {
			session.setAttribute("guess", null);
			session.setAttribute("randomNumber", null);	
		}
		
		response.sendRedirect("/GreatNumGame/Home");
		
		
		
	}

}
