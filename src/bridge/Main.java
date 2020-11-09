package bridge;

public class Main {
    public static void main(String[] args) {
        Display d1=new Display(new StringDisplayImpl("曾莹蓉，你好吗？"));
        Display d2=new CountDisplay(new StringDisplayImpl("I am fine"));
        CountDisplay d3=new CountDisplay(new StringDisplayImpl("ThinkBook 15p"));
        d1.display();
        d2.display();
        d3.multiDisplay(6);
    }
}
