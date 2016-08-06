package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface LanguageDao {
	public ResultSet select(Connection conn) throws SQLException;

}
