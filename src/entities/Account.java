package entities;

import exceptions.InsufficientFundsException;
import exceptions.WithdrawalLimitExceededException;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		//deposit(initialDeposit);
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
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
	
	/* não é permitido - deve-se usar deposit()
	public double setBalance() {
		return balance;
	}
	*/
	
	public Double getWithdrawLimit() {
		return this.withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawalLimitExceededException, InsufficientFundsException {
		if (balance < amount) {
			throw new InsufficientFundsException("Not enough balance");
		}
		
		if (withdrawLimit < amount) {
			throw new WithdrawalLimitExceededException(" The amount exceeds withdrawal limit");
		} 
		
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance)
				+ ", Withdraw Limit: $ "
				+ String.format("%.2f", withdrawLimit);
	}
}
