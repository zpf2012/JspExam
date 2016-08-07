package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Film;

public interface FilmDao {
	public ResultSet select(Connection conn)throws SQLException;
	
	public void insert(Connection conn, Film film)throws SQLException;
	
	public void delete(Connection conn, Film film)throws SQLException;
		
}
