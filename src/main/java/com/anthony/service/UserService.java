/**
 * The integral project in the com.anthony.service package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.service;

import java.text.MessageFormat;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.anthony.beans.User;

/**
 * The <strong>UserService</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author ireap
 * @since Jun 27, 2019
 */
@Service
public class UserService {

	private static final Logger LOGGER = Logger.getLogger(UserService.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Creates a user based on the User object and a password.
	 * <p>
	 * <b>Note:</b> Password is a separate parameter because 
	 * you should never store a password in any object.
	 * </p>
	 * @return		The return.
	 * @see         If needed.
	 */
	public boolean createUser(final User user, final String password) {
		try {
			final Integer i = this.jdbcTemplate.update(MessageFormat.format(
					"INSERT INTO int_user (" + "username," + "pass_hash," + "email," + "user_role," + "first_name,"
							+ "last_name," + "birth_date," + "phone" + ") VALUES (" + "'{0}'," + "'{1}'," + "'{2}'," + "'{3}',"
							+ "'{4}'," + "'{5}'," + "'{6}'," + "'{7}'," + ");",
					user.getUsername(), password, user.getEmail(), user.getUserRole(), user.getFirstName(),
					user.getLastName(), user.getBirthDate(), user.getPhone()));

			return i != 0 ? true : false;
			
		} catch (final Exception e) {
			
			UserService.LOGGER.error(e);
			return false;
		}
	}

	public boolean deleteUser(final String username, final String password) {

		
		
	}

	public char getUserRole(final String username) {

		
		
	}
}
