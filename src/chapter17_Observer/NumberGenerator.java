package chapter17_Observer;

import java.util.ArrayList;
import java.util.Iterator;

/** 수를 생성하는 오브젝트를 나타내는 클래스 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        Iterator it = observers.iterator();

        while (it.hasNext()) {
            Observer o = (Observer) it.next();

            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
