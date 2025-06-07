package BANK1;
public class BankAccount {
	String name;
	String ifsc;
	String bankName;
	long accno;
	int pin;
	String branch;
	long phno;

	public BankAccount() {
	}

	public BankAccount(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.branch = branch;
		this.phno = phno;
	}

	public void displayBankAccount() {
		System.out.println("Name: " + name);
		System.out.println("IFSC: " + ifsc);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account No: " + accno);
		System.out.println("Branch: " + branch);
		System.out.println("Phone: " + phno);
	}
}
