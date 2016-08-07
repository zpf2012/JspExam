package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.LanguageDao;

public class LanguageImpl implements LanguageDao{

	public ResultSet select(Connection conn) throws SQLException {
		String sql = "select name from language";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}

}
