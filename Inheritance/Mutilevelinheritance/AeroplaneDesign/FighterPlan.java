package AeroplaneDesign;

public class FighterPlan extends Aeroplane{
    int gen;
    int seat;
    int range;
    String type;
    String refuel;

    public FighterPlan(){

    }
    
    public FighterPlan(String brand,double price,int engines,int year,int fuelCap,
    int speed,int wt,int cap,int gen,int seat,int range,String type,String refuel){
        this.brand=brand;
        this.price=price;
        this.engines=engines;
        this.year=year;
        this.fuelCap=fuelCap;
        this.speed=speed;
        this.wt=wt;
        this.cap=cap;

        this.gen=gen;
        this.seat=seat;
        this.range=range;
        this.type=type;
        this.refuel=refuel;

    }
    public void displayFighterPlan(){
        System.out.println(gen);
        System.out.println(seat);
        System.out.println(range);
        System.out.println(type);
        System.out.println(refuel);
    }
}
