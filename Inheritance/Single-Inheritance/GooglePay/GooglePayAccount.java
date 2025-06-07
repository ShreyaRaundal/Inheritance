package GooglePay;

public class GooglePayAccount extends UPIAccount {
    int rewardsPoints;
    int transactionsCount;
    String gpayUserName;

    public GooglePayAccount() {}

    public GooglePayAccount(String upiId, String linkedBank, long mobileNumber,
                            double balance, int pin, String gpayUserName) {
        super(upiId, linkedBank, mobileNumber, balance, pin);
        this.rewardsPoints = 0;
        this.transactionsCount = 0;
        this.gpayUserName = gpayUserName;
    }

    public void scanAndPay(String qrCode, double amount) {
        System.out.println(gpayUserName + " scanning QR: " + qrCode);
        sendMoney("QR:" + qrCode, amount);
        transactionsCount++;
        earnReward();
    }

    public void earnReward() {
        rewardsPoints += 10; // Simple reward logic
        System.out.println("Reward earned! Total points: " + rewardsPoints);
    }

    public void displayGooglePayDetails() {
        displayUPIAccount(); // Parent details
        System.out.println("Google Pay Username: " + gpayUserName);
        System.out.println("Transactions Done: " + transactionsCount);
        System.out.println("Reward Points: " + rewardsPoints);
        System.out.println("Available Balance: " + balance);
    }
}
