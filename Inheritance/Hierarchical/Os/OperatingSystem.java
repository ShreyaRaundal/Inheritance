package Os;

public class OperatingSystem {
    String name;
    String developer;
    String licenseType;
    double marketShare;

    public OperatingSystem() {
        
    }

    public OperatingSystem(String name, String developer, String licenseType, double marketShare) {
        this.name = name;
        this.developer = developer;
        this.licenseType = licenseType;
        this.marketShare = marketShare;
    }

    public void displayOperatingSystem() {
        System.out.println(name);
        System.out.println( developer);
        System.out.println(licenseType);
        System.out.println(marketShare);
    }
}
