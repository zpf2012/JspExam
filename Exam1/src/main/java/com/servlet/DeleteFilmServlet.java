package com.servlet;

import java.io.IOException;
import java.security.interfaces.RSAKey;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Film;
import com.service.DeleteFilm;

/**
 * Servlet implementation class DeleteFilmServlet
 */
public class DeleteFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilmServlet() {
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
		String id = request.getParameter("id");
		System.out.println(id);
		Film film = new Film();
		film.setFilm_id(Integer.parseInt(id));
		DeleteFilm df = new DeleteFilm();
		if(df.delete(film)){
			request.setAttribute("delete", "success");
			forword = "/success.jsp";
		}else{
			request.setAttribute("delete", "fail");
			forword = "/fail.jsp";
		}		
		rd = request.getRequestDispatcher(forword);
		rd.forward(request, response);
		
	}

}
