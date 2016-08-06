package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.FilmDao;
import com.entities.Film;

public class FilmImpl implements FilmDao{

	public ResultSet select(Connection conn) throws SQLException {
		String sql="select f.film_id,f.title,f.description,l.name from film f, language l where f.language_id = l.language_id";
		PreparedStatement ps = conn.prepareStatement(sql);
		return ps.executeQuery();		
	}

	public void insert(Connection conn, Film film) throws SQLException {
		String sql = "insert into film(title,description,language_id) values (?,?,?)";
		PreparedStatement ps =conn.prepareStatement(sql);
		ps.setString(1, film.getTitle());
		ps.setString(2, film.getDesc());
		ps.setLong(3, film.getLanguage());
		ps.execute();
		
	}

	public void delete(Connection conn, Film film) throws SQLException {
		String sql = "delete from film where film_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, film.getFilm_id());
		ps.execute();		
	}

}
