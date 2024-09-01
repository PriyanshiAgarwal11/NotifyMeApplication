import Observable.Iphone;
import Observer.ApplicationObserver;
import Observer.EmailObserver;
import Observer.WhatsappMessage;

public class NotifyMeApplication {
    public static void main(String args[]) {

        Iphone iphone = new Iphone();
        iphone.add(new EmailObserver());
        iphone.add(new WhatsappMessage());
        iphone.add(new ApplicationObserver());



        iphone.setStockCount(10);
        iphone.setStockCount(0);
        iphone.setStockCount(20);
    }
}
