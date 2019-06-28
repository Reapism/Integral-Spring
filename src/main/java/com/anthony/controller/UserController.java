/**
 * The integral project in the com.anthony.controller package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
*/
package com.anthony.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.anthony.service.LoginService;
import com.anthony.service.UserService;

/**
 * The <strong>UserController</strong> type.
 * 
 * <p>
 * Description
 * </p>
 * 
 * @author 		ireap
 * @since 		Jun 27, 2019
 */
@RestController
public class UserController {

		private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

		@Autowired
		private UserService userService;
		
		public UserController() {
			
		}

		@GetMapping("/createaccount")
		public ModelAndView displayLogin() {
			final ModelAndView modelAndView = new ModelAndView("createaccount");
			modelAndView.addObject("message", "Hello");
			return modelAndView;
		}


		@PostMapping("/createaccount")
		public ModelAndView displayLogin(@RequestParam String username, @RequestParam String password) {
			final ModelAndView modelAndViewSuccess = new ModelAndView("home");
			modelAndViewSuccess.addObject("message", "Hello");

			final ModelAndView modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "Hello");

			LOGGER.info( (loginService == null ? "Null" : "not null"));
			
			LOGGER.info((loginService.check() ? "is true" : "yolo" ));
			
			if (username != null && password != null) {
				if (this.loginService.authenticateLogin(username.toLowerCase(), password)) {
					LoginController.LOGGER.info(username +  " exists!");
					return modelAndViewSuccess;
				}
			}

			return modelAndView;
		}
}
