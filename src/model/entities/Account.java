package model.entities;

import model.exception.BalanceErrorException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {}

	public Account( Integer number, String holder, Double balance, Double withdrawLimit) throws BalanceErrorException {
		this.number = number;
		this.holder = holder;
		if ( balance < 0.0 ) {
			throw new BalanceErrorException("Error: invalid balance amount");
		} else {
			this.balance = balance;
		}
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit( Double amount )  throws BalanceErrorException {
		if ( amount < 0.0 ) {
			throw new BalanceErrorException(holder);
		}
	}
	
	
	

}
