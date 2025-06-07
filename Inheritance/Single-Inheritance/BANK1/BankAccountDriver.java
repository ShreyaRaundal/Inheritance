package BANK1;
public class BankAccountDriver {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(
			"Shreya", "ICIC1233", "ICIC", 8189836475L,
			1234, "Deccan", 9457784933L, 5000, 0.3, "Savings Account"
		);

		s1.displayBankAccount();
		System.out.println("-------------------------------------------");
		s1.displaySavingAccount(); 
	}
}
