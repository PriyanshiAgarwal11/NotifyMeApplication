package Observer;

import Observer.Observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String productName) {
        System.out.println(productName + " is back in stock. You received this email because you subscribe for it.");
    }
}
