package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Customer;
import com.service.CheckLogin;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding(request.getCharacterEncoding());
		String user = request.getParameter("customer");
		Customer customer = new Customer();
		CheckLogin check = new CheckLogin();
		customer.setName(user);
		boolean success = check.check(customer);
		
		RequestDispatcher rd = null;
		String forword = null;
		if(success == true){
			forword="/success.jsp";
			rd = request.getRequestDispatcher(forword);
			rd.forward(request, response);
		}else{
			forword="/error.jsp";
			rd = request.getRequestDispatcher(forword);
			rd.forward(request, response);
		}
		
	}

}
