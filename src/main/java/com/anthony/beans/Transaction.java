/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
*/
package com.anthony.beans;

import java.text.MessageFormat;
import java.util.Calendar;

/**
 * The <strong>Transaction</strong> type.
 * 
 * <p>
 * Represents a single transaction. The <i><b>Transaction</i></b>
 * type is <b>immutable</b>.
 * </p>
 * 
 * @author 		Reapism
 * @since 		May 23, 2019
 */
public final class Transaction {

	private Customer customer;
	private Money amount;
	private Calendar date;
	private Account account;
	
	/**
	 * Default parameterized constructor.
	 * @param customer The customer the transaction is for.
	 */
	public Transaction(Customer customer, Money amount, Calendar date, Account account) {
		this.customer = customer;
		this.amount = amount;
		this.date = date;
		this.account = account;
	}
	
	public Transaction setCustomer(Customer customer) {
		return new Transaction(customer, this.amount, this.date, this.account);
	}
	
	public Transaction setAmount(Money amount) {
		return new Transaction(this.customer, amount, this.date, this.account);
	}
	
	public Transaction setDate(Calendar date) {
		return new Transaction(this.customer, this.amount, date, this.account);
	}
	
	public Transaction setAccount(Account account) {
		return new Transaction(this.customer, this.amount, this.date, account);
	}
	
	public Customer getCustomer() { return this.customer; }
	
	public Money getAmount() { return this.amount; }
	
	public Calendar getDate() { return this.date; }
	
	public Account getAccount() { return this.account; }
	
	public String toString() {
		return MessageFormat.format("Customer: {0}\nAccount: {1}\nAmount: {2}\nDate: {3}", getCustomer());		
	}
}
