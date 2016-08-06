package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.impl.LanguageImpl;
import com.util.ConnectionFactory;


public class GetLanguage {
	public String [] getlanguage() throws SQLException{
		String language [] = null;
		Connection conn = ConnectionFactory.getInstance().makeConn();
		LanguageImpl li = new LanguageImpl();
		ResultSet rs = li.select(conn);
		for(int i = 0; rs.next(); i++){
			language[i] = rs.getString("name");
			System.out.println(language[i]);
		}
		
		return language;
	}
}
