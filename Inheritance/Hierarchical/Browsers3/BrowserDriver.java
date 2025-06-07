package Browsers3;

public class BrowserDriver {
    public static void main (String[]args){

        Safari safari = new Safari("Safari", "Apple", "WebKit", 19.2, true, "Google");
       GoogleChrome chrome = new GoogleChrome("Chrome", "Google", "Blink", 63.1, "Yes", true);
        Firefox firefox = new Firefox("Firefox", "Mozilla", "Gecko", 3.1, true, "Enhanced Tracking Protection");

        System.out.println("---- Safari Details ----");
        safari.displaySafari();

        System.out.println("\n---- Google Chrome Details ----");
        chrome.displayGoogleChrome();

        System.out.println("\n---- Firefox Details ----");
        firefox.displayFirefox();


    }


    
}
