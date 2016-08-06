package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.impl.FilmImpl;
import com.util.ConnectionFactory;

public class FilmInfo {
	public ResultSet getInfo() throws SQLException{
		Connection conn = ConnectionFactory.getInstance().makeConn();
		FilmImpl fi = new FilmImpl();		
		ResultSet rs = fi.select(conn);
		return rs;
	}
}
