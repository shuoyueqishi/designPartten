package observer;


public class DigitalObserver implements IObserver {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitalObserver:"+generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
