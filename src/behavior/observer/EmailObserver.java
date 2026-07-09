package behavior.observer;

public class EmailObserver implements OrderObserver {
    @Override
    public void update(String order) {
        //TODO add email logic here
        System.out.println("Email has sent for this Order:" + order);
    }
}
