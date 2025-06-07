package GooglePay;

public class UPIAccount {
    String upiId;
    String linkedBank;
    long mobileNumber;
    double balance;
    int pin;

    public UPIAccount() {}

    public UPIAccount(String upiId, String linkedBank, long mobileNumber, double balance, int pin) {
        this.upiId = upiId;
        this.linkedBank = linkedBank;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void sendMoney(String toUpi, double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Sent " + amount + " to " + toUpi);
        } else {
            System.out.println("Insufficient balance to send " + amount);
        }
    }

    public void receiveMoney(double amount) {
        balance += amount;
        System.out.println("Received " + amount);
    }

    public void displayUPIAccount() {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Linked Bank: " + linkedBank);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}