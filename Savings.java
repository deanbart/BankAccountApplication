package bankaccountapp;

public class Savings extends Account {
	// Savings Account Properties
	private int safetyDepositBoxID; // 3 digit
	private int safetyDepositBoxKey;

	// Constructor to Initialize Savings Account
	public Savings(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println(" Savings Account Features: " + "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
}
