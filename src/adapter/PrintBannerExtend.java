package adapter;

public class PrintBannerExtend implements Print {
    private Banner banner;
    public PrintBannerExtend(String str) {
        this.banner = new Banner(str);
    }
    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
