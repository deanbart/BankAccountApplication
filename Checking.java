package bankaccountapp;

public class Checking extends Account {
	// Checking-Account Properties
	int debitCardNumber; // 12 - digit number
	int debitCardPIN; // 4 digits

// Initialize Checking Account 
	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println(" Checking Account Features: " + " \n Debit Card Number: " + debitCardNumber
				+ "\n Debit Card PIN: " + debitCardPIN);
	}
}
