/**
 * The integral project in the com.anthony.service package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * The <strong>LoginService</strong> type.
 * <p>
 * Provides services for logging in to the banking application.
 * </p>
 * 
 * @author ireap
 * @since Jun 22, 2019
 */

@Service
public class LoginService {

	private static final Logger LOGGER = Logger.getLogger(LoginService.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean authenticateLogin(final String username, final String password) {
		LoginService.LOGGER.info(jdbcTemplate != null ? "JDBC TEMPLATE NOT NULL" : "JDBC TEMPLATE NULL");

		try {
			final Integer i = this.jdbcTemplate.queryForObject(
					"SELECT count(*) FROM int_user WHERE username = '" + username + "' AND pass_hash = '" + password + "'", Integer.class);
			
			return i != 0 ? true : false;
		} catch (final Exception e) {
			LoginService.LOGGER.error(e);
		}
		return false;
	}
	
	/**
	 * Check if a particular user exists.
	 * @return		Returns true or false.
	 * @see         If needed.
	 */
	public boolean checkUserExists(final String username) {
		try {
			final Integer i = this.jdbcTemplate.queryForObject(
					"SELECT count(*) FROM int_user WHERE username = '" + username + "'", Integer.class);
			
			return i != 0 ? true : false;
		} catch (final Exception e) {
			LoginService.LOGGER.error(e);
		}
		return false;
	}
	/** 
	 * Checks to see if the queries are working.
	 * <p>
	 * Only useful before very long cycles of queries.
	 * </p>
	 * @return		If it succeeded.
	 */
	public boolean check() {
		final Integer i = this.jdbcTemplate.queryForObject(
				"select count(*) from dual", Integer.class);
		
		if (i == 1) {
			return true;		
		} else {
			return false;
		}
	}

}
