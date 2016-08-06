package com.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.FilmInfo;

/**
 * Servlet implementation class FilmServlet
 */
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
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
		RequestDispatcher rd = null;
		String forword = null;
		FilmInfo fi = new FilmInfo();
		Object [][] obj = null;
		try {
			ResultSet rs = fi.getInfo();			
			for(int i = 0; rs.next(); i++){				
				obj[i][0] = rs.getInt("film_id");
				obj[i][1] = rs.getString("title");
				obj[i][0] = rs.getString("description");
				obj[i][1] = rs.getString("name");
			
			}
			request.setAttribute("film", obj);
			forword = "/film.jsp";
			rd = request.getRequestDispatcher(forword);
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
