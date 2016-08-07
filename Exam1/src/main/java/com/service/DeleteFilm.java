package com.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.impl.FilmImpl;
import com.entities.Film;
import com.util.ConnectionFactory;

public class DeleteFilm {
	public boolean delete(Film film){
		Connection conn = ConnectionFactory.getInstance().makeConn();
		FilmImpl fi = new FilmImpl();
		try {
			conn.setAutoCommit(false);
			fi.delete(conn, film);
			conn.commit();
			conn.close();
			return true;
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return false;
	}
}
