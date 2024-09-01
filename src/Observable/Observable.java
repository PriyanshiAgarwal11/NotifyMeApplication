package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {


    public void add(Observer observer);
    public void remove(Observer observer);
    public void setStockCount(int count);
    public void notifyObservers(List<Observer> observerList);
}
