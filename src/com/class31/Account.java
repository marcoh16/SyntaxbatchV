package com.class31;

//way to hide data by making it private
public class Account {
	private long accountNumber;
	private double balance;
	
	//getters give read only access
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	//setter -give write only access
	public void setBalance(int amount) {
		if (amount>0) {
			balance=balance+amount;
		}
	}
	public void setAccountNUmber(long accountNumber) {
		if (String.valueOf(accountNumber).length()==9) {
			this.accountNumber = accountNumber;
		}
	}
	
}
