package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	
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
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
