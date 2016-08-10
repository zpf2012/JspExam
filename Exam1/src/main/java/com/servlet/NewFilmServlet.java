package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.UpdateFilmImpl;
import com.entities.Film;
import com.service.NewFilm;

/**
 * Servlet implementation class NerFilmServlet
 */
public class NewFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewFilmServlet() {
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
		Film film = new Film();
//		film.setFilm_id(Integer.parseInt(request.getParameter("film_id")));
		film.setTitle(request.getParameter("title"));
		film.setDesc(request.getParameter("desc"));
		film.setLanguage_name(request.getParameter("language"));
		
		NewFilm nf = new NewFilm();
		if(nf.addfilm(film)){
			forword = "/success.jsp";
		}else{
			forword = "/fail.jsp";
		}
			
		rd = request.getRequestDispatcher(forword);
		rd.forward(request, response);		
	}

}
