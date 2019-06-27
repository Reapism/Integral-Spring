/**
 * The integralspring project in the com.anthony.controller package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anthony.beans.DBProperties;

/**
 * The <strong>OracleDBController</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author ireap
 * @param <OracleDBController>
 * @since Jun 23, 2019
 */
@Controller
public class OracleDBController {

	@Autowired
	private DBProperties dbProps;

	@Autowired
	private DataSource oracleProps;

	public Connection getConnection() throws SQLException {
		return this.oracleProps.getConnection();
	}

	/**
	 * @return the dbProps autowired instance.
	 */
	public DBProperties getDBProperties() {
		return this.dbProps;
	}
}
