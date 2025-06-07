package Browsers3;

public class GoogleChrome extends Browser {
    String supportsExtensions;
    boolean crossPlatform;

    public GoogleChrome(String name, String developer, String engine, double marketShare,
                        String supportsExtensions, boolean crossPlatform) {
        this.name = name;
        this.developer = developer;
        this.engine = engine;
        this.marketShare = marketShare;

        this.supportsExtensions = supportsExtensions;
        this.crossPlatform = crossPlatform;
    }

    public void displayGoogleChrome() {
        displayBrowser();  
        System.out.println( supportsExtensions);
        System.out.println(crossPlatform);
    }
}
