package Browsers3;

public class Safari extends Browser{
    boolean isAppleExclusive;
    String defaultSearchEngine;

    public Safari(){}

    Safari(String name,String developer,String engine,double marketShare,
    boolean isAppleExclusive,String defaultSearchEngine){

        this.name=name;
        this.developer=developer;
        this.engine=engine;
        this.marketShare=marketShare;

        this.isAppleExclusive=isAppleExclusive;
        this.defaultSearchEngine=defaultSearchEngine;

    }
    public void displaySafari(){
        System.out.println(isAppleExclusive);
        System.out.println(defaultSearchEngine);
    }
    
}
