/**
 * The integral project in the com.anthony.service package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.service;

import org.jboss.logging.Logger;
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

	private boolean buildQuery(final String username, final String password) {
		return false;
	}


	public boolean userExists(final String username, final String password) {
		return false;
	}

}
