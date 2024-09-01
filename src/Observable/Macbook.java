package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Macbook implements Observable{

    int stockCount = 0;
    List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    public void setStockCount(int count) {
        if(this.stockCount == 0)
            notifyObservers(observerList);
        this.stockCount = count;
    }

    public void notifyObservers(List<Observer> observerList){
        for(Observer observer : observerList) {
            observer.update("Macbook");
        }
    }
}
