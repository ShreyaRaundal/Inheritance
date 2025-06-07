package Os;

public class Unix extends OperatingSystem{
    String variant;
    boolean multiUser;

    public Unix(String name ,String developer,String licenseType,double marketShare,
    String varient,boolean multiUser){
        this.name = name;
        this.developer = developer;
        this.licenseType=licenseType;
        this.marketShare=marketShare;

        this.variant = varient;
        this.multiUser = multiUser;

    }

    public void displayUnix() {
        displayOperatingSystem();
        System.out.println(variant);
        System.out.println(multiUser);
    }
    
}
