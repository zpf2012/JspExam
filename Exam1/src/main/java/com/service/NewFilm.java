package com.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.impl.FilmImpl;
import com.entities.Film;
import com.util.ConnectionFactory;

public class NewFilm {
	public void addfilm(Film film){
		Connection conn = ConnectionFactory.getInstance().makeConn();
		FilmImpl fi = new FilmImpl();
		try {
			fi.insert(conn, film);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
