/**
 * The IntegralBanking project in the com.anthony.beans package.
 *
 * @author Anthony Jaghab, (c) Quintrix Training, all rights reserved.
*/
package com.anthony.beans;

/**
 * The <strong>CheckingAccount</strong> type.
 * 
 * <p>
 * Represents a checking account type.
 * Inherits from <i>Account</i>. 
 * </p>
 * 
 * @author 		Reapism
 * @since 		May 15, 2019
 * @see Account
 */
public class CheckingAccount extends Account {

	/** TODO This method does something.
	 * <p>
	 * Overrides the @see com.integral.beans.Account#deposit(com.integral.beans.Money).
	 * </p>
	 * @return		The return.
	 * @see         If needed.
	 */
	@Override
	public boolean deposit(Money amount) {
		Money newMoney = this.balance.minus(amount);
		if (amount.isMinus() && newMoney.isPlus()) {
			this.balance = newMoney;
			return true;
		} else {
			return false;
		}
	}

	/** TODO This method does something.
	 * <p>
	 * Overrides the @see com.integral.beans.Account#withdraw(com.integral.beans.Money).
	 * </p>
	 * @return		The return.
	 * @see         If needed.
	 */
	@Override
	public boolean withdraw(Money amount) {
		Money newMoney = this.balance.minus(amount);
		if (amount.isMinus() && newMoney.isPlus()) {
			this.balance = newMoney;
			return true;
		} else {
			return false;
		}
	}

}
