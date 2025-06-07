package Browsers3;

public class Browser {

    String name;
    String developer;
    String engine;
    double marketShare;

    public Browser(){}

    Browser(String name,String developer,String engine,double marketShare){
        this.name=name;
        this.developer=developer;
        this.engine=engine;
        this.marketShare=marketShare;
    }
    public void displayBrowser(){
        System.out.println(name);
        System.out.println(developer);
        System.out.println(engine);
        System.out.println(marketShare);
    }
    
}
