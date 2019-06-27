/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
 */
package com.anthony.beans;

/**
 * The <strong>SavingsAccount</strong> type.
 * <p>
 * Description
 * </p>
 * 
 * @author Reapism
 * @since May 15, 2019
 */
public class SavingsAccount extends Account {

	private byte numTransPerMth;

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see
	 * com.integral.beans.Account#deposit(com.integral.beans.Money).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public boolean deposit(final Money amount) {
		final Money newMoney = this.balance.minus(amount);
		if (amount.isMinus() && newMoney.isPlus()) {
			this.balance = newMoney;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the number of transactions per month.
	 */
	public byte getNumTransPerMth() {
		return this.numTransPerMth;
	}

	/**
	 * the number of transactions per month to set.
	 */
	public void setNumTransPerMth(final byte numTransPerMth) {
		this.numTransPerMth = numTransPerMth;
	}

	/**
	 * TODO This method does something.
	 * <p>
	 * Overrides the @see
	 * com.integral.beans.Account#withdraw(com.integral.beans.Money).
	 * </p>
	 * 
	 * @return The return.
	 * @see If needed.
	 */
	@Override
	public boolean withdraw(final Money amount) {
		final Money newMoney = this.balance.minus(amount);
		if (amount.isMinus() && newMoney.isPlus()) {
			this.balance = newMoney;
			return true;
		} else {
			return false;
		}
	}

}
