/**
 * The integral project in the com.anthony.controller package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.controller;

import java.text.SimpleDateFormat;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.anthony.beans.User;
import com.anthony.service.UserService;

/**
 * The <strong>UserController</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author ireap
 * @since Jun 27, 2019
 */
@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	public UserController() {

	}

	/**
	 * Show the create account page when the particular url /createaccount is
	 * invoked.
	 * 
	 * @return The model and view from the createaccount.jsp.
	 * @see createaccount.jsp
	 */
	@GetMapping("/createaccount")
	public ModelAndView displayLogin() {
		final ModelAndView modelAndView = new ModelAndView("createaccount");
		modelAndView.addObject("createaccount", "Hello");
		return modelAndView;
	}

	/**
	 * This is invoked when the create account button on the /createaccount page is
	 * clicked.
	 * <p>
	 * This page and function can only create a customer account.
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@PostMapping("/createaccount")
	public ModelAndView displayLogin(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String username, @RequestParam final String password, @RequestParam final String password2,
			@RequestParam String email, @RequestParam final String birthDate, @RequestParam final String phone) {
		
		final ModelAndView modelAndView = new ModelAndView("createaccount");
		final ModelAndView modelAndViewSuccess = new ModelAndView("login");
		modelAndView.addObject("createaccount", "Hello");
		modelAndViewSuccess.addObject("login", "Hello");

		final User user = getUser(firstName.toLowerCase(), lastName.toLowerCase(), username.toLowerCase(), email.toLowerCase(), birthDate, phone);	
		
		if (user == null) {		
			
			modelAndView.addObject("createaccount", "Hello");
			
			UserController.LOGGER.error("The following user is invalid!");
			return modelAndView;
		}

		if (password.equals(password2)) {			
			if (userService.createUser(user, password2)) {
				UserController.LOGGER.info("The following user is valid!");
				
				return modelAndViewSuccess;				
			} else {
				return modelAndView;
			}
		} else {
			modelAndView.addObject("failure", "passwords are not valid!");
			LOGGER.error("Passwords do not match!");
			return modelAndView;
		}
		
	}

	/**
	 * Creates a customer user with the following parameters.
	 * <p>
	 * <b>Note:</b> Password is not part of the user object, its only stored in the
	 * DB for security.
	 * </p>
	 * 
	 * @return A constructed user object.
	 * @see If needed.
	 */
	public User getUser(final String firstName, final String lastName, final String username, final String email,
			final String birthDate, final String phone) {

		final User user = new User(firstName, lastName, username, email, birthDate, phone, 'C');
		
		return user;
//		if (isValidUser(user)) {
//			return user;
//		}
//		return null;
	}

	public boolean isValidBirthDate(final String birthDate) {
		final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			dateFormat.parse(birthDate);
			return true;
		} catch (final Exception e) {
			return false;
		}
	}

	public boolean isValidEmail(final String email) {
		if (email.length() > 50) {
			return false;
		}
		return true;
		//return email.matches("^[\\\\w-_\\\\.+]*[\\\\w-_\\\\.]\\\\@([\\\\w]+\\\\.)+[\\\\w]+[\\\\w]$");
	}

	public boolean isValidName(final String name) {
		if (name.length() > 40) {
			return false;
		}
		return name.matches("^[A-Z][a-z]*$");
	}

	public boolean isValidPhone(final String phone) {
		if (phone.length() > 20) {
			return false;
		}
		return phone.matches("^[0-9]*$");
	}

	public boolean isValidUser(final User user) {
		if (!isValidName(user.getFirstName()) && !isValidName(user.getLastName())) {
			return false;
		}

		if (!isValidEmail(user.getEmail())) {
			return false;
		}

		if (!isValidUsername(user.getUsername())) {
			return false;
		}

		if (!isValidBirthDate(user.getBirthDate())) {
			return false;
		}

		if (!isValidPhone(user.getPhone())) {
			return false;
		}

		return true;
	}

	public boolean isValidUsername(final String username) {
		if (username.length() > 40) {
			return false;
		}
		return username.matches("[a-zA-Z0-9\\._\\-]{3,}");
	}
}
