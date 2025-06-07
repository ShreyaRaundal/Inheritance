package Browsers3;

public class Firefox extends Browser{
    boolean openSource;
    String securityMode;

    public Firefox(String name,String developer,String engine,double marketShare,boolean openSource,String securityMode){
        this.name=name;
        this.developer=developer;
        this.engine = engine;
       this.marketShare=marketShare;

        this.openSource=openSource;
        this.securityMode=securityMode;
    }
     public void displayFirefox() {
        displayBrowser();
        System.out.println("Open Source: " + openSource);
        System.out.println("Security Mode: " + securityMode);
    }
    
}
