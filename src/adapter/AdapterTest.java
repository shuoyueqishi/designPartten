package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Print print=new PrintBanner("this is new adapter");
        print.printWeak();
        print.printStrong();
        PrintBannerExtend printBannerExtend = new PrintBannerExtend("This woman is so dull");
        printBannerExtend.printWeak();
        printBannerExtend.printStrong();
    }
}
