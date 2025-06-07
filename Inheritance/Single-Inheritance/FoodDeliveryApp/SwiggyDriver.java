package FoodDeliveryApp;

public class SwiggyDriver {
    public static void main(String[] args) {
        SwiggyOrder order = new SwiggyOrder(
            "Domino's Pizza", "MG Road, Pune", 30, "Margherita Pizza", 300,
            "Shreya Raundal", "Ravi Kumar"
        );

        order.trackOrder();
        System.out.println("-----------------------------------");
        order.applyCoupon("FIRST50");
        order.displaySwiggyOrderDetails();
        System.out.println("-----------------------------------");
        order.completeOrder();
    }
    
}
