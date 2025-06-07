package Os;

public class Mac extends OperatingSystem {
    String osCodename;
    boolean supportsRetine;

    public Mac(){}

    Mac(String name, String developer,String licenseType,double marketShare,String osCodename,boolean supportsRetine){
        this.name = name;
        this.developer = developer;
        this.licenseType = licenseType;
        this.marketShare = marketShare;

        this.osCodename = osCodename;
        this. supportsRetine = supportsRetine;
    }
    public void displayMac(){
        displayOperatingSystem();
        System.out.println(osCodename);
        System.out.println(supportsRetine);
    }
    
}
