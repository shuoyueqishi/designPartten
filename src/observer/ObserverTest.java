package observer;

public class ObserverTest {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        IObserver observer1=new DigitalObserver();
        IObserver observer2=new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
