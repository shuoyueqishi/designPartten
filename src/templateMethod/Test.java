package templateMethod;

public class Test {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('o');
        AbstractDisplay d2 = new StringDisplay("曾莹蓉，活泼可爱小仙女");
        AbstractDisplay d3 = new StringDisplay("许立涛，努力挣钱吧");
        AbstractDisplay d4 = new StringDisplay("This is my honorable day.");
        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}
