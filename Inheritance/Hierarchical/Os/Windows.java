package Os;

public class Windows extends OperatingSystem {
    String latestVersion;
    boolean supportsDirectX;

    public Windows(String name, String developer, String licenseType, double marketShare,
                   String latestVersion, boolean supportsDirectX) {
        
        this.name = name;
        this.developer = developer;
        this.licenseType = licenseType;
        this.marketShare = marketShare;

        this.latestVersion = latestVersion;
        this.supportsDirectX = supportsDirectX;
    }

    public void displayWindows() {
        displayOperatingSystem();
        System.out.println(latestVersion);
        System.out.println(supportsDirectX);
    }
}
