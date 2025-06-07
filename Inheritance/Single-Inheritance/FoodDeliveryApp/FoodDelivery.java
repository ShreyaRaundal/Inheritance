package FoodDeliveryApp;

public class FoodDelivery {
    String restaurantName;
    String location;
    int deliveryTime;
    String foodItem;
    double price;

    public FoodDelivery(){

    }

    public FoodDelivery(String resturantName,String location,int deliveryTime,String foodItem,double price){
        this.restaurantName=resturantName;
        this.location=location;
        this.deliveryTime = deliveryTime;
        this.foodItem = foodItem;
        this.price=price;

    }

    public void trackOrder(){
        System.out.println("Your order from "+restaurantName+"is on the way");
    }

    public void displayOrderDeatil(){
        System.out.println("Resturant :"+restaurantName);
        System.out.println("Delivary Location :"+location);
        System.out.println("Food Item :"+foodItem);
        System.out.println("Price : "+price);
    }
    
}
