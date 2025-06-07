package AeroplaneDesign;

public class Sukhoi extends FighterPlan {
    String model;
    int serviceYear;
    String weapons;
    String country;
    String service;

    public Sukhoi() {}

    public Sukhoi(String brand, double price, int engines, int year, int fuelCap,
                  int speed, int wt, int cap, int gen, int seat, int range,
                  String type, String refuel, String model, int serviceYear,
                  String weapons, String country, String service) {

        // Superclass fields (from Aeroplane)
        this.brand = brand;
        this.price = price;
        this.engines = engines;
        this.year = year;
        this.fuelCap = fuelCap;
        this.speed = speed;
        this.wt = wt;
        this.cap = cap;

        // FighterPlan fields
        this.gen = gen;
        this.seat = seat;
        this.range = range;
        this.type = type;
        this.refuel = refuel;

        // Sukhoi-specific fields
        this.model = model;
        this.serviceYear = serviceYear;
        this.weapons = weapons;
        this.country = country;
        this.service = service;
    }

    public void displaySukhoi() {
        System.out.println( model);
        System.out.println(serviceYear);
        System.out.println( weapons);
        System.out.println(country);
        System.out.println(service);
    }
}
