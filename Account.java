package bankaccountapp;

public abstract class Account implements IBaseRate {
	// Common properties for Savings and Checking accounts
	String name;
	String SSN;
	double balance;

	// Account Number:last two digits of SSN, unique 5 digits, random 3 digit
	protected String accountNumber;

	protected double rate;
	static int index = 10000; /// used to generate acc number

	// Constructor to set Base properties + initialize account
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		balance = initDeposit;

		// Set Account Number
		index++;
		this.accountNumber = setAccountNumber();

		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {

		String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;

	}
	
	public void compound() {
		double accruedInterest = balance * (rate / 100);
		System.out.println("Accrued Interest: $" + accruedInterest);
		
	}

	// Account Transactions
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		showBalance();
	}

	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		showBalance();
	}

	public void transfer(String transferLocation, double amount) {
		balance -= amount;
		System.out.println("Transferring $" + amount + " to " + transferLocation);
		showBalance();
	}

	public void showBalance() {
		System.out.println("Your balance is $" + balance);
	}

	public void showInfo() {
		System.out.println("\n Name: " + name + "\n Account Number: " + accountNumber + "\n Balance:" + balance
				+ "\n Rate: " + rate + "%");
	}
}
