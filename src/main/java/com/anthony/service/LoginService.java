/**
 * The integral project in the com.anthony.service package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
	JdbcTemplate jdbcTemplate;


	private boolean buildQuery(final String username, final String password) {
		return false;
	}


	public boolean userExists(final String username, final String password) {
		try {
			final int i = this.jdbcTemplate.queryForInt(
					"select count(*) from int_user where username = " + username + " and password = " + password);
			if (i != 0) {
				return true;
			}
		} catch (final Exception e) {
			LoginService.LOGGER.error(e);
		}

		return false;
	}

}
