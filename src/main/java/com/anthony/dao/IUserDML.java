/**
 * The integralspring project in the com.anthony.dao package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
*/
package com.anthony.dao;

import java.sql.Connection;

import org.springframework.stereotype.Component;

import com.anthony.beans.User;

/**
 * The <strong>IUserDML</strong> type.
 * 
 * <p>
 * Represents an user interface with methods that will
 * add, remove, update and search for a particular user
 * using DML for a given database.
 * </p>
 * 
 * @author 		ireap
 * @since 		Jun 23, 2019
 */
@Component
public interface IUserDML {

	Connection getConnection();
	boolean removeUser(String username);
	boolean addUser(String username, String password);
	User getUser(String username);
	boolean updateUser(String username, Object o);
	
}
