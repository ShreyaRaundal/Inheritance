package FoodDeliveryApp;

public class SwiggyOrder {
    String userName;
    String deliveryPartnerName;
    String couponCode;
    double finalAmount;

    public SwiggyOrder(){
    
    }

    public SwiggyOrder(String resturantName,String location,int deliveryTime,String foodItem,double price,String userName,String deliveryPartnerName,String couponCode,int finalAmount){

        super(resturantName, location,deliveryTime,foodItem,price);
        this.userName=userName;
        this.deliveryPartnerName=deliveryPartnerName;
        this.couponCode:"None";
        this.finalAmount=finalAmount;

    }
    public void applyCoupon(String code){
        this.couponCode=code;
        if(code.equalsIgnoreCase("Fist50"));
        finalAmount.cast();
        else 
    }
}

