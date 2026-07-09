package behavior.observer;

import java.util.Observer;

public class InventoryObserver implements OrderObserver {


    @Override
    public void update(String order) {
        //TODO inventory management logic here for this order
        System.out.println("Inventory has been update for this Order:" + order);
    }
}
