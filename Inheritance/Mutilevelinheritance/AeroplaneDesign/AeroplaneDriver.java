package AeroplaneDesign;

public class AeroplaneDriver {
      public static void main(String[] args) {
        Sukhoi s1 = new Sukhoi(
            "Sukhoi", 250000000, 2, 2015, 12000, 2500, 18000, 1,
            5, 1, 3000, "Jet", "Air-to-Air", "Su-35", 2020,
            "Missiles, Bombs", "Russia", "Indian Air Force"
        );

        s1.displaySukhoi();

      }
}
