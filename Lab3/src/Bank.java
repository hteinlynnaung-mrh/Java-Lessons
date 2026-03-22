
public class Bank {
	
	private String accountName;
	private double balance;
	
	public void setAccountName(String name) {
		this.accountName = name;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void showInfo() {
		System.out.println("Account Name: " + accountName);
		System.out.println("Balance: " + balance + " Baht ");
	}
	
}
