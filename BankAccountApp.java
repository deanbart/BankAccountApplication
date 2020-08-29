package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Dean\\Downloads\\NewBankAccounts.csv"; //CSV location
	
	// Read a CSV and create new accounts based on that data
		List<Account> accounts = new LinkedList<Account>();
		LinkedList<String[]> newAccountHolders = utilities.CSV.read(filePath);
		
		for(String[] accountHolder : newAccountHolders) {
			System.out.println("New Account");
			String name = accountHolder[0];
			String SSN= accountHolder[1];
			String accountType= accountHolder[2];
			double initialDeposit =  Double.parseDouble(accountHolder[3]);
			System.out.println(name + " " + SSN + " " + "" + accountType + " " + " $" + initialDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,SSN,initialDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,SSN,initialDeposit));
			}
			else {
				System.out.println("Was unable to determine the account type!");
			}
			
			
			
			for(Account acc: accounts) {
				System.out.println("\n*******************************************");
				acc.showInfo();
			}
			
			
		}
}
}