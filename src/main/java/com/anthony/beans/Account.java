/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.beans;

import java.math.BigDecimal;

/**
 * The <strong>Account</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author Reapism
 * @since May 14, 2019
 */
public abstract class Account {

	protected long accountNumber;
	protected Money balance;

	/**
	 * Default constructor.
	 */

	Account() {
		this(0, new Money(BigDecimal.ZERO));
	}

	Account(long accountNumber, Money startingBalance) {
		this.setAccountNumber(accountNumber);
		this.setBalance(startingBalance);
	}

	/**
	 * @return the accountNumber.
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set.
	 */
	protected void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the balance.
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set.
	 */
	protected void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public abstract boolean deposit(Money amount);

	public abstract boolean withdraw(Money amount);

}
