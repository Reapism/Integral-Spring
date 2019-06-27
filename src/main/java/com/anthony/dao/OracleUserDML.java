/**
 * The integralspring project in the com.anthony.dao package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.dao;

import java.sql.Connection;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.jboss.logging.Logger;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.anthony.beans.User;

/**
 * The <strong>OracleUserDML</strong> type.
 * <p>
 * Grabs oracle connection properties from the application.properties.
 * Implements IUserDML.
 * </p>
 * 
 * @author ireap
 * @since Jun 23, 2019
 */
@Component
public class OracleUserDML implements IUserDML {

	private static final Logger LOGGER = Logger.getLogger(OracleUserDML.class);

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see com.anthony.dao.IUserDML#addUser(java.lang.String,
	 * java.lang.String).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public boolean addUser(final String username, final String password) {
		final Connection c = getConnection();
		if (c != null) {
			OracleUserDML.LOGGER.info("");
		}
		return false;
	}

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see com.anthony.dao.IUserDML#getConnection().
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see com.anthony.dao.IUserDML#getUser(java.lang.String).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public User getUser(final String username) {
		final Connection c = getConnection();
		if (c != null) {

		}
		return null;
	}

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see com.anthony.dao.IUserDML#removeUser(java.lang.String).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public boolean removeUser(final String username) {
		final Connection c = getConnection();
		if (c != null) {

		}
		return false;
	}

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see com.anthony.dao.IUserDML#updateUser(java.lang.String,
	 * java.lang.Object).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public boolean updateUser(final String username, final Object o) {
		final Connection c = getConnection();
		if (c != null) {

		}
		return false;
	}

}
