package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Film;

public interface UpdateFilmDao {
	public ResultSet select(Connection conn, Film film) throws SQLException;

}
