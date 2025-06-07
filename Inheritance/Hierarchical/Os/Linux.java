package Os;

public  class Linux extends OperatingSystem {
    String kernerVersion;
    boolean openSource;

    public Linux(){}

    Linux(String name, String developer, String licenseType, double marketShare,String kernerVersion,boolean openSource ){
        this.name = name;
        this.developer = developer;
        this.licenseType = licenseType;
        this.marketShare = marketShare; 

        this.kernerVersion=kernerVersion;
        this.openSource=openSource;

    }
    public void displayLinux(){
        displayOperatingSystem();
        System.out.println(kernerVersion);
        System.out.println(openSource);
        

    }
    
}
