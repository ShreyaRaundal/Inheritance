package BANK1;
public class SavingAccount extends BankAccount {
	double balance;
	double interest;
	String type;

	public SavingAccount() {
	}

	public SavingAccount(String name, String ifsc, String bankName, long accno, int pin,
			String branch, long phno, double balance, double interest, String type) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.branch = branch;
		this.phno = phno;

		this.balance = balance;
		this.interest = interest;
		this.type = type;
	}

	public void displaySavingAccount() {
		displayBankAccount();
		System.out.println("Balance: ₹" + balance);
		System.out.println("Interest Rate: " + interest + "%");
		System.out.println("Account Type: " + type);
	}
}
