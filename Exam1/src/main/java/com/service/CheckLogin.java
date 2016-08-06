package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Customer;
import com.util.ConnectionFactory;
import com.dao.impl.CustomerImpl;

public class CheckLogin {
	public boolean check(Customer customer) {
		CustomerImpl ci = new CustomerImpl();
		Connection conn = ConnectionFactory.getInstance().makeConn();
		try {
			ResultSet rs = ci.select(conn, customer);
			while(rs.next()){
				return true;
			}	
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
