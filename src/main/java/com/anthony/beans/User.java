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

	private Date birthDate;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private char user_role;


	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
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
	public char getUser_role() {
		return this.user_role;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(final Date birthDate) {
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
	public void setUser_role(final char user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return MessageFormat.format("FirstName: {0}, LastName: {1}," + " Birthdate: {2}, Email: {3}", getFirstName(),
				getLastName(), getBirthDate().toString());
	}
}
