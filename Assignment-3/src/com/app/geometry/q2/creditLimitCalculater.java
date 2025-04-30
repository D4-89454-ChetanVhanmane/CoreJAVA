package com.app.geometry.q2;
//2) (Credit Limit Calculator)
//Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a
//charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this
//month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate
//the new balance (= beginning balance+ charges – credits),
//display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose
//credit limit is exceeded, the program should display
//the message "Credit limit exceeded".
public class creditLimitCalculater {
	private int accountNumber;
	private int balance;
	private int itemCharged;
	private int credAppliedToCust;
	private int creditLimit;
	
	
	public creditLimitCalculater(int accountNumber, int balance, int itemCharged, int credAppliedToCust, int creditLimit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.itemCharged = itemCharged;
		this.credAppliedToCust = credAppliedToCust;
		this.creditLimit = creditLimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getItemCharged() {
		return itemCharged;
	}
	public void setItemCharged(int itemCharged) {
		this.itemCharged = itemCharged;
	}
	public int getCredAppliedToCust() {
		return credAppliedToCust;
	}
	public void setCredAppliedToCust(int credAppliedToCust) {
		this.credAppliedToCust = credAppliedToCust;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
}
