package behavior.observer;

import java.util.Observer;

public class SmsObserver implements OrderObserver {

    @Override
    public void update(String order) {
        //TODO add sms creation logic here
        System.out.println("Sms has sent for this Order:" + order);
    }
}
