/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
*/
package com.anthony.beans;

import java.util.HashMap;

/**
 * The <strong>Statement</strong> type.
 * 
 * <p>
 * Description
 * </p>
 * 
 * @author 		Reapism
 * @since 		May 25, 2019
 */
public class Statement {

	public enum Month {
		JAN,
		FEB,
		MAR,
		APR,
		MAY,
		JUN,
		JUL,
		AUG,
		SEP,
		OCT,
		NOV,
		DEC,
	}
	
	private long accountNumber;
	private Customer customer;
	private HashMap<Integer,Transaction> transactions;
	private Integer year;
	private Month month;
	
	public Statement() {
		
	}
	
	public Statement generateStatement() {
		
		
		
		
		return this;
	}
	
}
