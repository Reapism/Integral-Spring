/**
 * The integral project in the com.anthony.controller package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.anthony.service.LoginService;

/**
 * The <strong>LoginController</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author ireap
 * @since Jun 17, 2019
 */
@RestController
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	private final LoginService loginService;

	public LoginController() {
		this.loginService = new LoginService();
	}

	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
	 * displayALogin() { return "logins"; }
	 */

	@GetMapping("/login")
	public ModelAndView displayLogin() {
		final ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("message", "Hello");
		return modelAndView;
	}


	@PostMapping("/login")
	public ModelAndView displayLogin(@RequestParam final String username, @RequestParam final String password) {
		final ModelAndView modelAndViewSuccess = new ModelAndView("home");
		modelAndViewSuccess.addObject("message", "Hello");

		final ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("message", "Hello");

		if (username != null && password != null) {
			if (this.loginService.userExists(username, password)) {
				LoginController.LOGGER.info(username +  " exists!");
				return modelAndViewSuccess;
			}
		}

		LoginController.LOGGER.info("failure");
		return modelAndView;
	}

}
