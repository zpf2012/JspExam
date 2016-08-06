package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Customer;

public interface CustomerDao {
	public ResultSet select(Connection conn, Customer customer) throws SQLException;
}
