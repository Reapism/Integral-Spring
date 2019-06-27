/**
 * The IntegralBanking project in the com.anthony.business package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.beans;

import java.util.ArrayList;

/**
 * The <strong>Customer</strong> type.
 * <p>
 * Extends the abstract class <i>PersonInfo</i>.
 * </p>
 * 
 * @author Reapism
 * @since May 14, 2019
 * @see User
 */
public class Customer extends User {

	private long id;    
	private ArrayList<Account> accounts;
	private int numOfAccounts;

	public Customer() {
		this.accounts = new ArrayList<Account>();
		this.numOfAccounts = 0;
	}

	public Customer(Account... accounts) {
		this.accounts = new ArrayList<Account>();

		for (Account a : accounts) {
			this.accounts.add(a);
			this.numOfAccounts++;
		}
	}

	public long getCustomerId() {
		return id;
	}	
	
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() + " has " + numOfAccounts + " of accounts.";
	}
}
