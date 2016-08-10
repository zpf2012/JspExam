package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.impl.LanguageImpl;
import com.util.ConnectionFactory;


public class GetLanguage {
	public ResultSet getlanguage() throws SQLException{
		Connection conn = ConnectionFactory.getInstance().makeConn();
		LanguageImpl li = new LanguageImpl();
		ResultSet rs = li.select(conn);
		
		return rs;
	}
}