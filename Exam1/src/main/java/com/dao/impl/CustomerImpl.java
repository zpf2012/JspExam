package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.CustomerDao;
import com.entities.Customer;

public class CustomerImpl implements CustomerDao{
	public ResultSet select(Connection conn, Customer customer) throws SQLException{
		String sql = "select first_name from customer where first_name =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, customer.getName());
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
