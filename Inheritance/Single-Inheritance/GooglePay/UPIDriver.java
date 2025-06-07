package GooglePay;

public class UPIDriver {
    public static void main(String[] args) {
        GooglePayAccount gpay = new GooglePayAccount(
            "shreya@okicici", "ICICI Bank", 9876543210L, 10000.0, 1234, "ShreyaRaundal"
        );

        gpay.displayGooglePayDetails();
        System.out.println("--------------------------------");

        gpay.scanAndPay("QRICICI123", 1500);
        gpay.receiveMoney(500); // someone sends money
        gpay.checkBalance();
        System.out.println("--------------------------------");

        gpay.displayGooglePayDetails();
    }
}
