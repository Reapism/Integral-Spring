package com.anthony.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.anthony.beans.DBProperties;
import com.anthony.beans.User;

public class AuthorizeUser {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final Logger LOGGER = Logger.getLogger(AuthorizeUser.class);
	
	
	/** 
	 * Returns the url to go to based on
	 * the username arg. 
	 * <p>
	 * Returns the url to either a customer or employee
	 * page, null if the username doesn't exist or failed.
	 * </p>
	 * @return		The page to go to.
	 */
	public String authorize(String username) {
		String role = null;
		
		try {
			
		} catch (Exception e) {
			LOGGER.error(e);
		}
		
		return role;
		
	}
	
	public User authenticateUser(String username, String password) {
		try {
			User result = jdbcTemplate.queryForObject("select count(*) from int_user where username = " + username + " and password = " + password + ";", User.class);
			return result;
		} catch (Exception e) {
			LOGGER.error(e);
			return null;
		}
		
	}		
}