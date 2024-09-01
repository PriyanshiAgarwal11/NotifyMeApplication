package Observer;

import Observer.Observer;

public class ApplicationObserver implements Observer {
    @Override
    public void update(String productName) {
        System.out.println(productName + " is back in stock. You received this notification because you asked for it.");
    }
}
