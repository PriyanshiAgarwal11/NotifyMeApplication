package Observer;

public class WhatsappMessage implements Observer{
    @Override
    public void update(String productName) {
        System.out.println(productName + " is back in stock. You received this whatsapp text because you subscribed for it.");
    }
}
