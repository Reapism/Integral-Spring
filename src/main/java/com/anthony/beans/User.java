/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.beans;

import java.text.MessageFormat;
import java.util.Date;

/**
 * The <strong>User</strong> type.
 * <p>
 * Represents a User in the banking context. Every User has an first and last
 * name, a birthdate, and email.
 * </p>
 * 
 * @author Reapism
 * @since May 11, 2019
 */


public class User {

	private String birthDate;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private char userRole;
	private String username;

	/**
	 * Instantiates a null user.
	 */
	public User() {
		this("null","null","null","null","null","null",'C');
	}
	
	/**
	 * Parameterized constructor.
	 * Creates a user with all of its attributes initialized.
	 * <p><b>Note:</b> Password is not part of the user object, its 
	 * only stored in the DB for security.
	 * </p>
	 */
	public User(String firstName, String lastName, String username, String email, String birthDate, String phone, char userRole) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.birthDate = birthDate;
		this.phone = phone;
		this.userRole = userRole;
	}
	
	/**
	 * @return the username.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return this.birthDate;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @return the phone.
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * @return the user_role.
	 */
	public char getUserRole() {
		return this.userRole;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(final String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param phone the phone to set.
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}

	/**
	 * @param user_role the user_role to set.
	 */
	public void setUserRole(final char userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return MessageFormat.format("FirstName: {0}, LastName: {1}," + " Birthdate: {2}, Email: {3}", getFirstName(),
				getLastName(), getBirthDate().toString());
	}
}
