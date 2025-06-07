package Os;

public class OSDriver {
    public static void main(String[] args){
        Linux l1 = new Linux("Linux", "Linus Torvalds", "GPL", 2.3, "5.18", true);
        Windows w1 = new Windows("Windows", "Microsoft", "Proprietary", 76.5, "Windows 11", true);
        Unix u1 = new Unix("Unix", "Bell Labs", "Proprietary", 0.1, "System V", true);
        Mac m1 = new Mac("MacOS", "Apple", "Proprietary", 15.4, "Monterey", true);

        System.out.println("----------------------- Linux OS Details ----------------------------");
        l1.displayLinux();

        System.out.println("--------------------- Windows OS Details ---------------------------");
        w1.displayWindows();

        System.out.println("---------------------- Unix OS Details ------------------------------");
        u1.displayUnix();

        System.out.println("---------------------- Mac OS Details ------------------------------");
        m1.displayMac();
    }
}
