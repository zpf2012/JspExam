package com.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.impl.FilmImpl;
import com.entities.Film;
import com.util.ConnectionFactory;

public class NewFilm {
	public boolean addfilm(Film film){
		Connection conn = ConnectionFactory.getInstance().makeConn();
		FilmImpl fi = new FilmImpl();
		try {
			conn.setAutoCommit(false);
			fi.insert(conn, film);
			conn.close();
			conn.commit();
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
