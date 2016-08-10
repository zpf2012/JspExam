package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UpdateFilmDao;
import com.entities.Film;

public class UpdateFilmImpl implements UpdateFilmDao{

	public ResultSet select(Connection conn, Film film) throws SQLException {
		String sql = "select f.film_id,f.title,f.description,l.name from film f, language l where f.language_id = l.language_id and film_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, film.getFilm_id());
		ResultSet rs = ps.executeQuery();
		return rs;
	}

}
