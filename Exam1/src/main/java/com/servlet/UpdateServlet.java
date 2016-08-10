package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.impl.UpdateFilmImpl;
import com.entities.Film;
import com.fm.CreateHtml;
import com.util.ConnectionFactory;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		Connection conn = ConnectionFactory.getInstance().makeConn();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		String id = request.getParameter("id");
		Film film = new Film();
		film.setFilm_id(Integer.parseInt(id));
		ResultSet rs = null;
		UpdateFilmImpl ufi = new UpdateFilmImpl();
		CreateHtml ch = new CreateHtml();
		try {
			rs = ufi.select(conn, film);
			while(rs.next()){
				ch.create(rs.getString("title"), rs.getString("description"), rs.getString("name"));
			}	
			conn.close();
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		response.sendRedirect("/Update.html");
		
	}

}
