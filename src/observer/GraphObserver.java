package observer;

public class GraphObserver implements IObserver {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int cnt=generator.getNumber();
        for (int i=0;i<cnt;i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
