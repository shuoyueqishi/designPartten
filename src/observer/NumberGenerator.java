package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            IObserver observer = (IObserver) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
